package com.example.loginpage

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET(/* value = */ "entries")
    fun getData():Call<MyData>
}