package com.example.androidpos.dashboard

import androidx.lifecycle.MutableLiveData

class DueRepository {

    fun getDueList():MutableLiveData<List<Due>>{
        val dueList=MutableLiveData<List<Due>>()
        dueList.value=listOf(Due(1,"","","","",""),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
            Due(2,"inv1234","Fahad","5","10,000","03218256320"),
        )
        return dueList
    }
}