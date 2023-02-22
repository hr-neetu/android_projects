package com.example.loginpage

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginpage.databinding.ActivityApiCallBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL="https://api.publicapis.org/"
class ApiCallActivity : AppCompatActivity() {
    private lateinit var binding:ActivityApiCallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApiCallBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getMyData()
    }


    private fun getMyData(){
        val retrofitBuilder=Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)


        val retrofitData=retrofitBuilder.getData()

        retrofitData.enqueue(object :Callback<MyData>
        {
            override fun onResponse(call: Call<MyData>, response: Response<MyData>)
            {

                val data = response.body()?.entries
//                binding.txtId.text= myStringBuilder
                binding.apiRecyclerView.layoutManager=
                    LinearLayoutManager(this@ApiCallActivity, LinearLayoutManager.VERTICAL,false)
                binding.apiRecyclerView.adapter=ApiAdapter(data as ArrayList<Entry>)

            }

            override fun onFailure(call: Call<MyData>, t: Throwable) {
                Log.d("ApiCallActivity", "onFailure"+t.message)
            }
        })

    }
}