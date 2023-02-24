package com.example.androidpos.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.androidpos.supplier.Supplier

@Dao
interface SupplierDao {
    @Query("SELECT * FROM Supplier")
    fun getAllSupplier():LiveData<List<Supplier>>

    @Insert
    fun insertSupplier(supplier: Supplier):Long

    @Query("SELECT * FROM Supplier where id=:id limit 1")
    fun findSupplierById(id:Int) : Supplier

    @Update
    fun updateSupplier(supplier: Supplier):Int

    @Delete
    fun deleteSupplier(supplier: Supplier):Int
}