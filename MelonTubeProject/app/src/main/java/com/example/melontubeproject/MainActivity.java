package com.example.melontubeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.example.melontubeproject.databinding.ActivityMainBinding;
import com.example.melontubeproject.utils.FragmentType;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(FragmentType.CHART);
        addBottomNavigationListener();
    }

    private void replaceFragment(FragmentType type) {
        Fragment fragment = null;
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        if (type == FragmentType.CHART) {
            fragment = ChartFragment.getInstance();
        } else if (type == FragmentType.SEARCH) {
            fragment = SearchFragment.getInstance();
        } else if (type == FragmentType.MY_LIST) {
            fragment = MyMusicListFragment.getInstance();
        }
        transaction.replace(binding.mainContainer.getId(), fragment, type.toString());
        transaction.commit();
    }

    private void addBottomNavigationListener() {
        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.homeIcon:
                    replaceFragment(FragmentType.CHART);
                    break;
                case R.id.searchIcon:
                    replaceFragment(FragmentType.SEARCH);
                    break;
                case R.id.myListIcon:
                    replaceFragment(FragmentType.MY_LIST);
                    Log.d("TAG", "bottomNavigation : 마이리스트 프래그먼트 전환");
                    break;
            }
            return true;
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}