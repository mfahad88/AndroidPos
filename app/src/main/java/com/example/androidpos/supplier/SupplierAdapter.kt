package com.example.androidpos.supplier

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidpos.R

class SupplierAdapter(val list:List<Supplier>): RecyclerView.Adapter<ViewHolder>() {
    private class HeaderViewHolder(itemView: View):ViewHolder(itemView){

    }
    private class SupplierViewHolder(itemView: View) : ViewHolder(itemView){
         val textName=itemView.findViewById<TextView>(R.id.textName)
         val textContact=itemView.findViewById<TextView>(R.id.textContact)
         val textAddress=itemView.findViewById<TextView>(R.id.textAddress)
         val checkBox=itemView.findViewById<CheckBox>(R.id.checkBox)
         val btnSave=itemView.findViewById<Button>(R.id.btnSave)
         val btnCancel=itemView.findViewById<Button>(R.id.btnCancel)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var inflater= LayoutInflater.from(parent.context)

        return when (viewType){
            1 ->{
                val view=inflater.inflate(R.layout.item_supplier_header,parent,false)
                HeaderViewHolder(view)
            }
            else  -> {
                val view=inflater.inflate(R.layout.item_supplier,parent,false)
                SupplierViewHolder(view)
            }
        }
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(list[position].viewType==2){
            if(holder is SupplierViewHolder){
                holder.textName.text=list[position].name
                holder.textAddress.text=list[position].address
                holder.textContact.text=list[position].contactNo
                holder.checkBox.isChecked = list[position].isActive==1
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType!!
    }
}