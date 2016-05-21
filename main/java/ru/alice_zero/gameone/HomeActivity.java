package ru.alice_zero.gameone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends FullscreenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goToCastle(View view) {

    }

    public void goToMap(View view) {

    }

    public void goToShop(View view) {

    }

    public void goToCharacters(View view) {
        startActivity(new Intent("ru.alice_zero.CHARACTERS"));
    }

    public void goToDungeon(View view) {

    }

    public void goToArena(View view) {

    }

    public void goToOptions(View view) {

    }

    public void ExitApp(View view) {
        // TODO Save()
        finish();
    }
}
