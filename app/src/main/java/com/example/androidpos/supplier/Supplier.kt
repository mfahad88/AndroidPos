package com.example.androidpos.supplier

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "Supplier")
data class Supplier(@PrimaryKey(autoGenerate = true) val id: Int?,
                    @Ignore val viewType: Int?,
                    val name:String,
                    val contactNo:String,
                    val address:String,
                    @ColumnInfo(defaultValue = "1") val isActive: Int?,
                    @ColumnInfo(defaultValue = "0") val isDeleted: Int?
){
    constructor(viewType:Int,name:String,contactNo:String, address:String) :
            this(null, viewType,name,contactNo,address,null,null)
    constructor(name:String,contactNo:String, address:String) :
            this(null, null,name,contactNo,address,null,null)
}
