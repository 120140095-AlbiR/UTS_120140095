package com.example.uts_120140095

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uts_120140095.databinding.ActivityLoginBinding
import com.example.uts_120140095.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()
            val githubUsername = binding.etGitHubUsername.text.toString()
            val nik = binding.etNIK.text.toString()
            val email = binding.etEmail.text.toString()

            // Simpan data ke DataStore Preference atau Firebase Auth
            // Redirect ke halaman login setelah registrasi sukses
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}