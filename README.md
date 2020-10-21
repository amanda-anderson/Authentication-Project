# Authentication for Visual Impairment
Mobile authentication project for TIA110.

> Authors: Charlie Lam (charlie.lam97@gmail.com) & Amanda Anderson (anderson.amanda403@gmail.com)
>
> Date of publication: 2020-10-23
>
> Project Website: https://project-tia110.000webhostapp.com/

## Installation

Download the Github project as a zip file.

Unzip the file to any locaiton, and open the project in Android Studio.
If a VCS error appears, you may ignore this.

## Usage

To Run on Emulator:
* If an emulator is not already set up, use the Android Studio AVD manager under Tools to set up a new device. The API level for the device should be KitKat (API 19) or newer.
* Once the device is ready, select Run 'app'.
* When running the app for the first time, storage permissions will be requested. Grant permissions when prompted.
* Make sure the emulator's media volume is turned up, so the audio feedback can be heard.
* Move to the section "App Instructions for Both Devices" for further instruction.

To Run on Device:
* Make sure your Android device is in Developer Mode and USB Debugging is turned on.
* Connect the device via USB to your computer. You should see your phone now as an option in the device selecter next to the "Run" icon in Android Studio.
* Select your device and click Run 'app'
* Make sure your Media audio is turned up, so the audio feedback can be heard.
* When running the app for the first time, storage permissions will be requested. Grant permissions when prompted.
* Move to the section "App Instructions for Both Devices" for further instruction.

App Instructions for Both Devices:
* The app starts with a locked screen. The entire locked screen is divided into 4 equal invisble quadrants, with each quadrant acting as a seperate input button. A specific sequence of quadrant clicks is used to log in.
* The initial default password is: Top Right, Top Right, Bottom Right, Bottom Left or "2,2,4,3" as a button number representation. Each button is fairly large, so the buttons can be clicked in a fairly general manner.
* If the password is incorrect, the audio feedback will tell you, and you will be prompted to enter the pin again.
* Upon successful entry, you now view the home screen. The only clickable buttons here are "Lock Screen" to return to the locked mode, as well as the upper right "Settings" gear button.
* Click the "Settings" button, and you will be taken to a Settings view. In the list, find and select the Security (Set screen lock) option.
* Enter the password you used to unlock the phone (default was Top Right, Top Right, Bottom Right, Bottom Left).
* Upon successful entry, you will be prompted to enter a new 4-digit pin. Enter this password now and be sure you remember it. The audio feedback will speak your new pin back to you.
* Click the back arrow button to return to Settings, and again to return to Home. Lock the screen using the "Lock Screen" button, and try the new password you have just set.


## Structure
//TODO

    .
    ├── java                   
    │   └── com.example.autentication_project       # The package containing MainActivity and the fragments.
    │       ├── FirstFragment                       # First fragment
    |       ├── MainActivity                        # MainActivity
    │       └── NewPasswordFragment             
    └── ...
        └── res
        ├── drawable                                # The package containing all of our pictures and icons used.
        ├── layout                                  # xmls
        └── ...

## License
[MIT](https://choosealicense.com/licenses/mit/)
