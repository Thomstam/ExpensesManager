package com.example.expensesManager.MainActivityFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.expensesManager.R

class TransactionsFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.transactions_fragment, container, false)

    companion object {
        fun newInstance(): TransactionsFragment = TransactionsFragment()
    }
}