package com.fizzbit.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        val textShow = findViewById(R.id.textView) as TextView

        var changingValue = 0
        var showCount = ""
        // set on-click listener
        btn_click_me.setOnClickListener {
            changingValue += 1
            textShow.text = changingValue.toString()
            Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()
        }

    }
}
