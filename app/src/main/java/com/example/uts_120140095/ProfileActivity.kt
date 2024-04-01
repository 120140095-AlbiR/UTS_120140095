package com.example.uts_120140095

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.uts_120140095.databinding.ActivityLoginBinding
import com.example.uts_120140095.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tvUsername: TextView = findViewById(R.id.tvUsername)
        val tvGitHubUsername: TextView = findViewById(R.id.tvGitHubUsername)
        val tvEmail: TextView = findViewById(R.id.tvEmail)

        // Set data pengguna
        val user = DataStoreManager.getUserData(this)
        tvUsername.text = user.username
        tvGitHubUsername.text = user.githubUsername
        tvEmail.text = user.email

        binding.btnLogout.setOnClickListener {
            DataStoreManager.setLoggedIn(this, false)
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}