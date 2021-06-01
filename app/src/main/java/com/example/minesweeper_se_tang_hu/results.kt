package com.example.minesweeper_se_tang_hu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_results.*

class results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        //        values from gameplay
        var intent = getIntent()
        var showName = intent.getStringExtra("player_name")
        var showResult = intent.getStringExtra("result")


/* showing the result on screen */
        show_name.text=showName
        show_result.text=showResult

/* home button to return to home sreen */
        home.setOnClickListener {
            Toast.makeText(this,"Thank You For Playing", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, MainActivity::class.java).apply{

            }
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }

}