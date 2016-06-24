package com.wordpress.craz1k0ek.testapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class ActivationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activation);

        //Prevents autofocus on startup
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    /*
    24/6/2016 - Bram Kolkman
    Action performed when txtActHelp is clicked. Opens the link issued in the Uri.parse.
    */
    public void open_help(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/"));
        startActivity(browserIntent);
    }

    public void small_Logo(View view) {
        ImageView v = (ImageView) findViewById(R.id.imgLog);
        v.getLayoutParams().height = 0;
        v.getLayoutParams().width = 0;
        Log.d("INFO", "Smaller Logo");
    }

    public void big_Logo(View view) {
        ImageView v = (ImageView) findViewById(R.id.imgLog);
        v.getLayoutParams().height = -2;
        v.getLayoutParams().width = -2;
        Log.d("INFO", "Biggen Logo");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if((keyCode == KeyEvent.KEYCODE_BACK)) {
            Log.d(this.getClass().getName(), "back button pressed");
        }
        return super.onKeyDown(keyCode, event);
    }
}
