package com.example.hb.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    /*
    TODO voir pourquoi le code ci-dessous auto généré faisait que mon TextView ne s'affichait pas ?!
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_second)
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        txtH1.text = "Main m'a transmis le message suivant=$msgForSecond" // TODO how to get extra
    }

}