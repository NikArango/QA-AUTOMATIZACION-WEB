package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class LoginSteps {
//metoos estat
    private static WebDriver driver;
    private static Scenario scenario;
    private static String texto;

    public  LoginSteps(WebDriver driverr,Scenario scenarioo) {
        driver=driverr;
        scenario=scenarioo;
    }

    private static void screenShot()
    {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(evidencia, "image/png", "evidencias");
    }


public static void paginajuntos(String url) {

    //driver.get(url);
    driver.get(url);
    screenShot();
}

/*
    public static By bcuenta=By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[2]")
    public static By  bisesion=By.xpath("//a[contains(text(),'Iniciar sesión')]")

    public static By userInput = By.xpath("//input[@id='UserName']");
    public static By passInput = By.xpath("//input[@id='Password']");
    public static By loginButton = By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/form[1]/input[1]");
    //span
    public static By vlogin =By.xpath("//header/nav[@id='navbar']/div[1]/div[4]/div[2]/div[2]/a[1]/span[1]");

    public static By egra = By.xpath("//body/section[@id='main-container']/div[@id='home']/div[1]/div[1]/div[3]");
    public static By iproducto = By.xpath("//body/section[@id='main-container']/div[@id='landing']/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[15]/a[1]/img[1]");
    public static By bañadir = By.xpath("//button[contains(text(),'Añadir al carrito')]")
    //p
    public static By vagregar =By.xpath("//p[@id='ModalLabel']");
*/


    public static void iniciosesion(String user,String password) {
        System.out.println("desplayadooooooooooooooooooooooooooooooooooooo");
/*if(driver.findElement(LoginPage.lo1).isDisplayed()){
    System.out.println("desplayadooooooooooooooooooooooooooooooooooooosi");
}else{
    System.out.println("desplayadooooooooooooooooooooooooooooooooooooonnno");

}
        System.out.println(driver.findElement(LoginPage.lo1).isDisplayed());
        System.out.println(driver.findElement(LoginPage.lo2).isDisplayed());*/

 /*       if(driver.findElement(LoginPage.lo1).isDisplayed()==true && driver.findElement(LoginPage.lo2).isDisplayed()==true ){

            driver.findElement(LoginPage.lo1).click();
            driver.findElement(LoginPage.lo2).click();

        }*/

//inip
       /* wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.lo1));
        System.out.println(driver.findElement(LoginPage.lo1).isDisplayed());*/
       // driver.findElement(LoginPage.lo2).click();


//finp




        ////biennnnnnn

        driver.findElement(LoginPage.bcuenta).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.bisesion));
        driver.findElement(LoginPage.bisesion).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.userInput));

        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(new CharSequence[]{user});
        driver.findElement(LoginPage.passInput).sendKeys(new CharSequence[]{password});

        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.bc));

        driver.findElement(LoginPage.loginButton).click();
        //
        screenShot();

    }
    public static void validoautenti() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.vlogin));
        Assertions.assertEquals("greysi",driver.findElement((LoginPage.vlogin)).getText() );
        // Verificar si el texto está presente en el elemento
     //   assertTrue(driver.findElement((vlogin)).getText().contains(""));

        screenShot();

    }
    public static void seleccionoproducto(String categ) {

/*if(driver.findElement(LoginPage.lo1).isDisplayed()==true && driver.findElement(LoginPage.lo2).isDisplayed()==true ){

    driver.findElement(LoginPage.lo1).click();
    driver.findElement(LoginPage.lo2).click();

}*/


  /*      wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.lo2));
        driver.findElement(LoginPage.lo2).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.lo1));
        driver.findElement(LoginPage.lo1).click();
*/
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));//40L
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.lo1));
        driver.findElement(LoginPage.lo1).click();

      //  wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.lo1));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.egra));
        driver.findElement(LoginPage.lo2).click();

        driver.findElement(LoginPage.egra).click();
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.iproducto));

        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.iproducto));
        texto=  driver.findElement(LoginPage.iproducto).getAttribute("alt");
        System.out.println("texto es:  "+texto);
        driver.findElement(LoginPage.iproducto).click();
        screenShot();

    }
    public static void agregaalcarro() {
 /*       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.bañadir));*/
        driver.findElement(LoginPage.bañadir).click();
        screenShot();

    }

    public static void validaagregado() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.vagregar));
        // Verificar si el texto está presente en el elemento
        System.out.println("es:  "+driver.findElement((LoginPage.vagregar)).getText());

        assertTrue(driver.findElement((LoginPage.vagregar)).getText().contains("Tu producto fue añadido"));
      driver.findElement((LoginPage.icar)).click();

        assertTrue((driver.findElement(LoginPage.iselec).getAttribute("title")).contains(texto));


        screenShot();


    }


}
