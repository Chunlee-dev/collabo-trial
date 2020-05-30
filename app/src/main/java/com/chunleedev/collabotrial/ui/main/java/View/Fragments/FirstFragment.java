package com.chunleedev.collabotrial.ui.main.java.View.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chunleedev.collabotrial.databinding.FirstFragmentBinding;
import com.chunleedev.collabotrial.ui.main.java.View.Adapters.PostAdapter;
import com.chunleedev.collabotrial.ui.main.java.ViewModel.FirstViewModel;

public class FirstFragment extends Fragment {

    private FirstFragmentBinding fragmentBinding;
    private RecyclerView recyclerView;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentBinding = FirstFragmentBinding.inflate(inflater, container, false);
        return fragmentBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = fragmentBinding.list;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FirstViewModel mViewModel = new ViewModelProvider(this).get(FirstViewModel.class);
        mViewModel.getList().observe(getViewLifecycleOwner(),
                list1 -> recyclerView.setAdapter(new PostAdapter(list1, getContext())));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        fragmentBinding = null;
    }
}