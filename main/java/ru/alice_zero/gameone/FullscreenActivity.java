package ru.alice_zero.gameone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Alice on 29.12.2015.
 */
public class FullscreenActivity extends AppCompatActivity {

    private static final int UI_ANIMATION_DELAY = 100;
    @SuppressLint("InlinedApi")
    private static final int visibility = View.SYSTEM_UI_FLAG_LOW_PROFILE
            | View.SYSTEM_UI_FLAG_FULLSCREEN
            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
    private final Handler mHideHandler = new Handler();
    private final Runnable mHideSystemUi = new Runnable() {
        @Override
        public void run() {
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(visibility);
            decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                @Override
                public void onSystemUiVisibilityChange(int visibility) {
                    mHideHandler.postDelayed(mHideSystemUi, UI_ANIMATION_DELAY);
                }
            });
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHideHandler.postDelayed(mHideSystemUi, UI_ANIMATION_DELAY);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mHideHandler.postDelayed(mHideSystemUi, UI_ANIMATION_DELAY);
    }
}
