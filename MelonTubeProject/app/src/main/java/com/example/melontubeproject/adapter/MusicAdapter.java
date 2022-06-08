package com.example.melontubeproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.melontubeproject.R;
import com.example.melontubeproject.models.Music;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

    private List<Music> musicList;

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.chart_list_item, parent, false);
        return new MusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public static class MusicViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private ImageView elbumImage;
        private TextView rankTextView;
        private TextView titleTextView;
        private TextView singerTextView;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            rankTextView = itemView.findViewById(R.id.rank);
            elbumImage = itemView.findViewById(R.id.elbumImage);
            titleTextView = itemView.findViewById(R.id.songTitle);
            singerTextView = itemView.findViewById(R.id.singer);
        }

        public void setItem(Music music) {
            rankTextView.setText(music.getRank());
            titleTextView.setText(music.getTitle());
            singerTextView.setText(music.getSinger());

            Glide.with(elbumImage.getContext())
                    .load(music.getElbumImageUrl())
                    .centerCrop()
                    .into(elbumImage);
        }
    }
}
