package com.example.loginpage

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpage.databinding.ApiItemsBinding

class ApiAdapter(private val enteries: ArrayList<Entry>) : RecyclerView.Adapter<ApiAdapter.EntryViewHolder>()
{
    inner class EntryViewHolder(val binding: ApiItemsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiAdapter.EntryViewHolder
    {
        return EntryViewHolder(
            ApiItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int
    {
        return enteries.size
    }

    @SuppressLint("StringFormatMatches")
    override fun onBindViewHolder(holder: EntryViewHolder, position: Int)
    {
        val data = enteries[position]
        holder.binding.apiView1.apply {
            text = resources.getString(R.string.t1, data.API)
        }
        holder.binding.apiView2.apply {
            text=resources.getString(R.string.t2,data.Auth)
        }
        holder.binding.apiView3.apply {
            text=resources.getString(R.string.t3,data.Category)
        }
        holder.binding.apiView4.apply {
            text=resources.getString(R.string.t4,data.Cors)
        }
        holder.binding.apiView5.apply {
            text=resources.getString(R.string.t5,data.Description)
        }
       holder.binding.apiView6.apply {
           text=resources.getString(R.string.t6,data.HTTPS)
       }
        holder.binding.apiView7.apply {
            text=resources.getString(R.string.t7,data.Link) }

    }
}