package com.example.melontubeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.melontubeproject.databinding.ActivityMainBinding;
import com.example.melontubeproject.utils.FragmentType;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(FragmentType.CHART);
        addBottomNavigationListener();
    }

    private void replaceFragment(FragmentType type) {
        Fragment fragment;
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        if (type == FragmentType.CHART) {
            fragment = ChartFragment.getInstance();
        } else if (type == FragmentType.SEARCH) {
            fragment = ChartFragment.getInstance();
        } else {
            fragment = MyMusicListFragment.getInstance();
        }
        transaction.replace(binding.mainContainer.getId(), fragment, type.toString());
        transaction.commit();
    }

    private void addBottomNavigationListener() {
        binding.bottomNavigation.setOnClickListener(item -> {
            switch (item.getId()) {
                case R.id.chartIcon:
                    replaceFragment(FragmentType.CHART);
                    break;
                case R.id.searchIcon:
                    replaceFragment(FragmentType.SEARCH);
                    break;
                case R.id.myListIcon:
                    replaceFragment(FragmentType.MY_LIST);
                    break;
            }
        });

    }
}