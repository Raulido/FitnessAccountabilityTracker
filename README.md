# cs48FAT
Fitness Accountability Time app
(Updated)


(New) - 6/8/2018 - Update - The overall process on running and building our current system has mainly stayed the same, for that reason we will reuse the majority of the old instructions from the Draft Project. An important note is that the file on github with our most recent system has changed to "latest.zip" and has been updated in the steps below. Since there was some difficulties on running/building our system last time I will try to add some additional steps that might help. Also, I fixed a typo on line 10 but thats not important.

Instructions on how to run and build our current system:

1. Download Android Studio from the following link https://developer.android.com/studio/.

(New Alternative Step 2.) The emulator on Android Studio can make the system build/running process really tedious. So what we can do instead is downloading an emulator from Bignox.com and running our system from that emulator. To start go to Bignox.com and click download. Make sure to not accidentally download the game being advertised on the same page!

2. Once Android Studio is downloaded, you will need to download the Android Emulator to build the system. This can be done by opening Android Studio, going to the AVD manager which is located under the tools tab. Then click on the Create Virtual Device button. A list of devices will show up, we highly recommended getting the Nexus 5X API 27. This can be done by selecting the Nexus 5X, clicking on next on the bottom right and selecting the Oreo API level 27 version. Download this virtual device and make sure that the startup orientation is on Portrait.

3. Now that we have Android Studio and our emulator(Virtual Device) installed, we can now focus on exectuing our code. To start off, go to our master branch on github and download our current system("latest.zip"). This file should be extracted to the AndroidStudioProjects file. This file is located in the current user's directory.For example, https://gyazo.com/a3bc4b16942f8d6802a34b0aed4d487f .

(Updated Step 4). Now to open the project on Android Studio, simply go to the File tab on Android Studio then click on open. Select our project and press the ok button. Once everything has loaded in move on to step 4.5.

(New step 4.5)Click on the "Build" tab on Android Studio and click on "Clean Project". After the build is complete, go to the Build tab again an click on "Make Project". Hopefully these 2 small steps eliminate any potential errors that may occur when running our system on a different PC.
-Each page on our app has its own class, these classes can be viewed by going to the java folder within the app folder.
https://gyazo.com/2f63b55ab14a2e14e7d0b7288d2dc627
-Each page also has an xml file that can be viewed by layout folder inside the res folder inside the app folder. The xml files have a text and view version, the text provides the code used to design each page. The view is simply just a view of how the page would look.
https://gyazo.com/f0c34dab7c54606391a03cf4b9ef6e8c
To switch between the view and text screen click on the view and text buttons in the bottom middle of android studio.

5. Now lets run the system on our emulator by clicking on the green triangle on the top right of android studio. Select the emulator we downloaded earlier(Virtual Device) and press ok. The system build might take a few minutes. The emulator also might crash if your computer isn't strong enough. Theres an option to run the system on a connected device via USB, but hopefully the emulator won't crash.
Sometimes my enitre computer screen freezes, its really annoying. Also I recommend having your laptop charging because the batter life goes away fast.

6. Once the app opens up you will be greeted by a login page. Since this will be your first time using the app you will have to sign up by clicking on the test "Not a member? Get registered in Firebase now!" this will take you to the sign up page. Now create an account with a junk email and password and register. If registration is successfull then you should be taken to our apps homepage. When accounts are created we also initialize the users levels/experience. Our sign out button is on a different page and hasn't been linked to the home page, so you will have to close the page and run the system again to test the login and forgot password pages. The forgot password page will send a password reset email to the email you submit. The login page just logs you in to the homepage. This is what our system has so far, our friends list and game are currently being worked on, so make sure to check in later on!
