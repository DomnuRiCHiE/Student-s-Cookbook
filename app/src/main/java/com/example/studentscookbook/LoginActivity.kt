package com.example.studentscookbook

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.semantics.text

class LoginActivity : AppCompatActivity() {

    fun isValidLogin(username: String, password: String): Boolean {
        // Implement your login logic here
        // For example, check against a database or API
        return username == "user" && password == "password"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Perform login validation and authentication here
            // If successful, start the main activity
            if (isValidLogin(username, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                // Display error message
            }
        }

        val registerLink = findViewById<TextView>(R.id.registerLink)
        registerLink.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

}