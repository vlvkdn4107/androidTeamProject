package com.example.melontubeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.melontubeproject.adapter.SearchingAdapter;
import com.example.melontubeproject.models.Music;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    // 검색시 같은 이름이 있는 아이템이 담길 리스트
    ArrayList<Music> search_list = new ArrayList<>();
    // recyclerView에 추가할 아이템 리스트
    ArrayList<Music> original_list = new ArrayList<>();
    // 어댑터
    SearchingAdapter adapter;
    EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 리스트에 아이템 추가
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                //original_list.add(new Music("ITEM " + i,"foreground image " + i,R.drawable.ic_launcher_foreground));
            } else {
                //original_list.add(new Music("ITEM " + i,"background image " + i,R.drawable.ic_launcher_background));
            }
        }

        //editText = f(R.id.editText);

        // editText 리스터 작성
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String searchText = editText.getText().toString();
                search_list.clear();

                if (searchText.equals("")) {
                    adapter.setItems(original_list);
                } else {
                    // 검색 단어를 포함하는지 확인
                    for (int a = 0; a < original_list.size(); a++) {
                        if (original_list.get(a).getTitle().toLowerCase().contains(searchText.toLowerCase())) {
                            search_list.add(original_list.get(a));
                        }
                        adapter.setItems(search_list);
                    }
                }
            }
        });

        // 리사이클러뷰, 어댑터 연결
        //RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //adapter = new SimpleTextAdapter(original_list);
        //recyclerView.setAdapter(adapter);
    }
}