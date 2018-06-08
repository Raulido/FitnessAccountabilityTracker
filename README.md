# cs48FAT
Fitness Accountability Time app
(Updated)


(New) - 6/8/2018 - Update - The overall process on running and building our current system has mainly stayed the same, for that reason we will reuse the majority of the old instructions from the Draft Project. An important note is that the file on github with our most recent system has changed to "latest1.zip", so make sure not to download the old one. Since there was some difficulties on running/building our system last time I will try to add some additional steps that might help. Also, some typos were fixed.

Instructions on how to run and build our current system:

1. Download Android Studio from the following link https://developer.android.com/studio/.

(New Alternative Step 2.) The emulator on Android Studio can make the system build/running process really tedious. So what we can do instead is downloading an emulator from Bignox.com and running our system from that emulator. To start go to Bignox.com and click download. Make sure to not accidentally download the game being advertised on the same page. Once you download the emulator go ahead and open it. Here are the official steps on setting up the emulator as a virtual device for android studio https://www.bignox.com/blog/how-to-connect-android-studio-with-nox-app-player-for-android-development-and-debug/ .

(Old step 2.) Once Android Studio is downloaded, you will need to download the Android Emulator to build the system. This can be done by opening Android Studio, going to the AVD manager which is located under the tools tab. Then click on the Create Virtual Device button. A list of devices will show up, we highly recommended getting the Nexus 5X API 27. This can be done by selecting the Nexus 5X, clicking on next on the bottom right and selecting the Oreo API level 27 version. Download this virtual device and make sure that the startup orientation is on Portrait.

3. Now that we have Android Studio and our emulator(Virtual Device) installed, we can now focus on exectuing our code. To start off, go to our master branch on github and download our current system("latest1.zip"). This file should be extracted to the AndroidStudioProjects file. This file is located in the current user's directory.For example, https://gyazo.com/a3bc4b16942f8d6802a34b0aed4d487f .

(Updated Step 4). Now to open the project on Android Studio, simply go to the File tab on Android Studio then click on open. Select our project and press the ok button. Once everything has loaded in move on to step 4.5.

(New step 4.5)Click on the "Build" tab on Android Studio and click on "Clean Project". After the build is complete, go to the Build tab again an click on "Make Project". Hopefully these 2 small steps eliminate any potential errors that may occur when running our system on a different PC.
-Each page on our app has its own class, these classes can be viewed by going to the java folder within the app folder.
https://gyazo.com/2f63b55ab14a2e14e7d0b7288d2dc627
-Each page also has an xml file that can be viewed by layout folder inside the res folder inside the app folder. The xml files have a text and view version, the text provides the code used to design each page. The view is simply just a view of how the page would look.
https://gyazo.com/f0c34dab7c54606391a03cf4b9ef6e8c
To switch between the view and text screen click on the view and text buttons in the bottom middle of android studio.

(Updates Step 5.) Now lets run the system on our emulator by clicking on the green triangle on the top right of android studio. Select the emulator we downloaded earlier(Virtual Device) and press ok. The system build might take a few minutes. If you are trying to use the emulator on android studio and its not coming online, make sure that Andriod Emulator is enabled in the SDK tools. You should be able to see your device if you are using the Nox emulator from the alternative step 2. !!!!IMPORTANT!!!! If you are using the Nox emulator make sure that you get newest version of the emulator by going to the Nox Multi-Drive windows(Should be a shortcut on desktop) and adding the newest Andriod Emulator(should be the lolipop one). The default emulator from Nox doesn't have the API level needed to run our system!
https://gyazo.com/48356ba314c8bbff55280d883400d73e

(New 6.) We have added some additional pages to our system. We recommend creating/logging in by using our basic authentication system, the steps to do this can be found in the old step 6 below. Once logged in you will be greeted by a very cluttered homepage, start by editing your profile, by clicking on the edit profile button. Theres currently a bug that wont let you save your name because the app thinks the name already exists, go ahead and try a different name this one should work. We consider this a special feature. Make sure to also change your bio. If you go back to the homepage, you can check how your profile looks to everyone else, and you can also see the changes you made. You can also go ahead and try adding me (RaulPulido) with the friends list feature, I should then show up on your friendslist. The matchmaking system works in a really similar way. Anyways that is our current functioning system, thank you and have a wonderful summer.

6. Once the app opens up you will be greeted by a login page. Since this will be your first time using the app you will have to sign up by clicking on the test "Not a member? Get registered in Firebase now!" this will take you to the sign up page. Now create an account with a junk email and password and register. If registration is successfull then you should be taken to our apps homepage. When accounts are created we also initialize the users levels/experience. Our sign out button is on a different page and hasn't been linked to the home page, so you will have to close the page and run the system again to test the login and forgot password pages. The forgot password page will send a password reset email to the email you submit. The login page just logs you in to the homepage.
