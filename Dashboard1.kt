package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivityDashboard1Binding

@Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
class Dashboard1 : AppCompatActivity() {
    private lateinit var binding: ActivityDashboard1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboard1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle: Bundle? = intent.extras
        val username = bundle!!.getString("username")
        val password = bundle.getString("password")

//        val username = intent.getStringExtra("username")


        //Toast.makeText(this, username, Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, password, Toast.LENGTH_SHORT).show()
        val myList = mutableListOf<String>()
        myList.add(username.toString())
        myList.add(password.toString())

        binding.textView.text = myList.toString()
//        binding.textView2.text=password


        binding.nextActivity.setOnClickListener{

            val intent= Intent(this,ListViewActivity::class.java)
            startActivity(intent)
        }

    }
}