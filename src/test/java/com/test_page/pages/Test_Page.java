package com.test_page.pages;

import com.test_page.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Test_Page {
    public Test_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TEST 1
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    //TEST 2
    @FindBy(xpath = "//ul[@class='list-group']/li")
    public List<WebElement> listGroup;

    public static WebElement getListItem(int listItemNum){
        WebElement listItem = Driver.getDriver().findElement
                (By.xpath("//ul[@class='list-group']/li[@class='list-group-item justify-content-between']["+listItemNum+"]"));
        return listItem;
    }

    public static WebElement getListItemValue(int listItemNum){
        WebElement listItemValue = Driver.getDriver().findElement
                (By.xpath("//ul[@class='list-group']/li[@class='list-group-item justify-content-between']["+listItemNum+"]/span"));
        return listItemValue;
    }

    //TEST 3
    @FindBy(id = "dropdownMenuButton")
    public WebElement defaultSelectedValue;

    //TEST 4
    @FindBy(xpath = "//div[@id='test-4-div']/button[@type='button'][1]")
    public WebElement firstButtonTest4;

    @FindBy(xpath = "//div[@id='test-4-div']/button[@type='button'][2]")
    public WebElement secondButtonTest4;


    //TEST 5
    @FindBy(xpath = "//button[@id='test5-button']")
    public WebElement buttonTest5;

    @FindBy(xpath = "//div[@id='test5-alert'] ")
    public WebElement successMessage;




    public static WebElement testHeader(int testNum) {
        WebElement header =
                Driver.getDriver().findElement(By.xpath("//div[@id='test-"+ testNum +"-div']"));
        return header;
    }
}
