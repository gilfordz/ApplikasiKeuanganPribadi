package com.example.applicationkeuanganpribadi
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TransactionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transaction, container, false)
    }

    companion object {
        fun newInstance(): TransactionFragment{
            val fragment = TransactionFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}