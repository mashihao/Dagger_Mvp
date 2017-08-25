package com.example.a29350.dagger_mvp;

import android.app.Application;
import android.content.Context;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

public class MyApplication extends Application {

  private ApplicationComponent applicationComponent;

  public static MyApplication get(Context context){
    return (MyApplication) context.getApplicationContext();
  }
  @Override
  public void onCreate() {
    super.onCreate();
    setGraph();
  }

  private void setGraph() {
    applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    applicationComponent.inject(this);//现在没有需要在MyApplication注入的对象，所以这句代码可写可不写
  }

  public ApplicationComponent component() {
    return applicationComponent;
  }
}
