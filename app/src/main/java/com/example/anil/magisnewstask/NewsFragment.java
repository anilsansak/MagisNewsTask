package com.example.anil.magisnewstask;


import android.content.res.Resources;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NewsFragment extends Fragment {

    private final String TAG = NewsFragment.class.getSimpleName();
    RecyclerView recyclerView;

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
        recyclerView = view.findViewById(R.id.recycler_view_news);
        // Inflate the layout for this fragment


        getNewsList();
        return view;
    }


    private void getNewsList() {
        Api apiService = ApiClient.getClient().create(Api.class);

        Call<News> call = apiService.getNewsList();
        call.enqueue(new Callback<News>() {

            @Override
            public void onResponse(Call<News> call, Response<News> response) {


                if (response.body() != null){
                   ArrayList<NewsList> newsLists = (ArrayList<NewsList>) response.body().getNewsResponse().getNewsList();

                   NewsAdapter adapter = new NewsAdapter(newsLists, getContext());
                   RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
                   recyclerView.setLayoutManager(layoutManager);
                   recyclerView.setItemAnimator(new DefaultItemAnimator());
                   recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
                   recyclerView.setAdapter(adapter);
                }


            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }


        });
    }

}