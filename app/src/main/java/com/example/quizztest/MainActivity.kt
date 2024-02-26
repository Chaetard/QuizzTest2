package com.example.quizztest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTrue : Button = findViewById(R.id.btn_true);
        val btnFalse : Button = findViewById(R.id.btn_false);

        btnTrue.setOnClickListener(){
            Toast.makeText(
                this,
                "Bien Echo...!"
                ,
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}