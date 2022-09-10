package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Next : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val editText = findViewById<EditText>(R.id.input_et)
        val button = findViewById<TextView>(R.id.generate_bn)
        val show = findViewById<TextView>(R.id.showText)


        button.setOnClickListener(View.OnClickListener {
            val string : String = editText.text.toString().trim()
            if (string.isEmpty()){
                editText.error = "Write something"
            }else{
                show.text = string
            }
        })
        show.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://about.me/gaddarkumar"))
            startActivity(intent)
        })

    }
}