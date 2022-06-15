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
import com.example.melontubeproject.interfaces.OnAddListClicked;
import com.example.melontubeproject.interfaces.OnPlayBtnClicked;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;

public class SearchingAdapter extends RecyclerView.Adapter<SearchingAdapter.MusicViewHolder> {

    private List<Music> musicList = new ArrayList<>();
    private OnAddListClicked onAddListClicked;
    private OnPlayBtnClicked onPlayBtnClicked;

    private ImageView playMusicBtn;
    private ImageView addListBtn;

    public void setOnAddListClicked(OnAddListClicked onAddListClicked) {
        this.onAddListClicked = onAddListClicked;
    }

    public void setOnPlayBtnClicked(OnPlayBtnClicked onPlayBtnClicked) {
        this.onPlayBtnClicked = onPlayBtnClicked;
    }

    public void searchAddItem(List<Music> addList) {
        this.musicList = addList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.search_list_item, parent, false);
        return new MusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.setItem(music);

        addListBtn = holder.itemView.findViewById(R.id.addSearchListIcon);
        playMusicBtn = holder.itemView.findViewById(R.id.playSearchMusicIcon);

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
        private ImageView albumImage;
        private TextView titleTextView;
        private TextView singerTextView;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            albumImage = itemView.findViewById(R.id.searchAlbumImage);
            titleTextView = itemView.findViewById(R.id.searchTitle);
            singerTextView = itemView.findViewById(R.id.searchSinger);
        }

        /**
         *
         * @param music : 리사이클러뷰에 세팅할 Music 객체
         *
         */
        public void setItem(Music music) {
            titleTextView.setText(music.getTitle());
            singerTextView.setText(music.getSinger());

            Glide.with(albumImage.getContext())
                    .load(music.getImageUrl())
                    .centerCrop()
                    .apply(RequestOptions.bitmapTransform(new RoundedCorners(15)))
                    .into(albumImage);
        }
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }
}

