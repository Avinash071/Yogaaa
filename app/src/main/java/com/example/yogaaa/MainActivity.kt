package com.example.yogaaa

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var yogaImage : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonbhuj: ImageButton = findViewById(R.id.bhuj)
        buttonbhuj.setOnClickListener{
            bhuj()
        }
        val buttondhanur:ImageButton = findViewById(R.id.dhanur)
        buttondhanur.setOnClickListener{
            dhanur()
        }
        val buttonnauka:ImageButton = findViewById(R.id.nauka)
        buttonnauka.setOnClickListener{
            nauka()
        }
        val buttonvakra:ImageButton = findViewById(R.id.vakra)
        buttonvakra.setOnClickListener{
            vakra()
        }
    }

    private fun vakra() {
        val drawableresource:ImageView = findViewById(R.id.yoga)
        drawableresource.setImageResource(R.drawable.vakrasana)
        val textvakra :TextView = findViewById(R.id.yogatext)
        textvakra.text = getString(R.string.vakratext)
        val headvakra : TextView = findViewById(R.id.heading)
        headvakra.text = getString(R.string.vakra)
    }

    private fun nauka() {
        val drawableresource:ImageView = findViewById(R.id.yoga)
        drawableresource.setImageResource(R.drawable.naukasana)
        val textnauka :TextView = findViewById(R.id.yogatext)
        textnauka.text =getString(R.string.textnauk)
        val headnauka : TextView = findViewById(R.id.heading)
        headnauka.text = getString(R.string.naukasana)
    }

    private fun dhanur() {
        val drawableresource:ImageView = findViewById(R.id.yoga)
        drawableresource.setImageResource(R.drawable.dhanurasana)
        val textdhanur :TextView = findViewById(R.id.yogatext)
        textdhanur.text =getString(R.string.textdhanur)
        val headdhanur : TextView = findViewById(R.id.heading)
        headdhanur.text = getString(R.string.dhanurasan)
    }

    private fun bhuj() {
        val drawableresource:ImageView = findViewById(R.id.yoga)
        drawableresource.setImageResource(R.drawable.bhujangasana)
        val textbhuj :TextView = findViewById(R.id.yogatext)
        textbhuj.text =getString(R.string.textbhuj)
        val headbhuj : TextView = findViewById(R.id.heading)
        headbhuj.text = getString(R.string.bhuj)
    }
}

private fun ImageButton.setOnClickListener(viewbhuj: Any) {

}

private fun ImageButton.setOnClickListener() {
    TODO("Not yet implemented")
}
