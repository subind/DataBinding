package com.example.databindingpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*setContentView(R.layout.activity_main)
        val myTextView = findViewById<TextView>(R.id.hello_tv)
        myTextView.text = getString(R.string.hello_world)*/

        /**
         * Step 3: Wrap the current layout within a layout tag, the dataBinding library generates the binding class 'ActivityMainBinding'
         * DataBindingUtil's setContentView is used to inflate the layout
         * Using the instance of which the id's within the layout can be accessed.
         */
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.helloTv.text = getString(R.string.hello_world)
        /**
         * Make sure to have an id for the include tags, & also that the included layouts should be enclosed within layout tags
         */
        binding.include2.secondTv.text = getString(R.string.subind_here)
        binding.include3.secondTv.text = getString(R.string.from_india)
    }
}