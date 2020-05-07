package com.example.myportfolioapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.grid_layout.*

class MainActivity : AppCompatActivity() {

    lateinit var preferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferences = getSharedPreferences(SignUp.NAME, SignUp.MODE)
        val display: String? = preferences.getString("display", "")
        val displayEmail: TextView? = display_text
        displayEmail?.text = display

        showLog("Application is onCreate")

        playStore_image.setOnClickListener {
            viewIntent("https://play.google.com")

        }
        github_image.setOnClickListener {
            viewIntent("https://github.com/wolfofsiliconvalley/")

        }
        bitBucket_image.setOnClickListener {
            viewIntent("https://bitbucket.org")

        }
        facebook_image.setOnClickListener {
            viewIntent("https://www.facebook.com")

        }
        twitter_image.setOnClickListener {
            viewIntent("https://mobile.twitter.com/manlikefrank52")


        }
        instagram_image.setOnClickListener {
            viewIntent("https://www.instagram.com/francogram__/")


        }
        googlePlus.setOnClickListener {
            viewIntent("https://myaccount.google.com")


        }
        youTube_image.setOnClickListener {
            viewIntent("https://www.youtube.com/")


        }
        dribbble_image.setOnClickListener {
            viewIntent("https://dribbble.com/")


        }
        linkedIn_image.setOnClickListener {
            viewIntent("https://www.linkedin.com")


        }
        mail_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_EMAIL, "francogram52@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Send Email Using"))


        }
        whatsapp_image.setOnClickListener {

            viewIntent("https://api.whatsapp.com/send?phone=2348142374074")


        }
        skype_image.setOnClickListener {
            viewIntent("https://www.skype.com/en/")


        }
        google_image.setOnClickListener {
            viewIntent("https://www.google.com")


        }
        androidBot_image.setOnClickListener {
            viewIntent("https://developer.com")


        }
        web_image.setOnClickListener {
            viewIntent("https://dev.start.ng")


        }


    }


    override fun onPause() {
        super.onPause()
        showLog("The application is onPause")


    }

    override fun onResume() {
        super.onResume()
        showLog("The application is onResume")


    }

    override fun onStop() {
        super.onStop()
        showLog("The application is onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        showLog("The application is onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        showLog("The application is onRestart")

    }

}






    }
}
