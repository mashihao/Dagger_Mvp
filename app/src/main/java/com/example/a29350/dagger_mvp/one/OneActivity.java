package com.example.a29350.dagger_mvp.one;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.a29350.dagger_mvp.BaseActivity;
import com.example.a29350.dagger_mvp.BaseComponent;
import com.example.a29350.dagger_mvp.R;

import javax.inject.Inject;

public class OneActivity extends BaseActivity implements OneContract.View {


  @Inject
  OnePresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_one);
  }

  @Override
  protected void inject(BaseComponent baseComponent) {
    baseComponent.inject(this);
  }


  public void onClick1(View view) {
    presenter.get();
  }

  @Override
  public void showMsg(String msg) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
  }
}
