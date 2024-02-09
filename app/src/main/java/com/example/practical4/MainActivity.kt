package com.example.practical4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        var editText: EditText = findViewById(R.id.editTextTextPersonName)
        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Hello, friend!"
            } else {
                textView.text = "Hello, " + editText.text
            }
        }
        var button1 : Button = findViewById(R.id.button1)
        var editText2 : EditText = findViewById(R.id.editTextText2)
        button1.setOnClickListener {
            val mood = editText2.text.toString()
            val imageView : ImageView = findViewById(R.id.imageView1)
            when (mood) {
                "Good" -> imageView.setImageResource(R.drawable.img_2)
                "good" -> imageView.setImageResource(R.drawable.img_2)
                "Bad" -> imageView.setImageResource(R.drawable.img_1)
                "bad" -> imageView.setImageResource(R.drawable.img_1)
                "Excellent" -> imageView.setImageResource(R.drawable.img_3)
                "excellent" -> imageView.setImageResource(R.drawable.img_3)
            }
        }

    }
}