package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.button)

        rollbutton.setOnClickListener{
            var imagebox: ImageView = findViewById(R.id.imageView)

            var temp = (1..6).random()

            when(temp){
                1->imagebox.setImageResource(R.drawable.dice_1)
                2->imagebox.setImageResource(R.drawable.dice_2)
                3->imagebox.setImageResource(R.drawable.dice_3)
                4->imagebox.setImageResource(R.drawable.dice_4)
                5->imagebox.setImageResource(R.drawable.dice_5)
                6->imagebox.setImageResource(R.drawable.dice_6)
            }

        }
    }
}