package me.warm.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by warm on 17/6/17.
 */

public interface BaseView {

    void showLoad();
    void hideLoad();

    void onCreate(@Nullable Bundle savedInstanceState);


}
