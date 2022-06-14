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
import com.example.melontubeproject.R;
import com.example.melontubeproject.interfaces.OnDeleteBtnClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;

public class MyMusicListAdapter extends RecyclerView.Adapter<MyMusicListAdapter.MyMusicViewHolder> {
    public List<Music> myMusicList = new ArrayList<>();
    private ImageView playMusicBtn;
    private ImageView deleteMusicBtn;
    private OnPlayBtnClicked onPlayBtnClicked;
    private OnDeleteBtnClicked onDeleteBtnClicked;

    public void setOnDeleteBtnClicked(OnDeleteBtnClicked ondeleteBtnClicked) {
        this.onDeleteBtnClicked = ondeleteBtnClicked;
        notifyDataSetChanged();
    }

    public void setOnPlayBtnClicked(OnPlayBtnClicked onPlayBtnClicked) {
        this.onPlayBtnClicked = onPlayBtnClicked;
        notifyDataSetChanged();
    }

    public void initMyMusicList(List<Music> myMusicList) {
        this.myMusicList = myMusicList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyMusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.my_music_list_item,parent,false);

        return new MyMusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyMusicViewHolder holder, int position) {
        Music music = myMusicList.get(position);
        holder.getMusicList(music);

        playMusicBtn = holder.itemView.findViewById(R.id.my_music_play);
        deleteMusicBtn = holder.itemView.findViewById(R.id.my_music_delete);


        playMusicBtn.setOnClickListener(event ->{
            onPlayBtnClicked.playMusic(music);
        });

        deleteMusicBtn.setOnClickListener(event ->{
            onDeleteBtnClicked.deleteMusic(music);
        });
    }

    @Override
    public int getItemCount() {
        return myMusicList.size();
    }

    public static class MyMusicViewHolder extends RecyclerView.ViewHolder {

        private View myMusicListView;
        private ImageView imageView;
        private TextView titleView;
        private TextView singerView;

        public MyMusicViewHolder(@NonNull View itemView) {
            super(itemView);
            this.myMusicListView = itemView;
            imageView = myMusicListView.findViewById(R.id.my_music_imageview);
            titleView = myMusicListView.findViewById(R.id.my_music_title);
            singerView = myMusicListView.findViewById(R.id.my_music_singer);
        }

        public void getMusicList(Music music) {
            titleView.setText(music.getTitle());
            singerView.setText(music.getSinger());

            Glide.with(imageView.getContext())
                    .load(music.getImageUrl())
                    .centerCrop()
                    .apply(RequestOptions.bitmapTransform(new RoundedCorners(15)))
                    .into(imageView);
        }
    }
}

