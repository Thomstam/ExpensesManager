package com.example.expensesManager.MainActivityFragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.expensesManager.R

class SettingsFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.navigation_drawer_settings)
    }

    companion object {
        fun newInstance(): SettingsFragment = SettingsFragment()
    }
}
