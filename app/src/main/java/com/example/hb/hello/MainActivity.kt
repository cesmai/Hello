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

        myTextSuppl.text = "Texte supplémentaire PIF modifié dans le onCreate"

//        btnOpenSecondActivity.setOnClickListener(
//            toast("Clic ouvre fen2")
//        )
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

//        alert("YO").show()

//        alert("YO") {
//            yesButton { toast("Yep") }
//            noButton { }
//        }.show()

        alert("YO") {
            title = "Awesome quote"
            positiveButton("Love") { toast("Yo") }
            negativeButton("Not at all") { }
//            neutralButton("May be")
        }.show()

    }

    override fun onDestroy() {
        super.onDestroy()

        info("Ceci est un info dans le onDestroy")
    }
}
