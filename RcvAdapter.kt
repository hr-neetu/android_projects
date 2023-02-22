package com.example.loginpage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpage.databinding.RecycleViewItemsBinding

class RcvAdapter(private val phoneDetails: ArrayList<PhonedetailsClass>):
    RecyclerView.Adapter<RcvAdapter.PhoneDetailsViewHolder>() {


    inner class PhoneDetailsViewHolder(val binding:RecycleViewItemsBinding):RecyclerView.ViewHolder(binding.root
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneDetailsViewHolder {
        return PhoneDetailsViewHolder(
            RecycleViewItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
       return phoneDetails.size
    }

    override fun onBindViewHolder(holder: PhoneDetailsViewHolder, position: Int) {
        val data = phoneDetails[position]
        holder.binding.name.text = data.personName
        holder.binding.number.text = data.personNumber
    }
}