package com.qiwenge.android.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qiwenge.android.fragments.CategorysFragment;
import com.qiwenge.android.fragments.RankFragment;
import com.qiwenge.android.fragments.RecommendFragment;

/**
 * 书城适配器。
 * 
 * Created by John on 2014-5-15
 */
public class BookCityAdapter extends FragmentPagerAdapter {

    private RecommendFragment recommend;
    private RankFragment rank;
    private CategorysFragment category;

    public BookCityAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        switch (arg0) {
            case 0:
                if (recommend == null) recommend = new RecommendFragment();
                return recommend;
            case 1:
                if (rank == null) rank = new RankFragment();
                return rank;
            case 2:
                if (category == null) category = new CategorysFragment();
                return category;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    /**
     * 刷新Fragment数据。
     * 
     * @param position
     */
    public void refresh(int position) {
        switch (position) {
            case 0:
                if (recommend != null) recommend.refresh();
                break;
            case 1:
                if (rank != null) rank.refresh();
                break;
            case 2:
                if (category != null) category.refresh();
                break;
            default:
                break;
        }
    }

}