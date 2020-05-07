package com.example.myportfolioapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.Toast

// Extensions for Log class
fun Activity.showLog(message: String) {
    if (BuildConfig.DEBUG) Log.i(this::class.java.simpleName, message)
}

//Extension for Toast Class
fun Activity.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

//Extension for Intent class
fun Activity.viewIntent(url: String) {
    val intent = Intent()
    intent.action = Intent.ACTION_VIEW
    intent.data = Uri.parse(url)
    startActivity(Intent.createChooser(intent, "Welcome"))

}