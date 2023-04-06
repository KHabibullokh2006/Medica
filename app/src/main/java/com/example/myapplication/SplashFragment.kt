package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val handler = Handler()
        handler.postDelayed({
            parentFragmentManager.beginTransaction()
                .replace(R.id.main,WelcomeFragment())
                .commit()
        },2000)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


}