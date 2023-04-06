package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val handler = Handler()
        handler.postDelayed({
            parentFragmentManager.beginTransaction()
                .replace(R.id.main,SignUpFragment())
                .commit()
        },6000)
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }


}