package com.example.expensesManager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.expensesManager.MainActivityFragments.SettingsFragment
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationDrawerMain()

        settingsFragmentInit()
    }

    private fun navigationDrawerMain(){
        setSupportActionBar(toolbarMain)

        drawer = findViewById(R.id.navigationDrawerMain)

        toggle = ActionBarDrawerToggle(this, drawer, toolbarMain, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        toggle.isDrawerIndicatorEnabled = true
        drawer.addDrawerListener(toggle)
        toggle.syncState()

    }


//    private fun navigationSetup(){
//        val navigationBottomMain: BottomNavigationView = findViewById(R.id.bottomNavigationMain)
//        navigationBottomMain.setOnNavigationItemSelectedListener OnNavigationItemSelectedListener@{ item ->
//            when (item.itemId){
//                R.id.creditCardCredentials -> {
//                    val accountFragment = AccountsFragment.newInstance()
//                    openFragment(accountFragment)
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.expensesTab -> {
//                    val categoriesFragment = CategoriesFragment.newInstance()
//                    openFragment(categoriesFragment)
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.Transactions -> {
//                    val transactionsFragment = TransactionsFragment.newInstance()
//                    openFragment(transactionsFragment)
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.Budget -> {
//
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.overview -> {
//
//                    return@OnNavigationItemSelectedListener true
//                }
//            }
//            false
//
//        }
//    }
//
    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerMain, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun settingsFragmentInit() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.settingsFragment, SettingsFragment.newInstance())
        transaction.addToBackStack(null)
        transaction.commit()
    }

}