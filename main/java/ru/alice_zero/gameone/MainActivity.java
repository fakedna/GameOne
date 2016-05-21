package ru.alice_zero.gameone;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends FullscreenActivity {

    private final int SPLASH_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread logoTimer = new Thread() {
            public void run() {
                try  {
                    int logoTimer = 0;
                    while(logoTimer < SPLASH_TIME) {
                        sleep(100);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent("ru.alice_zero.HOME"));
                }
                catch (InterruptedException e) {
                    // TODO: автоматически сгенерированный блок catch.
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }
        };
        logoTimer.start();
    }

}