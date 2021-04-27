package com.example.expensesManager.MainActivityFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.expensesManager.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.app_bar_main.*

class AccountsFragment : Fragment() {

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var accountSpinner: Spinner

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.accounts_fragment, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigationDrawerMain()

        setAccountSpinner()
    }


    private fun navigationDrawerMain(){
        drawer = view?.findViewById(R.id.navigationDrawerMain)!!
        toggle = ActionBarDrawerToggle(activity, drawer, mainToolBar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        toggle.isDrawerIndicatorEnabled = true
        drawer.addDrawerListener(toggle)
        toggle.syncState()

    }

    private fun setAccountSpinner(){
        accountSpinner = view?.findViewById(R.id.AccountsSpinner)!!
        val adapterAccountSpinner: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(requireActivity().baseContext, R.array.testSpinner, android.R.layout.simple_dropdown_item_1line)
        adapterAccountSpinner.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        accountSpinner.adapter = adapterAccountSpinner
    }



    companion object {
        fun newInstance(): AccountsFragment = AccountsFragment()
    }
}