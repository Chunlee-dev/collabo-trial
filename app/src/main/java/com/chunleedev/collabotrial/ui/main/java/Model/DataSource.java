package com.chunleedev.collabotrial.ui.main.java.Model;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

public class DataSource {

    private static DataSource instance;

    private DataSource() {
    }

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

    public MutableLiveData<ArrayList<DataModel>> getPosts() {
        MutableLiveData<ArrayList<DataModel>> mutableList = new MutableLiveData<>();

        ArrayList<DataModel> list = new ArrayList<>();

        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));
        list.add(new DataModel("https://tinyurl.com/y8jfef9g", "Android Orientation", "Shows you how to stop your activity from recreating on orientation change"));

        mutableList.setValue(list);

        return mutableList;
    }
}
