package com.example.applicationkeuanganpribadi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class WalletFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wallet, container, false)
    }

    companion object {
        fun newInstance(): WalletFragment{
            val fragment = WalletFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}