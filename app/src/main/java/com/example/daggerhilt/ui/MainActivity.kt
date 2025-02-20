package com.example.daggerhilt.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.daggerhilt.R
import com.example.daggerhilt.binds.BindInterface
import com.example.daggerhilt.databinding.ActivityMainBinding
import com.example.daggerhilt.model.Engine
import com.example.daggerhilt.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
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
        val viewModel : MainViewModel by viewModels()
        viewModel._name.observe(this){
            binding.text.text = viewModel._name.value
        }
    }
}