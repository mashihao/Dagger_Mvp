package com.example.a29350.dagger_mvp;

import dagger.Module;
import dagger.Provides;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

@Module
public class BaseModule {
  private final BaseView view;

  public BaseModule(BaseView view) {
    this.view = view;
  }

  @Provides
  BaseView provideView() {
    return view;
  }
}
