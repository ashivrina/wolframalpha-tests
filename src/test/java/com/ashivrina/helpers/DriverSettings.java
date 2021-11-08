package com.ashivrina.helpers;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {

    public static void configure() {
        Configuration.browser = "chrome";
        Configuration.browserSize= "1920x1080";
        Configuration.baseUrl = "https://www.wolframalpha.com/";
    }
}
