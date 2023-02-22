package com.example.androidpos.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.androidpos.R


class DashboardFragment : Fragment() {
    private lateinit var viewModel: DueViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_dashboard, container, false)
        val recyclerView:RecyclerView=view.findViewById(R.id.recyclerView)
        viewModel=ViewModelProvider(this).get(DueViewModel::class.java)
        viewModel.getDueList().observe(viewLifecycleOwner) {
            recyclerView.adapter = DueAdapter(it)
        }
        return view
    }


}