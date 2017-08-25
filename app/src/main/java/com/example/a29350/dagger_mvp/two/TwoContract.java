package com.example.a29350.dagger_mvp.two;

import com.example.a29350.dagger_mvp.BasePresenter;
import com.example.a29350.dagger_mvp.BaseView;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

public interface TwoContract {
  interface View extends BaseView {
    void showMsg(String msg);
  }

  interface Presenter extends BasePresenter<View> {
    void get();
  }
}
