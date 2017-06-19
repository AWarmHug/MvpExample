package me.warm.mvp;

/**
 * Created by warm on 17/6/17.
 * 这里的V 为 View
 */

public class BasePresenter<V extends BaseView> {
    protected V mView;



    /**
     * 粘贴
     * @param mView
     */
    public void attach(V mView){
        this.mView = mView;
    }

    /**
     *
     * 取消粘贴
     */
    public void detach(){
        mView = null;
    }



}
