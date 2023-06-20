package com.example.billz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.billz.databinding.ActivityLogInBinding
import com.example.billz.databinding.ActivityMainBinding

class LogIn : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    override fun onResume(){
        super.onResume()
        binding.btnSingUp1.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            validation()

        }
    }
    fun validation(){

        val email=binding.etEmail1.text.toString()
        val password=binding.etPassword1.text.toString()
        var error=false
        if (password.isBlank()){
            binding.tilPassword1.error="Enter password"
        }

        if (email.isBlank()){
            binding.tilEmail1.error="Enter email"
            error=true
        }

        if (!error){
            Toast.makeText(this,"Successful addition", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
