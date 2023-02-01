package com.zmei.if_than

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.if_than.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val  maxPerson = 4
    val currentPerson = 99
    val tutBudetText = "danger!!!"
    val tutTogeText = "not danger"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {

            if (maxPerson > currentPerson) {

            binding.textView.text = "all right"
            binding.textView.setBackgroundColor(Color.GREEN)}

            else {binding.textView.text = "stop"
            binding.textView.setBackgroundColor(Color.RED)}


            when(maxPerson) {

               !in 1..90 -> binding.textView2.text = "work"
                95 -> binding.textView2.text = "dont work"
                else -> {
                    binding.textView3.setVisibility(View.VISIBLE)
                    binding.textView3.text = "i am visible!!!"
                    binding.textView3.setBackgroundColor(Color.CYAN)
                    binding.textView2.text = "work"

                    binding.button1.setVisibility(View.GONE)
                }
            }
            binding.textView5.text = when(currentPerson){

                1,2,4,5,6 -> "Trarararrara"
                else -> "pumpumpmu"
            }

            binding.textView6.text = when(maxPerson>currentPerson){

                true -> "999999999999"
                false -> 111111111111.toString()

            }
        when(tutBudetText){

            tutBudetText -> binding.button3.setVisibility(View.VISIBLE)

                tutTogeText -> "1234523"
        }

        }

    }
}