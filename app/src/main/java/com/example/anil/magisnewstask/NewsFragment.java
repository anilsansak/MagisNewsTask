package com.example.anil.magisnewstask;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NewsFragment extends Fragment {

    private final String TAG = NewsFragment.class.getSimpleName();
    RecyclerView recyclerView;
    private ApiClient apiClient;

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
        recyclerView = getActivity().findViewById(R.id.recycler_view_news);
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
                   //List<NewsList> newsLists =response.body().getNewsResponse().getNewsList();
                   // recyclerView.setAdapter(new NewsAdapter(newsLists, getContext(), R.layout.item_list_news));
                }


            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }


        });
    }

}