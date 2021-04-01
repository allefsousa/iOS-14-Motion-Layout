package com.developer.motionlayoutapple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import kotlinx.coroutines.*

class DynamicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onStart() {
        super.onStart()
//        GlobalScope.launch (Dispatchers.IO){
//            delay(1000)
//            withContext(Dispatchers.Main){
//                val motion = findViewById<MotionLayout>(R.id.motion_root)
//                motion.transitionToEnd()            }
//        }


    }
}