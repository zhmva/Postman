package com.example.postman;

import android.app.Application;

import com.example.postman.data.remote.PostApi;
import com.example.postman.data.remote.RetrofitClient;

public class App extends Application {

    private RetrofitClient retrofitClient;
    public static PostApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api = retrofitClient.provideApi();
    }
}
