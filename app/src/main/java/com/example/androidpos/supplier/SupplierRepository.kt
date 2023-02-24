package com.example.androidpos.supplier

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidpos.database.AppDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SupplierRepository(private val context: Context){
    fun getAllSupplier(): LiveData<List<Supplier>> {
       return AppDatabase.getDatabase(context).supplierDao().getAllSupplier()
    }

    fun insertSupplier(supplier: Supplier): Long {
        return AppDatabase.getDatabase(context).supplierDao().insertSupplier(supplier)
    }

    fun deleteSupplier(supplier: Supplier): Int {
        return AppDatabase.getDatabase(context).supplierDao().deleteSupplier(supplier)
    }

    fun updateSupplier(supplier: Supplier): Int {

        return AppDatabase.getDatabase(context).supplierDao().updateSupplier(supplier)
    }

}