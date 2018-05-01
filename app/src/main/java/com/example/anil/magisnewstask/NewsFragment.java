package com.example.anil.magisnewstask;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class NewsFragment extends Fragment {


    public NewsFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);
        // Inflate the layout for this fragment
        getNewsList();
        return view;
    }

    private void getNewsList() {
        Api apiService = ApiClient.getClient().create(Api.class);

        Call<Response> call = apiService.getNewsList();
        call.enqueue(new Callback<Response>() {

            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

                if (response.body() != null){
                    List<NewsList> newsLists = response.body().getNewsList();
                }

            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }

}