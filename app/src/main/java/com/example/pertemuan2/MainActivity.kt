package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var scoreA = 0
    var scoreB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlusA.setOnClickListener {
            scoreA = scoreA + 1
            binding.tvScoreA.text = scoreA.toString()
        }

        binding.btnMinusA.setOnClickListener {
            if(scoreA > 0) {
                scoreA = scoreA - 1
                binding.tvScoreA.text = scoreA.toString()
            }
        }

        binding.btnPlusB.setOnClickListener {
                scoreB = scoreB + 1
                binding.tvScoreB.text = scoreB.toString()
        }

        binding.btnMinusB.setOnClickListener {
            if(scoreB > 0) {
                scoreB = scoreB -1
            binding.tvScoreB.text = scoreB.toString()
            }
        }
        binding.btnR.setOnClickListener {
            scoreA = 0
            scoreB = 0
            binding.tvScoreA.text = scoreA.toString()
            binding.tvScoreB.text = scoreB.toString()
        }
    }
}