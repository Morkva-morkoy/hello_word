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
    private lateinit var but_red: Button
    private lateinit var but_blue: Button
    private lateinit var but_black: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
        but_red = findViewById(R.id.button)
        but_blue = findViewById(R.id.button4)
        but_black = findViewById(R.id.button3)
        textus = findViewById(R.id.textView)
//  }


        but_red.setOnClickListener {
            textus.setTextColor(Color.parseColor("#FF0000"))

        }

        but_blue.setOnClickListener {
            textus.setTextColor(Color.parseColor("#3F51B5"))
        }

        but_black.setOnClickListener {
            textus.setTextColor(Color.parseColor("#000000"))
        }
    }
}


//            if(textus.currentTextColor == -10011977){
//                textus.setTextColor(Color.parseColor("#000000"))
//            }
//            else{
//                textus.setTextColor(Color.parseColor("#673AB7"))
//            }




//            else
//            {
//                textus.text = "Hello World!"
//            }