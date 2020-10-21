# Authentication for Visual Impairment
Mobile authentication project for TIA110.

> Authors: Charlie Lam (charlie.lam97@gmail.com) & Amanda Anderson (anderson.amanda403@gmail.com)
>
> Date of publication: 2020-10-20

## Installation
```bash
Download the Github project as a zip file, clone, or select "Open in Github Desktop". 

Open the project in Android Studio.
An VCS error may appear. You may ignore this.
```

## Usage
```bash
To Run on Emulator:
- If an emulator is not already set up, use the Android Studio AVD manager and Tools and set up a new device. The API level for the device should be KitKat (API 19) or newer.
- Once the device is ready, select Run 'app'.
- When running the app for the first time, storage permissions will be requested. Grant permissions when prompted.
- Make the emulator's media volume is turned up, so the audio feedback can be heard.
- Move to the section "App Instructions for Both Devices" for further instruction.

To Run on Device:
- Make sure your Android device is in Developer Mode and USB Debugging is turned on.
- Connect the device via USB to your computer. You should see your phone now as an option in the device selecter next to the "Run" icon.
- Select your device and click Run 'app'
- Make sure your Media audio is turned up, so the audio feedback can be heard.
- When running the app for the first time, storage permissions will be requested. Grant permissions when prompted.
- Move to the section "App Instructions for Both Devices" for further instruction.

App Instructions For Both Devices:
- The app starts on a locked screen. The screen is divided into 4 equal quadrants, with each quadrant action as a seperate input button. These are invisible to the user. A specific sequence of clicks is necessary to log in.
- The initial default password is: Top Right, Top Right, Bottom Right, Bottom Left or "2,2,4,3" as a button number representation. Each button is fairly large, so the buttons can be clicked in their general location.
- If the password is incorrect, the audio feedback will tell you, and you will be prompted to enter the button pin again.
- Upon successful entry, you now view the home screen. The only clickable buttons here are "Lock Screen" to return to the locked mode, as well as the upper left "Settings" gear button.
- Click the "Settings" button, and you will be taken to a Settings view. In the list, find and select the Security (Set screen lock) option.
- Enter the password you used to unlock the phone (default was top right, top right, bottom right, bottom left).
- Upon successful entry, you will be prompted to enter a new password. Enter this password now and be sure you remember it. 
- Click the back arrow button to return to Settings, and again to return to Home. Lock the screen using the "Lock Screen" button, and try the new password you have just set.
```

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
