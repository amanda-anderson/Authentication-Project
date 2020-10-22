# Authentication for Visual Impairment
Mobile authentication project for TIA110.

> Authors: Charlie Lam (charlie.lam97@gmail.com) & Amanda Anderson (anderson.amanda403@gmail.com)
>
> Date of publication: 2020-10-23
>
> Project Website: https://project-tia110.000webhostapp.com/

## Installation

Download the Github project as a zip file.

Unzip the file to any location, and open the project in Android Studio.
If a VCS error appears, you may ignore this.

## Usage

To Run on Emulator:
1. If an emulator is not already set up, use the Android Studio AVD manager under Tools to set up a new device. The API level for the device should be KitKat (API 19) or newer.
2. Once the device is ready, select Run 'app'.
3. When running the app for the first time, storage permissions will be requested. Grant permissions when prompted.
4. Make sure the emulator's media volume is turned up, so the audio feedback can be heard.
5. Move to the section "App Instructions for Both Devices" for further instruction.

To Run on Device:
1. Make sure your Android device is in Developer Mode and USB Debugging is turned on.
2. Connect the device via USB to your computer. You should see your phone now as an option in the device selecter next to the "Run" icon in Android Studio.
3. elect your device and click Run 'app'
4. Make sure your Media audio is turned up, so the audio feedback can be heard.
5. When running the app for the first time, storage permissions will be requested. Grant permissions when prompted.
6. Move to the section "App Instructions for Both Devices" for further instruction.

App Instructions for Both Devices:
7. The app starts with a locked screen. The entire locked screen is divided into 4 equal invisble quadrants, with each quadrant acting as a seperate input button. A specific sequence of quadrant clicks is used to log in.
8. The initial default password is: Top Right, Top Right, Bottom Right, Bottom Left or "2,2,4,3" as a button number representation. Each button is fairly large, so the buttons can be clicked in a fairly general location.
9. If the password is incorrect, the audio feedback will tell you, and you will be prompted to enter the pin again.
10. Upon successful entry, you now view the home screen. The only clickable buttons here are "Lock Screen" to return to the locked mode, as well as the upper right "Settings" gear button.
11. Click the "Settings" button, and you will be taken to a Settings view. In the list, find and select the Security (Set screen lock) option.
12. Enter the password you used to unlock the phone (default was Top Right, Top Right, Bottom Right, Bottom Left).
13. Upon successful entry, you will be prompted to enter a new 4-digit pin. Enter this password now and be sure you remember it. The audio feedback will speak your new pin back to you.
14. Click the back arrow button to return to Settings, and again to return to Home. Lock the screen using the "Lock Screen" button, and try the new password you have just set.

## License
[MIT](https://choosealicense.com/licenses/mit/)
