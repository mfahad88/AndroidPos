package com.example.androidpos.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidpos.R

class DueAdapter(var datas:MutableList<Due>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class DueViewHolder(view: View):ViewHolder(view){
        public val textInvoiceNo:TextView
        public val textCustomerName:TextView
        public val textTotalItems:TextView
        public val textTotalPrice:TextView
        public val textContact:TextView


        init {
            textInvoiceNo=view.findViewById(R.id.textInvoiceNo)
            textCustomerName=view.findViewById(R.id.textCustomerName)
            textTotalItems=view.findViewById(R.id.textTotalItems)
            textTotalPrice=view.findViewById(R.id.textTotalPrice)
            textContact=view.findViewById(R.id.textContact)
        }
    }

    class HeadViewHolder(view: View):ViewHolder(view){
        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = if(viewType==1){
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_due, parent, false)

        }else{

            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_due_header, parent, false)
        }
        return if(viewType==1) HeadViewHolder(view) else DueViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(datas[position].viewType!=1)
            if(holder is DueViewHolder){
                val viewHolder=holder as DueViewHolder
                viewHolder.textInvoiceNo.text=datas[position].invoiceNo
                viewHolder.textCustomerName.text=datas[position].customerName
                viewHolder.textContact.text=datas[position].contact
                viewHolder.textTotalItems.text=datas[position].totalItems
                viewHolder.textTotalPrice.text=datas[position].totalPrice
            }
    }

    override fun getItemCount(): Int = datas.size



}