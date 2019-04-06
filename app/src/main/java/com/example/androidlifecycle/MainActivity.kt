package com.example.androidlifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("Called onCreate")
    }

    override fun onStart() {
        super.onStart()
    }


    override fun onPause() {
        super.onPause()
        print("====================================================================called onPause")
    }

    override fun onStop() {
        super.onStop()
        print("====================================================================called onStop")
    }

    override fun onResume() {
        super.onResume()
        print("====================================================================called onResume")
    }

    override fun onRestart() {
        super.onRestart()
        print("====================================================================called onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        print(message = "====================================================================called onDestroy")
    }

}
