package com.ashivrina.tests;

import com.ashivrina.helpers.DriverSettings;
import com.ashivrina.pages.MainPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    protected MainPage mainPage = new MainPage();

    @BeforeAll
    static void setUp() {
        DriverSettings.configure();
    }
}
