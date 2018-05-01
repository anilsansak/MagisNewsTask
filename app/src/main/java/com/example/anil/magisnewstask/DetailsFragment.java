package com.example.anil.magisnewstask;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DetailsFragment extends Fragment {


    LinearLayout linearLayout;
    TextView textTitle;
    TextView textSubtext;
    TextView textDetails;
    ImageView imageView;

    public DetailsFragment() {
        // Required empty public constructor
    }


    public static DetailsFragment newInstance(String param1, String param2) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        linearLayout = view.findViewById(R.id.linear_layout);
        textTitle = view.findViewById(R.id.text_title);
        textSubtext = view.findViewById(R.id.text_subtext);
        textDetails = view.findViewById(R.id.text_details);
        imageView = view.findViewById(R.id.image_view);

        Bundle bundle = getArguments();
        if(bundle != null){
            int id = bundle.getInt("id");
            getNewsDetails(id);
        }

        return view;
    }

    private void getNewsDetails(final int id) {
        Api apiService = ApiClient.getClient().create(Api.class);

        Call<NewsDetails> call = apiService.getNewsDetails(id);
        call.enqueue(new Callback<NewsDetails>() {

            @Override
            public void onResponse(Call<NewsDetails> call, Response<NewsDetails> response) {
               textDetails.setText(response.body().getResponse().getNews().getTitle());
               textSubtext.setText(response.body().getResponse().getNews().getSubTitle());
               textDetails.setText(response.body().getResponse().getNews().getDescription());
                Glide.with(getContext()).load(response.body().getResponse().getNews().getImage()).into(imageView);
            }

            @Override
            public void onFailure(Call<NewsDetails> call, Throwable t) {

            }
        });
    }


}
