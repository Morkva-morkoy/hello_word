package com.example.hello_word

import android.graphics.Color
import android.os.AsyncTask
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.net.URL
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    //
    private lateinit var textus: TextView
    private lateinit var but: Button
    private lateinit var mapsus: TextView
    private lateinit var originus: EditText
    private lateinit var destinationus: EditText
    private lateinit var but2: Button


    fun getRoute(url: String): Array<String> {
        val route = URL(url).readText().split("\n").toTypedArray()
        return route
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT > 9) {
            val gfgPolicy = ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(gfgPolicy)
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var route_info = getRoute("https://maps.googleapis.com/maps/api/directions/json?origin=Budapest&destination=Bogatyrsky%20Ave&region=es&key=AIzaSyBZ3qf0Ir4UFjBREN3bzkPG4fm0KWbk83o")
//        var n = 2
//        for (i in route_info) {
//            if (i.contains("duration")) {
//                break
//            }
//            n = n + 1
//        }

        but = findViewById(R.id.button)
        textus = findViewById(R.id.textView)
        mapsus = findViewById(R.id.textView3)
        textus.setTextColor(Color.parseColor("#673AB7"))
        originus = findViewById(R.id.Origin)
        destinationus = findViewById(R.id.Destination)
        but2 = findViewById(R.id.button2)
//  }


        but.setOnClickListener {
            if(textus.currentTextColor == -10011977){
                textus.setTextColor(Color.parseColor("#000000"))
            }
            else{
                textus.setTextColor(Color.parseColor("#673AB7"))
            }
        }

        but2.setOnClickListener {
            var origin = originus.text
            var destination = destinationus.text
            var urlus: String = "https://maps.googleapis.com/maps/api/directions/json?origin=" + origin.toString().replace(" ", "%20") + "&destination=" + destination.toString().replace(" ", "%20") + "&key=AIzaSyBZ3qf0Ir4UFjBREN3bzkPG4fm0KWbk83o"
            var route_info = getRoute(urlus)
            var n = 1
            for (i in route_info) {
                if (i.contains("duration")) {
                    break
                }
                n = n + 1
            }
            mapsus.text = route_info[n]
        }
    }
}

