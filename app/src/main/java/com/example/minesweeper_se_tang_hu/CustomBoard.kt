package com.example.minesweeper_se_tang_hu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_custom_board.*

class CustomBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_board)


/* edit text */
        val height: EditText =findViewById(R.id.hi)
        val width: EditText =findViewById(R.id.wi)
        val mines: EditText =findViewById(R.id.mi)


/* when user clicks submit button */
        submit.setOnClickListener {
            //after clicking submit button, this will transfer or pass the value which the user has entered
            var heigh= Integer.parseInt(height.text.toString())
            var widt= Integer.parseInt(width.text.toString())
            var mine= Integer.parseInt(mines.text.toString())

/* passing the values to the gameplay activity */
            val intent= Intent(this, GamePlay::class.java).apply{
                putExtra("height",heigh)  //put the value
                putExtra("width",widt)
                putExtra("mines",mine)
            }
            startActivity(intent)
        }
    }
}