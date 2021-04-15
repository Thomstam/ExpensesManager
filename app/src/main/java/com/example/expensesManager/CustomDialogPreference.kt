package com.example.expensesManager

import android.R
import android.content.Context
import android.util.AttributeSet
import androidx.preference.DialogPreference


class CustomDialogPreference(context: Context?, attrs: AttributeSet?) :
    DialogPreference(context, attrs) {

     fun onDialogClosed(positiveResult: Boolean) {
        // When the user selects "OK", persist the new value
        if (positiveResult) {
            // User selected OK
        } else {
            // User selected Cancel
        }
    }



    init {


        dialogLayoutResource = R.layout.select_dialog_item
        setPositiveButtonText(R.string.ok)
        setNegativeButtonText(R.string.cancel)
        dialogIcon = null
    }
}