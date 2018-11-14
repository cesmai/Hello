package com.example.hb.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_picker.*
import org.jetbrains.anko.*

class NumberPickerActivity : AppCompatActivity(), AnkoLogger {

    companion object {
        // name of index used to stock number picker index value
        // like in php and associative arrays "key" => value
        const val BUNDLE_NP_VALUE = "key of number picker value"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_picker)

        // Number picker
        numberPicker.minValue = 0
        numberPicker.maxValue = 7
    }

    // Test persistence on numberPicker
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt(BUNDLE_NP_VALUE, numberPicker.value) // affect if outState is not null
        // numberPicker.value: index of table numberPicker
    }

    override fun onRestoreInstanceState(inState: Bundle?) {
        super.onRestoreInstanceState(inState)
        if (inState != null) {
            numberPicker.value = inState.getInt(BUNDLE_NP_VALUE)
        }
    }

}
