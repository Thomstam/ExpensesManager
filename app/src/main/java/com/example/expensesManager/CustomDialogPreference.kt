package com.example.expensesManager

import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.preference.DialogPreference
import androidx.preference.DialogPreference.TargetFragment
import androidx.preference.Preference
import com.example.expensesManager.MainActivityFragments.SettingsFragment
import kotlinx.android.synthetic.main.activity_main.*

class CustomDialogPreference: DialogInterface.OnClickListener, DialogFragment() {

    private lateinit var preference : Preference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val settingsFragment : SettingsFragment = SettingsFragment.newInstance()
        val fragment = settingsFragment as TargetFragment
    }




    override fun onClick(dialog: DialogInterface?, which: Int) {
        TODO("Not yet implemented")
    }
}