# TestTaskKnickerbockerHotel

Tools installation:
1. chromedriver;
2. Google Chrome 87.0.4280.141 version installed (latest);
3. JDK 11.0.1;
4. Intellij IDEA 'Community' version;
5. Selenium Java » 3.141.59;
6. Git
7. TestNG

Tools setup:
1. pom.xml - the list of all libraries (dependencies) that are used in the project is stored here. Each library
   is identified as well as the project itself - a groupId, artifactId, version (GAV) troika.
2. .gitIgnore is used to specify in it files and folders that must be hidden from the git version control system.
3. How to run the current test script:
    1) Choose 'RoomTest.java'
    2) Click on menu bar 'Run'.
    3) Click in drop down menu 'Run 'RoomTest''.
4. To run tests in Chrome or newer you need to have a chromedriver.
   How to install 'chromedriver':
    1) Go to https://chromedriver.storage.googleapis.com/index.html?path=2.44/;
    2) Download 'chromedriver_win32.zip';
    3) Copy archive content;
    4) Paste archive content in C:\Windows\System32
5. Selenium is a tool for automating web browser actions.
   How to install 'Selenium Java » 3.141.59':
    1) Go to https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59;
    2) Copy Maven text;
    3) Open pom.xml in Intellij IDEA;
    4) In pom.xml before '</project\>' write '<dependencies\>';
    5) Paste Maven text after '<dependencies\>';
    6) Write after Maven text '</dependencies\>'.
6. Git is a version-control system for tracking changes in computer files and coordinating work on those files
   among multiple people. It is primarily used for source-code management in software development.
   How to install 'Git':
    1) Go to https://git-scm.com/downloads;
    2) Click 'Download 2.19.1 for Windows';
    3) Download 'Git-2.19.1-64-bit.exe';
    4) Run 'Git-2.19.1-64-bit.exe';
    3) Always click 'next';
    4) Click 'install'.
7. The Java Development Kit (JDK) is an implementation of either one of the Java Platform, Standard Edition, Java Platform,
   Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle Corporation
   in the form of a binary product aimed at Java developers on Solaris, Linux, macOS or Windows.
   How to install 'JDK 10.0.2':
    1) Go to http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html;
    2) Click 'Accept License Agreement';
    3) Click 'jdk-11.0.1_windows-x64_bin.exe';
    4) Download 'jdk-11.0.1_windows-x64_bin.exe';
    5) Before download click 'jdk-11.0.1_windows-x64_bin.exe'
    6) Install 'jdk-11.0.1_windows-x64_bin.exe'.
8. IntelliJ IDEA is a Java integrated development environment (IDE) for developing computer software.
   How to install 'IntelliJ IDEA':
    1) Go to https://www.jetbrains.com/idea/download/#section=windows;
    2) Click 'Download' for Community version;
    3) Download 'ideaIC-2020.1.2.exe';
    4) Run 'ideaIC-2020.1.2.exe';
    5) Install 'IntelliJ IDEA'.
9. Google chrome (or simply Chrome) is a freeware web browser developed by Google LLC.
   How to install 'Google Chrome':
    1) Go to https://www.google.com/intl/en_ALL/chrome/;
    2) Click 'Download Chrome';
    3) Download 'ChromeSetup.exe';
    4) Run 'ChromeSetup.exe';
    5) Install 'Google Chrome'.
10. TestNG - a testing framework for the JVM.
    How to install 'TestNG':
    1) Go to https://mvnrepository.com/artifact/org.testng/testng/7.1.0;
    2) Copy Maven text;
    3) Open pom.xml in Intellij IDEA;
    4) In pom.xml before '</dependencies\>' paste Maven text.
