package com.example.a29350.dagger_mvp.one;

import android.support.annotation.NonNull;

import com.example.a29350.dagger_mvp.BaseView;

import javax.inject.Inject;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

public class OnePresenter implements OneContract.Presenter {

  OneContract.View view;

  @Inject
  public OnePresenter(BaseView view) {
    this.view = (OneContract.View) view;
  }

  @Override
  public void attachView(@NonNull OneContract.View view) {

  }

  @Override
  public void detachView() {

  }

  @Override
  public void get() {
    view.showMsg("one Presenter");
  }
}
