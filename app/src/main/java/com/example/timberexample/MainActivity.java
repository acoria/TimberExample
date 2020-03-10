package com.example.timberexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_error).setOnClickListener(btn -> onClickedError());
        findViewById(R.id.btn_info).setOnClickListener(btn -> onInfoClicked());
        findViewById(R.id.btn_debug).setOnClickListener(btn -> onDebugClicked());
        findViewById(R.id.btn_verbose).setOnClickListener(btn -> onVerboseClicked());
    }

    private void onVerboseClicked() {
        Timber.v("On Verbose Clicked");
    }

    private void onDebugClicked() {
        Timber.d("On Debug Clicked.");
    }

    private void onInfoClicked() {
        Timber.i("On Info clicked.");
    }

    private void onClickedError() {
        Timber.e("On Error Clicked.");
    }
}
