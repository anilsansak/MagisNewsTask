package com.example.anil.magisnewstask;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{

    private List<NewsList> newsList;
    private Context context;
    private int rowLayout;


    public NewsAdapter(List<NewsList> newsList, Context context, int rowLayout) {
        this.newsList = newsList;
        this.context = context;
        this.rowLayout = rowLayout;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(newsList.get(position).getImage()).into(holder.imageView);
        holder.textTitle.setText(newsList.get(position).getTitle());
        holder.textSubtext.setText(newsList.get(position).getSubTitle());
        holder.textAuthor.setText(newsList.get(position).getWriter());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearOuter;
        LinearLayout linearInner;
        ImageView imageView;
        TextView textTitle;
        TextView textSubtext;
        TextView textAuthor;

        public ViewHolder(View itemView) {
            super(itemView);
            linearOuter = itemView.findViewById(R.id.linear_outer);
            linearInner = itemView.findViewById(R.id.linear_inner);
            imageView = itemView.findViewById(R.id.image_view);
            textTitle = itemView.findViewById(R.id.text_title);
            textSubtext = itemView.findViewById(R.id.text_subtext);
            textAuthor = itemView.findViewById(R.id.text_author);
        }
    }
}
