package com.example.androidpos.supplier

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SupplierViewModel(val context: Context): ViewModel() {
    val repository=SupplierRepository(context)
    fun getSupplier(): LiveData<List<Supplier>> {
        return repository.getAllSupplier()
    }

    suspend fun insertSupplier(supplier: Supplier): Long {
        var id=-1L
        withContext(Dispatchers.IO){
            id=repository.insertSupplier(supplier)
        }
        return id
    }

    suspend fun updateSupplier(supplier: Supplier): Int {
        var id: Int = -1

        withContext(Dispatchers.IO) {
            id = repository.updateSupplier(supplier)
        }
        return id
    }

    suspend fun deleteSupplier(supplier: Supplier): Int {
        var id: Int = -1

        withContext(Dispatchers.IO) {
            id = repository.deleteSupplier(supplier)
        }
        return id
    }
}