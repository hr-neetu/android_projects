package com.example.loginpage

//import android.widget.Toast
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener{
            val text=binding.username.text.toString()
            val pass=binding.Password.text.toString()
            //Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            //Toast.makeText(this, pass, Toast.LENGTH_SHORT).show()
            val intent= Intent(this,Dashboard1::class.java)
            intent.putExtra("username",text)
            intent.putExtra("password",pass)
            startActivity(intent)
        }
    }
}


