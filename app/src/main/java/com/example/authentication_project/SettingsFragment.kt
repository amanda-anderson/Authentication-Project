package com.example.authentication_project

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.settings_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mp = MediaPlayer.create(context, R.raw.settings)
        mp.start()

        view.findViewById<ImageButton>(R.id.returnHome).setOnClickListener {
            findNavController().navigate(R.id.action_SettingsFragment_to_SecondFragment)
        }

        view.findViewById<Button>(R.id.buttonSetPin).setOnClickListener {
            findNavController().navigate(R.id.action_SettingsFragment_to_NewPasswordFragment)
        }
    }
}