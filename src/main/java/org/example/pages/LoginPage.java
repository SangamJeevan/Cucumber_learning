package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    //xpath locators
    private By emailXpath = By.name("email");
    private By passwordXpath = By.name("password");
    private By loginButtonXpath = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[@type='submit']");
    private By forgotPasswordLink = By.linkText("Forgotten Password");
    private By logoutLink = By.xpath("//*[@id=\"column-right\"]/div/a[text()=\"Logout\"]");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions
    public void enterEmail(String email){
        WebElement emailInput = driver.findElement(emailXpath);
        emailInput.sendKeys(email);
    }
    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordXpath);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonXpath);
        loginButton.click();
    }

    public void clickForgottenPasswordLink() {
        WebElement forgottenPasswordLink = driver.findElement(forgotPasswordLink);
        forgottenPasswordLink.click();
    }

    public boolean checkForgotPwdLink() {
        return driver.findElement(forgotPasswordLink).isDisplayed();
    }

    public boolean checkLogoutLink() {
        return driver.findElement(logoutLink).isDisplayed();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public String getForgotPwdPageUrl() {
        String forgotPwdPageUrl = driver.getCurrentUrl();
        return forgotPwdPageUrl;
    }
}
