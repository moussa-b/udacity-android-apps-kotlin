package fr.bdmz.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var boxThree: TextView
    private lateinit var boxFour: TextView
    private lateinit var boxFive: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boxOne: TextView = findViewById(R.id.box_one_text)
        val boxTwo: TextView = findViewById(R.id.box_two_text)
        boxThree = findViewById(R.id.box_three_text)
        boxFour = findViewById(R.id.box_four_text)
        boxFive = findViewById(R.id.box_five_text)
        val redButton: Button = findViewById(R.id.red_button)
        val yellowButton: Button = findViewById(R.id.yellow_button)
        val greenButton: Button = findViewById(R.id.green_button)

        boxOne.setOnClickListener { makeColored(it) }
        boxTwo.setOnClickListener { makeColored(it) }
        boxThree.setOnClickListener { makeColored(it) }
        boxFour.setOnClickListener { makeColored(it) }
        boxFive.setOnClickListener { makeColored(it) }
        redButton.setOnClickListener { makeColored(it) }
        yellowButton.setOnClickListener { makeColored(it) }
        greenButton.setOnClickListener { makeColored(it) }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
