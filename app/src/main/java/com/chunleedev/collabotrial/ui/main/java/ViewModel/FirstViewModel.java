package com.chunleedev.collabotrial.ui.main.java.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.chunleedev.collabotrial.ui.main.java.Model.DataModel;
import com.chunleedev.collabotrial.ui.main.java.Model.DataSource;

import java.util.ArrayList;

public class FirstViewModel extends ViewModel {

    private MutableLiveData<ArrayList<DataModel>> mutableLiveData;
    private DataSource dataSource;

    public FirstViewModel(){
        dataSource = DataSource.getInstance();
    }

    public LiveData<ArrayList<DataModel>> getList(){
        if (mutableLiveData == null){
            mutableLiveData = dataSource.getPosts();
        }
        return mutableLiveData;
    }
}