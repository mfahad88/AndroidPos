package com.example.androidpos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import com.example.androidpos.dashboard.DashboardFragment

class MainActivity : AppCompatActivity() {
    lateinit var frameLayout:FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        frameLayout=findViewById(R.id.frameLayout)
    }

    fun DashboardFragment(view: View){
        supportFragmentManager.beginTransaction().replace(frameLayout.id,DashboardFragment()).commit()
    }
}