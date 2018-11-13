package com.example.hb.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class NumberPickerActivity : AppCompatActivity(), AnkoLogger {

    val BUNDLE_NB_VALUE = "bundle nb value"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_picker)

        // Number picker TODO voir comment ajouter un scroll
        numberPicker.minValue = 0
        numberPicker.maxValue = 7
    }

    // Test persistence on numberPicker
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt(BUNDLE_NB_VALUE, numberPicker.value) // affect if outState is not null
                                                              // numberPicker.value: index of table numberPicker
    }

    override fun onRestoreInstanceState(inState: Bundle?) {
        super.onRestoreInstanceState(inState)
        if (inState != null) {
            numberPicker.value = inState.getInt(BUNDLE_NB_VALUE)
        }
    }

}
