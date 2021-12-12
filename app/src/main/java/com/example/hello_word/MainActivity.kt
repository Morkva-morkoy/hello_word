package com.example.hello_word

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    //
    private lateinit var textus: TextView
    private lateinit var but: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
        but = findViewById(R.id.button)
        textus = findViewById(R.id.textView)
        textus.setTextColor(Color.parseColor("#673AB7"))
//  }


        but.setOnClickListener {
            if(textus.currentTextColor == -10011977){
                textus.setTextColor(Color.parseColor("#000000"))
            }
            else{
                textus.setTextColor(Color.parseColor("#673AB7"))
            }




//            else
//            {
//                textus.text = "Hello World!"
//            }
        }
    }
}