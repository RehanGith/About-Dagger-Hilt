package com.example.daggerhilt.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.daggerhilt.R
import com.example.daggerhilt.binds.BindInterface
import com.example.daggerhilt.databinding.ActivityMainBinding
import com.example.daggerhilt.model.Engine
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @Inject lateinit var engine: Engine
    @Inject lateinit var bindInterface: BindInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text.text = bindInterface.hello()
    }
}