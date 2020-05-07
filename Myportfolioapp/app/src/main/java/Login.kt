package com.example.myportfolioapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*



class Login : AppCompatActivity() {



    lateinit var preferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signUpLink.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }

        login_button.setOnClickListener {
            loginUser()
        }
    }


    private fun loginUser() {
        val email: String = login_email_editText.text.toString()
        val password: String = login_password_editText.text.toString()
        preferences = getSharedPreferences(SignUp.NAME, SignUp.MODE)
        var getPassword: String? = preferences.getString(SignUp.PASSWORD, null)
        var getEmail: String? = preferences.getString(SignUp.EMAIL, null)



        if (getEmail.isNullOrEmpty() && getPassword.isNullOrEmpty()) {
            showToast("Details does not belong to any account")
        } else if (TextUtils.isEmpty(password)) {
            showToast("Please Enter a valid Password")
        } else if (TextUtils.isEmpty(email) && !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showToast("Please Enter a valid Email Address")
        } else if (!(getEmail.equals(email))) {
            showToast("Email is incorrect")
        } else if (!(getPassword.equals(password))) {
            showToast("password is incorrect")
        } else {
            val userDetails: String? = preferences.getString(
                getEmail + getPassword,
                "true"
            )
            editor = preferences.edit()
            editor.putString("display", userDetails)
            editor.commit()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            showToast("Successful")

        }
    }
}