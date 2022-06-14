package com.example.melontubeproject.adapter;


import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.melontubeproject.AlbumDetailActivity;
import com.example.melontubeproject.R;
import com.example.melontubeproject.models.Album;

import java.util.ArrayList;
import java.util.List;

public class RecentAlbumAdapter extends RecyclerView.Adapter<RecentAlbumAdapter.AlbumViewHolder> {

    private List<Album> albums = new ArrayList<>();

    public void initItemList(List<Album> albums) {
        this.albums = albums;
        notifyDataSetChanged();
    }

    public void addAlbumItem(List<Album> addAlbums) {
        this.albums.addAll(albums.size(), addAlbums);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.album_item, parent, false);
        return new AlbumViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album album = albums.get(position);
        holder.setItem(album);
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private ImageView albumCoverImage;
        private TextView albumTitleTextView;
        private TextView singerTextView;

        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            albumCoverImage = itemView.findViewById(R.id.albumCoverImage);
            albumTitleTextView = itemView.findViewById(R.id.albumTitleText);
            singerTextView = itemView.findViewById(R.id.singerText);
        }

        public void setItem(Album album) {
            albumTitleTextView.setText(album.getAlbumTitle());
            singerTextView.setText(album.getAlbumSinger());

            Glide.with(albumCoverImage.getContext())
                    .load(album.getAlbumImageUrl())
                    .centerCrop()
                    .apply(RequestOptions.bitmapTransform(new RoundedCorners(15)))
                    .into(albumCoverImage);

            itemView.setOnClickListener(v -> {

                Intent intent = new Intent(v.getContext(), AlbumDetailActivity.class);
                intent.putExtra("album", album);
                v.getContext().startActivity(intent);

                Log.d("TAG", "앨범 아이템 클릭 !!!" + album.getAlbumTitle());
            });

        }

    }
}
