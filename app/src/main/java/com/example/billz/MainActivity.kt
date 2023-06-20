package com.example.billz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.billz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

lateinit var binding: ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)


}
override fun onResume(){
    super.onResume()
    binding.btnLogIn.setOnClickListener {
        var intent= Intent(this,LogIn::class.java)
        startActivity(intent)
        validation()

    }
}
fun validation(){
    val name=binding.etUserName.text.toString()
    val email=binding.etEmail.text.toString()
    val phone=binding.etPhoneNumber.text.toString()
    val password=binding.etPassword.text.toString()
    var error=false
    if (password.isBlank()){
        binding.tilPassword.error="Enter password"
    }
    if (name.isBlank()){
        binding.tilUserName.error="Enter name"
        error=true
    }
    if (email.isBlank()){
        binding.tilEmail.error="Enter email"
        error=true
    }
    if (phone.isBlank()){
        binding.tilPhoneNumber.error="Enter PhoneNumber"
        error=true
    }
    if (!error){
        Toast.makeText(this,"Successful addition", Toast.LENGTH_SHORT)
            .show()
    }
}
}
