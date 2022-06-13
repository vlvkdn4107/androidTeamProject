package com.example.melontubeproject.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.MusicPlayActivity;
import com.example.melontubeproject.R;
import com.example.melontubeproject.databinding.ActivityAlbumDetailBinding;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;

public class AlbumDetailTrackListAdapter extends RecyclerView.Adapter<AlbumDetailTrackListAdapter.MusicViewHolder> {

    private List<Music> musicList = new ArrayList<>();

    public void initItemList(List<Music> musicList) {
        this.musicList = musicList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AlbumDetailTrackListAdapter.MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.album_info_music_item, parent, false);
        return new AlbumDetailTrackListAdapter.MusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumDetailTrackListAdapter.MusicViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.setItem(music);
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public static class MusicViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private TextView titleTextView;
        private TextView singerTextView;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            titleTextView = itemView.findViewById(R.id.albumMusicTitle);
            singerTextView = itemView.findViewById(R.id.albumSinger);
        }

        public void setItem(Music music) {
            titleTextView.setText(music.getTitle());
            singerTextView.setText(music.getSinger());
        }

    }

}
