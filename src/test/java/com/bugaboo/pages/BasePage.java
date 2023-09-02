package com.bugaboo.pages;

import com.bugaboo.utilites.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){PageFactory.initElements(Driver.getDriver(),this);}
}
