package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

import pages.LoginPageObject;
import pages.CataloguePageObject;
import utils.DriverUtils;

public class LoginPageTest {

    public WebDriver wd;
    SoftAssert softAssert = new SoftAssert();
    WebElement element = null;
    int i, k = 0;
    String url;
    String ele = null;

    @BeforeClass //Method to open browser
    public void beforeMethod(){
        //wd = DriverUtils.driverChrome();
        wd = DriverUtils.driverFirefox();
         url = wd.getCurrentUrl();
    }

    @AfterClass
    public void afterMethod() {
        wd.quit();
    }

    @Test //Page Validation
    public void Test_1_Validate_Page_Objects(){

        element = LoginPageObject.Logo_SwagLab(wd);
        softAssert.assertTrue(element.isDisplayed());

        element = LoginPageObject.Image_Robot(wd);
        softAssert.assertTrue(element.isDisplayed());

        element = LoginPageObject.Field_Username(wd);
        softAssert.assertTrue(element.isDisplayed());

        element = LoginPageObject.Field_Password(wd);
        softAssert.assertTrue(element.isDisplayed());

        element = LoginPageObject.Button_Login(wd);
        softAssert.assertTrue(element.isDisplayed());

        element = LoginPageObject.Section_LoginCredentials(wd);
        softAssert.assertTrue(element.isDisplayed());
        String ele = LoginPageObject.Section_LoginCredentials(wd).getText();
        String[] eleParts = ele.split("\n");
        String[] users = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
        for (i = 1; i < 5 ; i++) {
            softAssert.assertTrue(eleParts[i].equalsIgnoreCase(users[i-1]));
            System.out.println("Comparison between User: " +eleParts[i] + " with " + users[i-1]);
        }

        element = LoginPageObject.Section_LoginPassword(wd);
        softAssert.assertTrue(element.isDisplayed());
        ele = LoginPageObject.Section_LoginPassword(wd).getText();
        eleParts = ele.split("\n");
        String Pass = "secret_sauce";
        softAssert.assertTrue(eleParts[1].equalsIgnoreCase(Pass));
        //System.out.println("Comparison between Pass: " + eleParts[1] + " with " + Pass);

    }

    @Test //Success Login by click in the Login button
    public void Test_2_Success_Login(){

        LoginPageObject.Field_Username(wd).sendKeys("standard_user");
        LoginPageObject.Field_Password(wd).sendKeys("secret_sauce");
        LoginPageObject.Button_Login(wd).click();

        element = CataloguePageObject.Title_Catalogue(wd);
        Assert.assertTrue(element.isDisplayed());
        ele = element.getText();
        softAssert.assertTrue(ele.equalsIgnoreCase("PRODUCTS"));
        wd.get(url);
        wd.navigate().refresh();
    }


    @Test //Validate a blocked User
    public void Test_3_Validate_Blocked_User(){

        LoginPageObject.Field_Username(wd).sendKeys("locked_out_user");
        LoginPageObject.Field_Password(wd).sendKeys("secret_sauce");
        LoginPageObject.Button_Login(wd).click();
        String ele = LoginPageObject.Container_ErrorMessage(wd).getText();
        //Erase the fields for the next TEST cases
        LoginPageObject.Field_Username(wd).clear();
        LoginPageObject.Field_Password(wd).clear();
        softAssert.assertTrue(ele.equalsIgnoreCase("Epic sadface: Sorry, this user has been locked out."));
        LoginPageObject.Container_ErrorButton(wd).click();
        wd.navigate().refresh();
    }

    @Test //Validate a user with problems in the catalogue
    public void Test_4_Validate_User_CatalogImag_Problems(){

        LoginPageObject.Field_Username(wd).sendKeys("problem_user");
        LoginPageObject.Field_Password(wd).sendKeys("secret_sauce");
        LoginPageObject.Button_Login(wd).click();

        //Get Scr & alt for each image
        String[] src = new String[6];

        for (i = 0; i < 6; i++) {

            element = wd.findElement(By.cssSelector("#item_" + i + "_img_link > .inventory_item_img"));
            /*System.out.println(element);
            String alt = wd.findElement(By.cssSelector("#item_" + i + "_img_link > .inventory_item_img")).getAttribute("alt");
            System.out.println(alt);*/
            src[i] = element.getAttribute("src");
        }
        //Comparison of Scr between Product images
        for (i = 0; i < 5; i++) {
            for (k = 1; k < 6; k++) {
                if (i!=k){
                    boolean value = src[i].equalsIgnoreCase(src[k]);
                    if (value) {
                        softAssert.fail("The SCR from the first Product image" +i+ ": " + src[i] + "\nis the same as the SCR from image " +k+ ":" + src[k]);
                        //System.out.println("The SCR from the first Product image" +i+ ": " + src[i] + "\nis the same as the SCR from image " + (k) + ":" + src[k]);
                    }
                }
            }
        }
        wd.get(url);
        wd.navigate().refresh();
    }

