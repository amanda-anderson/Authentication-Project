package com.example.authentication_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    var pinCode = mutableListOf("2", "2", "3", "4");
    var pinEntry = mutableListOf("0");

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Reset pin
        pinEntry.remove("0");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_segment1).setOnClickListener {
            pinEntry.add("1");
            if (checkPin()) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        }

        view.findViewById<Button>(R.id.button_segment2).setOnClickListener {
            pinEntry.add("2");
            if (checkPin()) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        }

        view.findViewById<Button>(R.id.button_segment3).setOnClickListener {
            pinEntry.add("3");
            if (checkPin()) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        }

        view.findViewById<Button>(R.id.button_segment4).setOnClickListener {
            pinEntry.add("4");
            println(pinEntry.toString());
            if (checkPin()) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        }
    }

    private fun checkPin(): Boolean {
        if (pinCode.size > pinEntry.size) {
            return false;
        }

        for((i, s) in pinCode.withIndex()) {
            if (pinEntry.elementAt(i) != s) {
                return false;
            }
        }
        return true;
    }
}