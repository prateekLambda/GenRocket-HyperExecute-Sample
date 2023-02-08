import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Demo {

    public void sampleTest(RemoteWebDriver driver) {
        try {
            driver.get("https://www.lambdatest.com/selenium-playground/");

            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            //driver.findElement(By.cssSelector("#__next > div.cookies__bar > div > span.inline-block.py-7.px-15.rounded.text-size-10.font-semibold.bg-lambda-900.text-white.cursor-pointer.hover\\:underline")).click();
            driver.findElement(By.linkText("Simple Form Demo")).click();
            driver.findElement(By.id("user-message")).click();
            driver.findElement(By.id("user-message")).sendKeys("Hi This is HyperTest Demo");
            driver.findElement(By.id("showInput")).click();
            driver.findElement(By.id("sum1")).click();
            driver.findElement(By.id("sum1")).sendKeys("14");
            driver.findElement(By.id("sum2")).click();
            driver.findElement(By.id("sum2")).sendKeys("16");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/form/button")).click();
            driver.findElement(By.linkText("Checkbox Demo")).click();
            driver.findElement(By.id("isAgeSelected")).click();
            driver.findElement(By.id("ex1-check1")).click();
            driver.findElement(By.id("ex1-check2")).click();
            driver.findElement(By.id("ex1-check3")).click();
            driver.findElement(By.linkText("Radio Buttons Demo")).click();
            driver.findElement(By.cssSelector("#__next > div.wrapper > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full.px-15.smtablet\\:mt-20 > div:nth-child(3) > div.px-10.pt-20.pb-5 > label.text-size-16.mt-10.text-black.mr-20")).click();
            driver.findElement(By.id("buttoncheck")).click();
            driver.findElement(By.cssSelector("#__next > div.wrapper > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full.px-15.smtablet\\:mt-20 > div:nth-child(4) > div.input-body.px-10.py-20 > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.border-r-4.border-black.smtablet\\:border-r-0.smtablet\\:mr-0.smtablet\\:pr-0 > div:nth-child(2) > label:nth-child(2) > input")).click();
            driver.findElement(By.cssSelector("#__next > div.wrapper > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full.px-15.smtablet\\:mt-20 > div:nth-child(4) > div.input-body.px-10.py-20 > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.border-r-4.border-black.smtablet\\:border-r-0.smtablet\\:mr-0.smtablet\\:pr-0 > div.mt-20.mb-20 > label:nth-child(4) > input")).click();
            driver.findElement(By.cssSelector("#__next > div.wrapper > section.mt-50 > div > div > div.w-8\\/12.smtablet\\:w-full.px-15.smtablet\\:mt-20 > div:nth-child(4) > div.input-body.px-10.py-20 > div > div.w-8\\/12.smtablet\\:w-full.left-input.mr-20.pr-30.border-r-4.border-black.smtablet\\:border-r-0.smtablet\\:mr-0.smtablet\\:pr-0 > button")).click();
            driver.findElement(By.linkText("Select Dropdown List")).click();
            Select DemoList = new Select(driver.findElement(By.id("select-demo")));
            DemoList.selectByValue("Sunday");
            DemoList.selectByValue("Monday");
            DemoList.selectByValue("Tuesday");
            DemoList.selectByValue("Wednesday");
            DemoList.selectByValue("Thursday");
            DemoList.selectByValue("Friday");
            DemoList.selectByValue("Saturday");
            Select Multiselect = new Select(driver.findElement(By.id("multi-select")));
            Multiselect.selectByValue("California");
            WebElement GetAll = driver.findElement(By.id("printAll"));
            GetAll.click();
            Multiselect.selectByValue("California");
            GetAll.click();
            Multiselect.selectByValue("Florida");
            GetAll.click();
            Multiselect.selectByValue("New Jersey");
            GetAll.click();
            Multiselect.selectByValue("New York");
            GetAll.click();
            Multiselect.selectByValue("Ohio");
            GetAll.click();
            Multiselect.selectByValue("Pennsylvania");
            GetAll.click();
            Multiselect.selectByValue("Washington");
            GetAll.click();
            driver.findElement(By.linkText("Input Form Submit")).click();
            driver.findElement(By.id("name")).click();
            driver.findElement(By.id("name")).sendKeys("HyperExecute Test");
            driver.findElement(By.id("inputEmail4")).click();
            driver.findElement(By.id("inputEmail4")).sendKeys("Hyperexecute@lambdatest.com");
            driver.findElement(By.id("inputPassword4")).click();
            driver.findElement(By.id("inputPassword4")).sendKeys("HyperExecute123");
            driver.findElement(By.id("company")).click();
            driver.findElement(By.id("company")).sendKeys("LambdaTest");
            driver.findElement(By.id("websitename")).click();
            driver.findElement(By.id("websitename")).sendKeys("https://www.lambdatest.com");
            Select country = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[3]/div[1]/select")));
            country.selectByIndex(10);
            driver.findElement(By.id("inputCity")).click();
            driver.findElement(By.id("inputCity")).sendKeys("New delhi");
            driver.findElement(By.id("inputAddress1")).click();
            driver.findElement(By.id("inputAddress1")).sendKeys("Delhi/NCR");
            driver.findElement(By.id("inputAddress2")).click();
            driver.findElement(By.id("inputAddress2")).sendKeys("Delhi/NCR");
            driver.findElement(By.id("inputState")).click();
            driver.findElement(By.id("inputState")).sendKeys("New Delhi");
            driver.findElement(By.id("inputZip")).click();
            driver.findElement(By.id("inputZip")).sendKeys("110006");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div[2]/div/form/div[6]/button")).click();
            driver.findElement(By.linkText("Ajax Form Submit")).click();
            driver.findElement(By.id("title")).click();
            driver.findElement(By.id("title")).sendKeys("HyperExecute");
            driver.findElement(By.id("description")).click();
            driver.findElement(By.id("description")).sendKeys("This is Hyperexecute  for World fastest cloud execution");
            driver.findElement(By.id("btn-submit")).click();
            driver.findElement(By.linkText("JQuery Select dropdown")).click();
            for (int title = 0; title <= 5; title++) {
                driver.getTitle();
                driver.findElement(By.linkText("JQuery Select dropdown")).isDisplayed();
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }


}