    @Test //Validate Performance Problem in User Log in
    public void Test_5_Validate_Performance_Login_Problem(){

        for (i = 0; i < 2; i++) {
            long start = System.currentTimeMillis();
                if (i == 0) {
                    LoginPageObject.Field_Username(wd).sendKeys("standard_user");
                }else {
                    LoginPageObject.Field_Username(wd).sendKeys("performance_glitch_user");
                }

            LoginPageObject.Field_Password(wd).sendKeys("secret_sauce");
            LoginPageObject.Button_Login(wd).click();

            element = CataloguePageObject.Title_Catalogue(wd);
            Assert.assertTrue(element.isDisplayed());
            long finish = System.currentTimeMillis();
            long totalTime = finish - start;
            if (totalTime > 600) {
                softAssert.fail("The Login for performance_glitch_user takes " + totalTime + " milliseconds. This is not performance as expected");
                System.out.println("The Login for performance_glitch_user takes " + totalTime + " milliseconds. This is not performance as expected");
            }else {
                System.out.println("The Login for standard_user takes " + totalTime + " milliseconds");
                wd.get(url);
                wd.navigate().refresh();
            }
        }
        wd.get(url);
        wd.navigate().refresh();
    }

    @Test //Validate Login with Username & Password empty
    public void Test_6_Validate_Login_Both_Fields_empty(){

        LoginPageObject.Button_Login(wd).click();

        ele = LoginPageObject.Container_ErrorMessage(wd).getText();
        softAssert.assertTrue(ele.equalsIgnoreCase("Epic sadface: Username is required"));
        LoginPageObject.Container_ErrorButton(wd).click();
    }

    @Test //Validate Login with Empty Username
    public void Test_7_Validate_Login_Empty_Username(){

        LoginPageObject.Field_Password(wd).sendKeys("secret_sauce");
        LoginPageObject.Button_Login(wd).click();

        ele = LoginPageObject.Container_ErrorMessage(wd).getText();
        softAssert.assertTrue(ele.equalsIgnoreCase("Epic sadface: Username is required"));
        LoginPageObject.Field_Password(wd).clear();
        LoginPageObject.Container_ErrorButton(wd).click();
        wd.navigate().refresh();
    }

    @Test //Validate Login with Empty Password
    public void Test_8_Validate_Login_Empty_Password(){

        LoginPageObject.Field_Username(wd).sendKeys("standard_user");
        LoginPageObject.Button_Login(wd).click();

        ele = LoginPageObject.Container_ErrorMessage(wd).getText();
        softAssert.assertTrue(ele.equalsIgnoreCase("Epic sadface: Password is required"));
        LoginPageObject.Field_Username(wd).clear();
        LoginPageObject.Container_ErrorButton(wd).click();
        wd.navigate().refresh();
    }

    @Test //Validate error message when Username or Password are completed wrong
    public void Test_9_Validate_Error_Message(){

        String [] users = {"WrongUser","standard_user"," standard_user","standard_user ","standarduser","standard_user","standard_user","standard_user"};
        String [] pass = {"secret_sauce","WrongPass","secret_sauce","secret_sauce","secret_sauce"," secret_sauce","secret_sauce ","secretsauce"};

        for (i = 0; i < 8; i++) {
            LoginPageObject.Field_Username(wd).sendKeys(users[i]);
            LoginPageObject.Field_Password(wd).sendKeys(pass[i]);
            LoginPageObject.Button_Login(wd).click();

            ele = LoginPageObject.Container_ErrorMessage(wd).getText();
            softAssert.assertTrue(ele.equalsIgnoreCase("Epic sadface: Username and password do not match any user in this service"));
            LoginPageObject.Field_Password(wd).clear();
            LoginPageObject.Field_Username(wd).clear();
            LoginPageObject.Container_ErrorButton(wd).click();
            wd.navigate().refresh();
        }
    }

}
