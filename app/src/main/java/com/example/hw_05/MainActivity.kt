package com.example.hw_05

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw_05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val phoneNumber = "+996999792479"
    private val whatsAppNumber = "+996999792479"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)
        }

        binding.btnWhatsapp.setOnClickListener {
                val url = "https://api.whatsapp.com/send?phone=$whatsAppNumber"
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    this.data = Uri.parse(url)
                }
                startActivity(intent)
        }
    }
}