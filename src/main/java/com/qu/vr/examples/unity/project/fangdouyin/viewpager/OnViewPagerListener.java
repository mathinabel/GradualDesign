package com.qu.vr.examples.unity.project.fangdouyin.viewpager;



public interface OnViewPagerListener {

    /*释放的监听*/
    void onPageRelease(boolean isNext, int position);

    /*选中的监听以及判断是否滑动到底部*/
    void onPageSelected(int position, boolean isBottom);

    /*布局完成的监听*/
    void onLayoutComplete();

}
