package com.example.a29350.dagger_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.a29350.dagger_mvp.one.OneActivity;
import com.example.a29350.dagger_mvp.two.TwoActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void onClickMain1(View view) {
    startActivity(new Intent(this, OneActivity.class));
  }

  public void onClickMain2(View view) {
    startActivity(new Intent(this, TwoActivity.class));
  }
}
