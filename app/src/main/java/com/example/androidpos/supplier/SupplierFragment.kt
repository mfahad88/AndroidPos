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
import com.example.androidpos.R
import com.example.androidpos.database.AppDatabase


class SupplierFragment : Fragment(),OnClickListener{
    private lateinit var edtName:EditText
    private lateinit var edtContact:EditText
    private lateinit var edtAddress:EditText
    private lateinit var supplierViewModel: SupplierViewModel
    private lateinit var btnSave:Button
    private lateinit var btnCancel:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_supplier, container, false)
        init()
        btnSave.setOnClickListener(this)
        btnCancel.setOnClickListener(this)
        supplierViewModel.getSupplier().observe(viewLifecycleOwner, Observer {

        })
        return view
    }

    private fun init(){
        val edtName= view?.findViewById<EditText>(R.id.edtName)
        val edtContact= view?.findViewById<EditText>(R.id.edtContact)
        val edtAddress= view?.findViewById<EditText>(R.id.edtAddress)
        val btnSave= view?.findViewById<Button>(R.id.btnSave)
        val btnCancel= view?.findViewById<Button>(R.id.btnCancel)
        supplierViewModel=SupplierViewModel(requireActivity())
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnSave->{
                if(!TextUtils.isEmpty(edtName.text)){

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