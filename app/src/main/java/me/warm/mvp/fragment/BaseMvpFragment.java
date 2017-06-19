package me.warm.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.warm.mvp.BasePresenter;
import me.warm.mvp.BaseView;


/**
 * Created by warm on 17/6/19.
 */

public abstract class BaseMvpFragment<V extends BaseView,P extends BasePresenter<V>> extends BaseFragment {

    protected P mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mPresenter=initPresenter();
//        if (this instanceof BaseView) {
            mPresenter.attach((V) this);
//        }
    }




    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }

    protected abstract P initPresenter();
}
