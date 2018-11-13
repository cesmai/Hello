package com.example.hb.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info("Ceci est un info dans le onCreate")
        Log.i(this::class.java.simpleName, "Ceci est un Kotlin is an island")

        // Change initial text
        myTextSuppl.text = "Texte supplémentaire PIF modifié dans le onCreate"


        // Display a dialog box
//        alert("YO").show()

//        alert("YO") {
//            yesButton { toast("Yep") }
//            noButton { }
//        }.show()

//        alert("YO") {
//            title = "Awesome quote"
//            positiveButton("Love") { toast("Yo") }
//            negativeButton("Not at all") { }
//            neutralPressed("May be") {}
//        }.show()

        toast(getString(R.string.text_onCreate))


        // Button to open a second Activity
        btnOpenSecondActivity.setOnClickListener {
            startActivity<SecondActivity>()
//            startActivity<SecondActivity>("msgForSecond" to "tu es le 2") TODO how to get extra in SecondActivity ?
        }
    }



    override fun onStart() {
        super.onStart()

        wtf("Ceci est un wtf dans le onStart")
    }

    override fun onResume() {
        super.onResume()

        info("Ceci est un info dans le onResume")
    }

    override fun onStop() {
        super.onStop()

        info("Ceci est un info dans le onStop")
    }

    override fun onPause() {
        super.onPause()

        info("Ceci est un info dans le onPause")
//        toast("Ceci est un toast onPause")
        longToast("Ceci est un longToast onPause")
    }

    override fun onRestart() {
        super.onRestart()

        wtf("Ceci est un wtf dans le onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        info("Ceci est un info dans le onDestroy")
    }
}
