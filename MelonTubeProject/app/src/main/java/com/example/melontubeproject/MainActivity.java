package com.example.melontubeproject;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.melontubeproject.databinding.ActivityMainBinding;
import com.example.melontubeproject.utils.FragmentType;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(FragmentType.CHART);
        addBottomNavigationListener();
    }

    private void replaceFragment(FragmentType type) {
        fragment = null;
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

        if(fragment instanceof ChartFragment){
            finish();
        } else if (fragment instanceof SearchFragment) {
            replaceFragment(FragmentType.CHART);
            binding.bottomNavigation.getMenu().findItem(R.id.homeIcon).setChecked(true);
        } else if (fragment instanceof MyMusicListFragment) {
            replaceFragment(FragmentType.CHART);
            binding.bottomNavigation.getMenu().findItem(R.id.homeIcon).setChecked(true);
        }

    }
}