package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginpage.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding
    var listthecategories= arrayListOf<PhonedetailsClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        listthecategories = ArrayList<PhonedetailsClass>()
        listthecategories.add(PhonedetailsClass("Rohit Sharma","1242145764"))
        listthecategories.add(PhonedetailsClass("Steve Smith","1224214576"))
        listthecategories.add(PhonedetailsClass("Virat Kohli","1242145764"))
        listthecategories.add(PhonedetailsClass("Ross Taylor","1242145764"))
        listthecategories.add(PhonedetailsClass("Kane Williamson","1242145764"))
        listthecategories.add(PhonedetailsClass("Virat Kohli","1242145764"))
        listthecategories.add(PhonedetailsClass("Steve Smith","11242145764"))
        listthecategories.add(PhonedetailsClass("Rohit Sharma","1242145764"))
        listthecategories.add(PhonedetailsClass("Steve Smith","1224214576"))
        listthecategories.add(PhonedetailsClass("Virat Kohli","1242145764"))
        listthecategories.add(PhonedetailsClass("Ross Taylor","1242145764"))
        listthecategories.add(PhonedetailsClass("Kane Williamson","1242145764"))
        listthecategories.add(PhonedetailsClass("Virat Kohli","1242145764"))
        listthecategories.add(PhonedetailsClass("Steve Smith","11242145764"))

        binding.recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter=RcvAdapter(listthecategories)


        binding.nextApi.setOnClickListener{

            val intent= Intent(this,ApiCallActivity::class.java)
            startActivity(intent)
        }


    }
}