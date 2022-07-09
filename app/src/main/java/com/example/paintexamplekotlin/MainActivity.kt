package com.example.paintexamplekotlin

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.paintexamplekotlin.PaintView.Companion.colorList
import com.example.paintexamplekotlin.PaintView.Companion.currentBrush
import com.example.paintexamplekotlin.PaintView.Companion.pathList
import com.example.paintexamplekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindings: ActivityMainBinding

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindings.root)

        supportActionBar?.hide()

        bindings.apply {
            btnGreen.setOnClickListener {
                Toast.makeText(applicationContext, "Red Clicked", Toast.LENGTH_SHORT).show()
                paintBrush.color = Color.GREEN
            }
            btnRed.setOnClickListener {
                Toast.makeText(applicationContext, "Red Clicked", Toast.LENGTH_SHORT).show()
                paintBrush.color = Color.RED
                currentColor(paintBrush.color)
            }
            btnBlue.setOnClickListener {
                Toast.makeText(applicationContext, "Blue Clicked", Toast.LENGTH_SHORT).show()
                paintBrush.color = Color.BLUE
                currentColor(paintBrush.color)
            }
            btnBlack.setOnClickListener {
                Toast.makeText(applicationContext, "Black Clicked", Toast.LENGTH_SHORT).show()
                paintBrush.color = Color.BLACK
                currentColor(paintBrush.color)
            }
            btnEraser.setOnClickListener {
                Toast.makeText(applicationContext, "Eraser Clicked", Toast.LENGTH_SHORT).show()
                paintBrush.color = Color.WHITE
                currentColor(paintBrush.color)
            }
            btnClear.setOnClickListener {
                Toast.makeText(applicationContext, "Clear All Clicked", Toast.LENGTH_SHORT).show()
                pathList.clear()
                colorList.clear()
                path.reset()
            }
        }
    }

    private fun currentColor(color: Int) {
        currentBrush = color
        path = Path()
    }
}