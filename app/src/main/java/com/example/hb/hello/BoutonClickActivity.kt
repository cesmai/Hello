package com.example.hb.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bouton_click.*
import org.jetbrains.anko.toast

class BoutonClickActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bouton_click)

        imageOnClick.setOnClickListener{
            toast("click on image")
        }
    }
}
