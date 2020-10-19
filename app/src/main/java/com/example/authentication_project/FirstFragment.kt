package com.example.authentication_project

import android.content.Context
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.io.File
import java.io.FileNotFoundException

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    private lateinit var mp: MediaPlayer

    var pinCode = "";
    var pinEntry = "";

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // Check for stored pin
        var filename = "storage.txt"
        val storageDirectory = File("/sdcard/Storage/")
        storageDirectory.mkdirs()
        val filePath = File(storageDirectory, filename)
        try {
            pinCode = filePath.bufferedReader().use { out ->
                out.readLine()
            }

        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }

        // Otherwise set pinCode to default
        if (pinCode.length == 4) {
            pinCode = pinCode;
        }
        else {
            pinCode = "2234";
            try {
                filePath.bufferedWriter().use { out ->
                    out.write("2234")
                }

            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            }
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_segment1).setOnClickListener {
            pinEntry += "1"
            checkPin();
            vibratePhone();
        }

        view.findViewById<Button>(R.id.button_segment2).setOnClickListener {
            pinEntry += "2"
            checkPin();
            vibratePhone();
        }

        view.findViewById<Button>(R.id.button_segment3).setOnClickListener {
            pinEntry += "3"
            checkPin();
            vibratePhone();
        }

        view.findViewById<Button>(R.id.button_segment4).setOnClickListener {
            pinEntry += "4"
            println(pinEntry.toString());
            checkPin();
            vibratePhone();
        }
    }

    private fun checkPin() {
        if (pinCode.length == pinEntry.length && (pinCode!=pinEntry)) {
            mp = MediaPlayer.create(context, R.raw.pinincorrect)
            mp.start()
            pinEntry = "";
        }
        if (pinCode.length > pinEntry.length) {
            return;
        }
        if (!pinCode.equals(pinEntry)) {
            return;
        }

        findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
    }

    fun Fragment.vibratePhone() {
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(100)
        }
    }
}