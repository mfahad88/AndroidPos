package com.example.androidpos.supplier

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidpos.R

class SupplierAdapter(val list:List<Supplier>): RecyclerView.Adapter<ViewHolder>() {
    private class HeaderViewHolder(itemView: View):ViewHolder(itemView){

    }
    private class SupplierViewHolder(itemView: View) : ViewHolder(itemView){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var inflater= LayoutInflater.from(parent.context)
       when (viewType){
           1 ->{}
           2  -> {}
       }
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }
}