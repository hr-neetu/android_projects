package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {
    private lateinit var binding:ActivityListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val bundle:Bundle?=intent.extras


        val arrayAdapter:ArrayAdapter<*>
        val users= arrayOf("Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor", "Virat Kohli", "Rohit Sharma", "Steve Smith", "Kane Williamson", "Ross Taylor", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor")

        val viewList =findViewById<ListView>(R.id.view_list)
        arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1, users)
        viewList.adapter=arrayAdapter

        binding.nextrecyclerview.setOnClickListener{

            val intent= Intent(this,RecyclerViewActivity::class.java)
            startActivity(intent)
        }

    }
}