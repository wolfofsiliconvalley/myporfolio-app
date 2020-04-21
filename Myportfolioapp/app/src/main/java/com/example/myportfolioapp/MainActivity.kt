package com.example.myportfolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_main)

        @Override
        public void onStart() {
            super.onStart();
            Log.d(TAG, "onStart() called");
        }

        @Override
        public void onPause() {
            super.onPause();
            Log.d(TAG, "onPause() called");
        }

        @Override
        public void onStop() {
            super.onStop();
            Log.d(TAG, "onStop() called");
        }

        @Override
        public void onDestroy(){
            super.onDestroy();
            Log.d(TAG, "onDestroy() called");
        }


    }
}
