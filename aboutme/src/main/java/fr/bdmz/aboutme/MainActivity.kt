package fr.bdmz.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import fr.bdmz.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Moussa")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
//        val doneButton: Button = findViewById(R.id.done_button)
        binding.doneButton.setOnClickListener{addNickname(it)}
    }

    private fun addNickname(view: View?) {
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)

        myName.nickname = binding.nicknameEditText.text.toString()
        binding.invalidateAll()
        view?.visibility = View.GONE
        binding.nicknameEditText.visibility = View.GONE
        binding.nicknameText.visibility = View.VISIBLE

//        binding.nicknameText.text = binding.nicknameEditText.text
    }
}
