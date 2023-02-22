package com.example.androidpos.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class DueViewModel:ViewModel() {
    private var dueRepository:DueRepository = DueRepository()
    fun getDueList():LiveData<List<Due>>{
        return dueRepository.getDueList()
    }
}