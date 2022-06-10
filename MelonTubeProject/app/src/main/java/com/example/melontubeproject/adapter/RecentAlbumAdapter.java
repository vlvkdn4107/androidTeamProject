package com.example.melontubeproject.adapter;

import android.view.LayoutInflater;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.melontubeproject.R;
import com.example.melontubeproject.interfaces.OnAddListClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;

public class RecentAlbumAdapter extends RecyclerView.Adapter<RecentAlbumAdapter.MusicViewHolder> {

    private List<Music> musicList = new ArrayList<>();

    public void initItemList(List<Music> musicList) {
        this.musicList = musicList;
        notifyDataSetChanged();
    }

    public void addItem(List<Music> addList) {
        this.musicList.addAll(musicList.size(), addList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.album_item, parent, false);
        return new MusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.setItem(music);

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public static class MusicViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private ImageView albumCoverImage;
        private TextView albumTitleTextView;
        private TextView singerTextView;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            albumCoverImage = itemView.findViewById(R.id.albumCoverImage);
            albumTitleTextView = itemView.findViewById(R.id.albumTitleText);
            singerTextView = itemView.findViewById(R.id.singerText);
        }

        public void setItem(Music music) {
            albumTitleTextView.setText(music.getAlbumTitle());
            singerTextView.setText(music.getSinger());

            Glide.with(albumCoverImage.getContext())
                    .load(music.getImageUrl())
                    .centerCrop()
                    .apply(RequestOptions.bitmapTransform(new RoundedCorners(15)))
                    .into(albumCoverImage);
        }
    }
}
