package com.example.a29350.dagger_mvp;

import com.example.a29350.dagger_mvp.one.OneActivity;
import com.example.a29350.dagger_mvp.two.TwoActivity;

import dagger.Component;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

@Component(dependencies = ApplicationComponent.class, modules = BaseModule.class)
public interface BaseComponent {
  void inject(OneActivity activity);

  void inject(TwoActivity activity);
}
