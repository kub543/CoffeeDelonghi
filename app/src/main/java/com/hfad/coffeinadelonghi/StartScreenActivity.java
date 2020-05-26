package com.hfad.coffeinadelonghi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class StartScreenActivity extends AppCompatActivity {

    private static final int CZAS = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        // Uruchom wątek otwierający główną aktywność
        ActivityStarter starter = new ActivityStarter();
        starter.start();
    }

    private class ActivityStarter extends Thread {

        @Override
        public void run() {
            try {
                // tutaj wrzucamy wszystkie akcje potrzebne podczas ładowania aplikacji
                Thread.sleep(CZAS);
            } catch (Exception e) {
                Log.e("StartScreen", e.getMessage());
            }

            // Włącz główną aktywność
            Intent intent = new Intent(StartScreenActivity.this, TopLevelActivity.class);
            StartScreenActivity.this.startActivity(intent);
            StartScreenActivity.this.finish();
        }
    }

}