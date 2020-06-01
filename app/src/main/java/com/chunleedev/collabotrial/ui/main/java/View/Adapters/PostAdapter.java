package com.chunleedev.collabotrial.ui.main.java.View.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.chunleedev.collabotrial.R;
import com.chunleedev.collabotrial.databinding.FirstFragmentAdapterBinding;
import com.chunleedev.collabotrial.ui.main.java.Model.DataModel;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {

    private ArrayList<DataModel> list;
    private Context context;

    public PostAdapter(ArrayList<DataModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        FirstFragmentAdapterBinding fragmentAdapterBinding = FirstFragmentAdapterBinding.inflate(inflater, parent, false);
        return new PostHolder(fragmentAdapterBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, int position) {
        DataModel currentModel = list.get(position);
        if (currentModel != null) {
            holder.bind(currentModel);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class PostHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;
        ImageView photo;

        PostHolder(FirstFragmentAdapterBinding fragmentAdapterBinding) {
            super(fragmentAdapterBinding.getRoot());

            title = fragmentAdapterBinding.title;
            description = fragmentAdapterBinding.description;
            photo = fragmentAdapterBinding.photo;

        }

        void bind(DataModel model) {
            title.setText(model.getTitle());
            description.setText(model.getDescription());
            Glide
                    .with(context)
                    .load(model.getImageUrl())
                    .centerCrop()
                    .placeholder(R.color.colorPrimary)
                    .into(photo);
        }

    }

}
