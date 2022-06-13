package com.example.melontubeproject.adapter;

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
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;

public class AlbumDetailAdapter extends RecyclerView.Adapter<AlbumDetailAdapter.AlbumViewHolder> {

    // 앨범 상세 페이지
    private Album album = new Album();

    public void initItem(Album album) {
        this.album = album;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.album_info_item, parent, false);
        return new AlbumViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        holder.setAlbumItem(album);
    }

    @Override
    public int getItemCount() {
        return 1;
    }


    public static class AlbumViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private ImageView albumInfoCoverImage;
        private TextView albumInfoTitleTextView;
        private TextView albumSingerTextView;

        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            albumInfoCoverImage = itemView.findViewById(R.id.albumInfoImage);
            albumInfoTitleTextView = itemView.findViewById(R.id.albumInfoTitle);
            albumSingerTextView = itemView.findViewById(R.id.albumSinger);

        }

        public void setAlbumItem(Album album) {
            albumInfoTitleTextView.setText(album.getAlbumTitle());
            albumSingerTextView.setText(album.getAlbumSinger());

            Glide.with(albumInfoCoverImage.getContext())
                    .load(album.getAlbumImageUrl())
                    .centerCrop()
                    .apply(RequestOptions.bitmapTransform(new RoundedCorners(15)))
                    .into(albumInfoCoverImage);
        }
    }
}

