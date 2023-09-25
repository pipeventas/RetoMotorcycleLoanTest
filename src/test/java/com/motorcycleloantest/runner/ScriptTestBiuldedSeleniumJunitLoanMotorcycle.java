package com.motorcycleloantest.runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

public class ScriptTestBiuldedSeleniumJunitLoanMotorcycle {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }
    @Test
    public void testMotorcycleLoan() throws Exception {
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.bancolombia.com/personas");
        driver.findElement(By.xpath("//section[@id='home-conoce-mas-productos']/div/div[2]/div/div/div[2]/span")).click();
        driver.findElement(By.linkText("SABER MÁS")).click();
        driver.findElement(By.id("tab-home-creditos")).click();
        driver.findElement(By.id("btn-ver-mas")).click();
        driver.findElement(By.id("btn-ver-mas")).click();
        driver.findElement(By.id("btn-ver-mas")).click();
        driver.findElement(By.xpath("//section[@id='creditos']/div/div/div[31]/div/div[2]/div/a")).click();
        driver.get("https://sufi.grupobancolombia.com/sufi/creditos/rotativo/simulador?_ga=2.177120611.732817860.1695428051-852889324.1695428051&_gl=1*kubftv*_ga*MTcxODkwMTg2Mi4xNjk1MDc3NjYy*_ga_GVYK05G3HJ*MTY5NTQyODA1Mi4xLjEuMTY5NTQyOTQwNC4xNy4wLjA.");
        driver.findElement(By.name("tipoCredito")).click();
        new Select(driver.findElement(By.name("tipoCredito"))).selectByVisibleText("Motos");
        driver.findElement(By.name("valorSolicitado")).click();
        driver.findElement(By.name("valorSolicitado")).clear();
        driver.findElement(By.name("valorSolicitado")).sendKeys("$ 19,999,999.00");
        driver.findElement(By.name("plazo")).click();
        new Select(driver.findElement(By.name("plazo"))).selectByVisibleText("72");
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.linkText("Solicita tu crédito")).click();
        driver.get("https://digital.sufi.apps.bancolombia.com/autogestion/solicitar/consumidor/sufi?_ga=2.172075109.732817860.1695428051-852889324.1695428051");

        driver.findElement(By.xpath("//div[@id='MOTO']/div/div[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Familiar'])[1]/following::span[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='¡LISTO!'])[1]/following::div[1]")).click();
        driver.findElement(By.xpath("//div[@id='divGridColums']/div/mat-dialog-actions/button")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='¡LISTO!'])[1]/following::div[1]")).click();
        driver.findElement(By.xpath("//div[@id='divGridColums']/div/mat-dialog-actions/button[2]")).click();
        driver.get("https://sufi.grupobancolombia.com/sufi");
        driver.close();
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
