package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var rightNumber = 0
    var leftNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resetNumbers()

    }


    fun onClickRight(v1: View) {
        if(rightNumber > leftNumber)
            Toast.makeText(this, "you Win!", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Try again!", Toast.LENGTH_SHORT).show()
        resetNumbers()

    }
    fun onClickLeft(v1: View) {
        if(rightNumber < leftNumber)
            Toast.makeText(this, "you Win!", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Try again!", Toast.LENGTH_SHORT).show()
        resetNumbers()

    }
    fun resetNumbers(){
        rightNumber = Random.nextInt(0,100)
        leftNumber = (0+Math.random()*100).toInt()
    }
}
