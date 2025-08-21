package com.example.layoutandrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnFrame).setOnClickListener {
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btnLinear).setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btnRelative).setOnClickListener {
            startActivity(Intent(this, RelativeLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btnConstraint).setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btnRecycler).setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }
    }
}
