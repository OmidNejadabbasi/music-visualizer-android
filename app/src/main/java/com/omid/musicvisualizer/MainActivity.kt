package com.omid.musicvisualizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.omid.musicvisualizer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    /**
     * A native method that is implemented by the 'musicvisualizer' native library,
     * which is packaged with this application.
     */

    companion object {
        // Used to load the 'musicvisualizer' library on application startup.
        init {
            System.loadLibrary("musicvisualizer")
        }
    }
}