package com.example.androidpos.supplier

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.androidpos.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class SupplierFragment : Fragment(),OnClickListener{
    private lateinit var edtName:EditText
    private lateinit var edtContact:EditText
    private lateinit var edtAddress:EditText
    private lateinit var supplierViewModel: SupplierViewModel
    private lateinit var btnSave:Button
    private lateinit var btnCancel:Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var view: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_supplier, container, false)
        init()
        btnSave.setOnClickListener(this)
        btnCancel.setOnClickListener(this)
        supplierViewModel.getSupplier().observe(viewLifecycleOwner, Observer {
            recyclerView.adapter=SupplierAdapter(it)
        })
        return view
    }

    private fun init(){
        edtName= view.findViewById<EditText>(R.id.edtName)
        edtContact= view.findViewById<EditText>(R.id.edtContact)
        edtAddress= view.findViewById<EditText>(R.id.edtAddress)
        btnSave= view.findViewById<Button>(R.id.btnSave)
        btnCancel= view.findViewById<Button>(R.id.btnCancel)
        supplierViewModel=SupplierViewModel(requireActivity())
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnSave->{
                if(!TextUtils.isEmpty(edtName.text)){
                   CoroutineScope(Dispatchers.IO).launch {
                       supplierViewModel.updateSupplier(Supplier(edtName.text.toString(),edtContact.text.toString(),edtAddress.text.toString()))
                   }

                }
            }
            R.id.btnCancel->{
                edtName.text.clear()
                edtContact.text.clear()
                edtAddress.text.clear()
            }
        }
    }

}