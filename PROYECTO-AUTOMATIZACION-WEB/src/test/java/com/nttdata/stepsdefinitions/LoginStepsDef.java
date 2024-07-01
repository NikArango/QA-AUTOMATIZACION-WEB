package com.nttdata.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import com.nttdata.steps.LoginSteps;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepsDef {

    private WebDriver driver;
    private Scenario scenario;


    @Before(order = 0)
    public  void configu(Scenario scenarioo) {

        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        // System.setProperty("webdriver.chrome.whitelistedIps", "");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
        this.scenario = scenarioo;
        new LoginSteps(driver,scenario);

    }


    @Given("que me encuentro en la página  de Juntoz {string}")
    public void queMeEncuentroEnLaPáginaDeJuntoz(String arg0) {
        LoginSteps.paginajuntos(arg0);

    }

    @When("voy a la seccion de login inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void voyALaSeccionDeLoginInicioSesiónConLasCredencialesUsuarioYContraseña(String arg0, String arg1) {

        LoginSteps.iniciosesion(arg0,arg1);
    }
    @Then("valido que me he autenticado correctamente")
    public void validoQueMeHeAutenticadoCorrectamente() {
        LoginSteps.validoautenti();
    }

    @And("ingreso la categoría {string} y selecciono el primer producto")
    public void ingresoLaCategoríaYSeleccionoElPrimerProducto(String arg0) {
        LoginSteps.seleccionoproducto(arg0);
    }

    @And("lo gregago al carrito")
    public void loGregagoAlCarrito() {
        LoginSteps.agregaalcarro();
    }

    @And("Validar que se haya agregado exitosamente al Carrito")
    public void validarQueSeHayaAgregadoExitosamenteAlCarrito() {
        LoginSteps.validaagregado();
    }

    @After
    public  void cerrar(){
    /*    try {
            Thread.sleep(10000);//ml
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

       // driver.quit();
    }
}
