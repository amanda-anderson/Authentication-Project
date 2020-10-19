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
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.io.File
import java.io.FileNotFoundException

/**
 * A simple [Fragment] subclass as the new password destination in the navigation.
 */
class NewPasswordFragment : Fragment() {

    private lateinit var mp: MediaPlayer
    private var pinCode = ""
    private var pinEntry = ""
    private var newPinCode = ""
    private var enterNew = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val filename = "storage.txt"
        val storageDirectory = File("/sdcard/Storage/")
        val inputFile = File(storageDirectory, filename)
        try {
            pinCode = inputFile.bufferedReader().use { out ->
                out.readLine()
            }

        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.new_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mp = MediaPlayer.create(context, R.raw.entercurrentpin)
        mp.start()

        view.findViewById<ImageButton>(R.id.returnHome2).setOnClickListener {
            findNavController().navigate(R.id.action_NewPasswordFragment_to_SettingsFragment)
        }

        view.findViewById<Button>(R.id.button_segment1).setOnClickListener {
            pinEntry += "1"
            if (enterNew) {
                newPinCode += "1"
            }
            vibratePhone()
            checkPin()
        }

        view.findViewById<Button>(R.id.button_segment2).setOnClickListener {
            pinEntry += "2"
            if (enterNew) {
                newPinCode += "2"
            }
            vibratePhone()
            checkPin()
        }

        view.findViewById<Button>(R.id.button_segment3).setOnClickListener {
            pinEntry += "3"
            if (enterNew) {
                newPinCode += "3"
            }
            vibratePhone()
            checkPin()
        }

        view.findViewById<Button>(R.id.button_segment4).setOnClickListener {
            pinEntry += "4"
            if (enterNew) {
                newPinCode += "4"
            }
            vibratePhone()
            checkPin()
        }
    }

    private fun checkPin() {
        if (newPinCode.length == 4) {
            view?.findViewById<TextView>(R.id.textView4)?.setText("Pin Updated: " + newPinCode)

            mp = MediaPlayer.create(context, R.raw.newpinset)
            mp.start()
            Thread.sleep(1000)

            // Replay new pin to user
            var index = 0
            while (index < newPinCode.length) {

                when(newPinCode[index]) {
                    '1' ->  {mp = MediaPlayer.create(context, R.raw.one)
                             mp.start()
                             Thread.sleep(650) }
                    '2' -> {mp = MediaPlayer.create(context, R.raw.two)
                            mp.start()
                            Thread.sleep(650) }
                    '3' -> {mp = MediaPlayer.create(context, R.raw.three)
                            mp.start()
                            Thread.sleep(650) }
                    '4' -> {mp = MediaPlayer.create(context, R.raw.four)
                            mp.start()
                            Thread.sleep(650) }
                }
                index++
            }

            // Write new pin to storage
            val filename = "storage.txt"
            val storageDirectory = File("/sdcard/Storage/")
            val filePath = File(storageDirectory, filename)
            try {
                filePath.bufferedWriter().use { out ->
                    out.write(newPinCode)
                }

            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            }

        }

        if (pinCode.length == pinEntry.length && (pinCode != pinEntry)) {
            mp = MediaPlayer.create(context, R.raw.pinincorrect)
            mp.start()
            pinEntry = ""
        }

        if (pinEntry == pinCode) {
            view?.findViewById<TextView>(R.id.textView4)?.setText("Enter New 4 Digit Pin");
            enterNew = true
            mp = MediaPlayer.create(context, R.raw.enternewpin)
            mp.start()
        }
    }

    private fun Fragment.vibratePhone() {
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            vibrator.vibrate(100)
        }
    }
}