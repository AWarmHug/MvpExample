package me.warm.mvp.actiivity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.warm.mvp.BasePresenter;
import me.warm.mvp.BaseView;


/**
 * Created by warm on 17/6/19.
 * 这里的泛型为Presenter
 */

public abstract class BaseMvpActivity<V extends BaseView,P extends BasePresenter<V>> extends BaseActivity {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter=initPresenter();
        mPresenter.attach((V) this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detach();
    }

    protected abstract P initPresenter();
}
