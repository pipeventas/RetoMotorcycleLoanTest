package com.motorcycleloantest.stepdefinitions;

import com.motorcycleloantest.screenplay.interactions.OpenBrowser;
import com.motorcycleloantest.screenplay.tasks.NavigateToPage;
import com.motorcycleloantest.screenplay.user_interface.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class MotorcycleLoanStepDefinitions {

    @Given("que el actor está en la página principal de Bancolombia")
    public void queElActorEstáEnLaPáginaPrincipalDeBancolombia(Actor actor) {
        actor.can(BrowseTheWeb.with(System.getProperty("browser")));
        actor.attemptsTo(OpenBrowser.with(System.getProperty("browser")));
        actor.attemptsTo(NavigateToPage.to(HomePage.BASE_URL));
    }

    @When("el actor solicita un préstamo para motocicleta")
    public void elActorSolicitaUnPréstamoParaMotocicleta(Actor actor) {
        actor.attemptsTo(NavigateToPage.to(HomePage.SIMULADOR_CREDITO_MOTOS_URL));
    }

    @When("el actor solicita un préstamo para motocicleta con un valor de {double} y un plazo de {int} meses")
    public void elActorSolicitaUnPrestamoParaMotocicletaConValorYPeriodo(Actor actor, double valor, int plazo) {

        // Ingresar el valor del préstamo
        actor.attemptsTo(
                TypeInto.the(HomePage.CAMPO_MONTO_SOLICITADO).theText(String.valueOf(valor))
        );

        // Seleccionar el plazo del préstamo
        actor.attemptsTo(
                SelectFrom.the(HomePage.SELECCIONADOR_PLAZO).theValue(String.valueOf(plazo))
        );

        // Enviar el formulario
        actor.attemptsTo(Submit.the(HomePage.BOTON_SOLICITAR_CREDITO));
    }

    @Then("el actor debe ver un mensaje de éxito")
    public void elActorDebeVerUnMensajeDeÉxito(Actor actor) {
        // TODO: Implementar la verificación del mensaje de éxito
    }

    @When("el actor selecciona el tipo de préstamo para motocicleta")
    public void elActorSeleccionaElTipoDePréstamoParaMotocicleta(Actor actor) {
        // TODO: Implementar el código para seleccionar el tipo de préstamo para motocicleta
    }

    @When("el actor solicita un préstamo para motocicleta con un valor ingresado con caracteres no númericos")
    public void elActorSolicitaUnPrestamoParaMotocicletaConUnValorIngresadoConCaracteresNoNumericos(Actor actor) {
        // TODO: Implementar el código para solicitar un préstamo para motocicleta con un valor ingresado con caracteres no númericos
    }

    @AfterClass
    public static void writeResults() throws IOException {
        ExcelResultsWriter resultsWriter = new ExcelResultsWriter();
        resultsWriter.writeResults(allStepResults);
    }
}