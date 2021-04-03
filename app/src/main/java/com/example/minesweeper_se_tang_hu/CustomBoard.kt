package com.example.minesweeper_se_tang_hu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_custom_board.*

class CustomBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_board)


// edit text
        val height =findViewById<TextInputLayout>(R.id.hi)
        val width =findViewById<TextInputLayout>(R.id.wi)
        val mines =findViewById<TextInputLayout>(R.id.mi)


/* when user clicks submit button */
        submit.setOnClickListener {
            //after clicking submit button, this will transfer or pass the value which the user has entered
            var heigh= Integer.parseInt(height.editText?.text.toString())
            var widt= Integer.parseInt(width.editText?.text.toString())
            var mine= Integer.parseInt(mines.editText?.text.toString())

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