package com.example.melontubeproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.melontubeproject.R;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;
import java.util.List;

public class SearchingAdapter extends RecyclerView.Adapter<SearchingAdapter.ViewHolder> {
    private ArrayList<Music> items = null;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView singer;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //title = itemView.findViewById(R.id.songTitle2);
            //singer = itemView.findViewById(R.id.singer2);
            //imageView = itemView.findViewById(R.id.elbumImage2);
        }
    }

    // 생성자
    public SearchingAdapter(ArrayList<Music> list) {
        items = list;
    }

    // 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.chart_list_item2, parent, false);
        SearchingAdapter.ViewHolder vh = new SearchingAdapter.ViewHolder(view);

        return vh;
    }

    // position 에 해당하는 데이터를 뷰홀더의 아이템 뷰에 표시
    @Override
    public void onBindViewHolder(@NonNull SearchingAdapter.ViewHolder holder, int position) {
        String strTitle = items.get(position).getTitle();
        String strSinger = items.get(position).getSinger();
        String strUrl = items.get(position).getImageUrl();
        int url = Integer.parseInt(strUrl);

        holder.title.setText(strTitle);
        holder.singer.setText(strSinger);
        holder.imageView.setImageResource(url);
    }

    // 전체 데이터 개수 리턴
    @Override
    public int getItemCount() {
        return items.size();
    }

    // 어댑터 아이템 수정
    public void setItems(ArrayList<Music> list) {
        items = list;
        notifyDataSetChanged();
    }
}
