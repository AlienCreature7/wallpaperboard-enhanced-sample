package com.yasang.aliencreature7.singerwallhd.free.activities;

import android.support.annotation.NonNull;

import com.dm.wallpaper.board.activities.WallpaperBoardSplashActivity;
import com.dm.wallpaper.board.activities.configurations.SplashScreenConfiguration;
import com.yasang.aliencreature7.singerwallhd.free.R;

public class SplashActivity extends WallpaperBoardSplashActivity {

    @NonNull
    @Override
    public SplashScreenConfiguration onInit() {
        return new SplashScreenConfiguration(MainActivity.class)
                .setBottomText(getString(R.string.splash_screen_title));
    }
}
