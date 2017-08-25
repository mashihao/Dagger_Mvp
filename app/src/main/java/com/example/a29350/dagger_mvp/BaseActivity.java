package com.example.a29350.dagger_mvp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dell on 2016/8/26.
 */
public abstract class BaseActivity extends AppCompatActivity {


  protected BaseView baseView;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    baseView = (BaseView) this;
    BaseComponent baseComponent = DaggerBaseComponent.builder().applicationComponent((ApplicationComponent) MyApplication.get(this).component())
        .baseModule(new BaseModule(baseView)).build();
    inject(baseComponent);
  }

  protected abstract void inject(BaseComponent baseComponent);


}
