package com.example.a29350.dagger_mvp.two;

import android.support.annotation.NonNull;

import com.example.a29350.dagger_mvp.BaseView;

import javax.inject.Inject;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

public class TwoPresenter implements TwoContract.Presenter {

  TwoContract.View view;

  @Inject
  public TwoPresenter(BaseView view) {
    this.view = (TwoContract.View) view;
  }

  @Override
  public void attachView(@NonNull TwoContract.View view) {

  }

  @Override
  public void detachView() {

  }

  @Override
  public void get() {
    view.showMsg("two Presenter");
  }
}
