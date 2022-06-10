package com.example.melontubeproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.melontubeproject.R;
import com.example.melontubeproject.interfaces.OnAddListClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.interfaces.OnSearchClicked;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;

public class SearchingAdapter extends RecyclerView.Adapter<SearchingAdapter.MusicViewHolder> {

    private List<Music> musicList = new ArrayList<>();
    private OnSearchClicked onSearchClicked;
    private OnAddListClicked onAddListClicked;
    private OnPlayBtnClicked onPlayBtnClicked;

    private ImageView playMusicBtn;
    private ImageView addListBtn;
    private ImageView searchBtn;

    public void setOnSearchClicked(OnSearchClicked onSearchClicked) {
        this.onSearchClicked = onSearchClicked;
    }

    public void setOnAddListClicked(OnAddListClicked onAddListClicked) {
        this.onAddListClicked = onAddListClicked;
    }

    public void setOnPlayBtnClicked(OnPlayBtnClicked onPlayBtnClicked) {
        this.onPlayBtnClicked = onPlayBtnClicked;
    }

    public void initItemList(List<Music> musicList) {
        this.musicList = musicList;
        notifyDataSetChanged();
    }
    // 재활용 // 데이터
    public void addItem(List<Music> addList) {
        this.musicList.addAll(musicList.size(), addList);
        notifyDataSetChanged();
    }

    public void searchAddItem(List<Music> addList) {
        // 1 2 3 + 1 1
//        this.musicList.addAll(musicList.size(), addList);
        // 1
        this.musicList = addList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.chart_list_item, parent, false);
        return new MusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.setItem(music);

        addListBtn = holder.itemView.findViewById(R.id.addListIcon);
        playMusicBtn = holder.itemView.findViewById(R.id.playMusicIcon);

        playMusicBtn.setOnClickListener(v -> {
            onPlayBtnClicked.playMusic(music);
        });

        addListBtn.setOnClickListener(v -> {
            onAddListClicked.addMyList(music);
        });
    }

    // position 에 해당하는 데이터를 뷰홀더의 아이템 뷰에 표시
    public static class MusicViewHolder extends RecyclerView.ViewHolder {

        private View itemView;
        private ImageView elbumImage;
        private TextView rankTextView;
        private TextView titleTextView;
        private TextView singerTextView;

        private int rank = 1;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            rankTextView = itemView.findViewById(R.id.rank);
            elbumImage = itemView.findViewById(R.id.elbumImage);
            titleTextView = itemView.findViewById(R.id.songTitle);
            singerTextView = itemView.findViewById(R.id.singer);
        }

        public void setItem(Music music) {
            //rankTextView.setText(rank);
            titleTextView.setText(music.getTitle());
            singerTextView.setText(music.getSinger());

            Glide.with(elbumImage.getContext())
                    .load(music.getImageUrl())
                    .centerCrop()
                    .into(elbumImage);
        }
    }

    @Override
    public int getItemCount() {

        return musicList.size();
    }

}

