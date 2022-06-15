package com.example.melontubeproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.melontubeproject.databinding.ActivityMainBinding;
import com.example.melontubeproject.utils.FragmentType;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Fragment fragment;

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
        // BottomNavigation 아이템 클릭시 프래그먼트 전환
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
                    break;
            }
            return true;
        });
    }

    @Override
    public void onBackPressed() {
        // Search, MyMusicList 프래그먼트에서 뒤로가기 -> 홈 화면
        // 홈 화면에서 뒤로가기 -> 앱 종료
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