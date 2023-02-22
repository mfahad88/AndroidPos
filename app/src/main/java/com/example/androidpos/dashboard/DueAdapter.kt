package com.example.androidpos.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidpos.R

class DueAdapter(var datas:List<Due>):RecyclerView.Adapter<ViewHolder>() {

    class DueViewHolder(view: View):ViewHolder(view){
//        public lateinit var textInvoiceNo:TextView
//        public lateinit var  textCustomerName:TextView
//        public lateinit var  textTotalItems:TextView
//        public lateinit var  textTotalPrice:TextView
//        public lateinit var  textContact:TextView


        val textInvoiceNo:TextView=view.findViewById(R.id.textInvoiceNo)
        val textCustomerName:TextView=view.findViewById(R.id.textCustomerName)
        val textTotalItems:TextView=view.findViewById(R.id.textTotalItems)
        val textTotalPrice:TextView=view.findViewById(R.id.textTotalPrice)
        val textContact:TextView=view.findViewById(R.id.textContact)
    }

    class HeadViewHolder(view: View):ViewHolder(view){
        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = if(viewType==1){
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_due_header, parent, false)

        }else{

            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_due, parent, false)
        }
        return if(viewType==1) HeadViewHolder(view) else DueViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(datas[position].viewType==2)
            if(holder is DueViewHolder){
                holder.textInvoiceNo.text = datas[position].invoiceNo
                holder.textCustomerName.text = datas[position].customerName
                holder.textContact.text = datas[position].contact
                holder.textTotalItems.text = datas[position].totalItems
                holder.textTotalPrice.text = datas[position].totalPrice
            }
    }

    override fun getItemCount(): Int = datas.size
    override fun getItemViewType(position: Int): Int =datas[position].viewType


}