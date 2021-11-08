package com.ashivrina.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private ElementsCollection categories = $$("._2R-m-");

    private SelenideElement mathematics = categories.find(text("Mathematics"));
    private SelenideElement scienceAndTech = categories.find(text("Science & Tech"));
    private SelenideElement societyAndCulture = categories.find(text("Society & Culture"));
    private SelenideElement everyDayLife = categories.find(text("Everyday Life"));

    @Step("Open www.wolframalpha.com main page")
    public MainPage openPage() {
        open("");
        return this;
    }

    @Step("Check that all categories are displayed")
    public void checkAllCategoriesDisplayed() {
        mathematics.shouldBe(visible);
        scienceAndTech.shouldBe(visible);
        societyAndCulture.shouldBe(visible);
        everyDayLife.shouldBe(visible);
    }
}
