package com.example.a29350.dagger_mvp;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * TODO
 * author : 马世豪 29350
 * time   : 2017/08/22
 * version: 1.0
 */

@Module
public class ApplicationModule {
  private Context mContext;

  public ApplicationModule(Context mContext) {
    this.mContext = mContext;
  }

  @Provides
  public Context provoideContext() {
    return mContext;
  }
}
