package com.ashivrina.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests extends TestBase {

    @Test
    @DisplayName("Check that there are 4 categories on a main page")
    void mainPageShouldContainFourCategories() {
        mainPage
                .openPage()
                .checkAllCategoriesDisplayed();
    }
}
