package com.example.a29350.dagger_mvp;

import dagger.Component;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
  void inject(MyApplication application);
}
