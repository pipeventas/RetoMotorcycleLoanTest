package com.motorcycleloantest.runner;

import com.motorcycleloantest.interactions.ClickOnButton;
import com.motorcycleloantest.screenplay.interactions.OpenBrowser;
import com.motorcycleloantest.screenplay.tasks.NavigateToPage;
import com.motorcycleloantest.screenplay.user_interface.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class MotorcycleLoanTestSuite {

    @Before
    public void setup() {
        Actor actor = Actor.named("Juan");
        actor.can(BrowseTheWeb.with(System.getProperty("browser")));
        actor.attemptsTo(OpenBrowser.with(System.getProperty("browser")));
        actor.attemptsTo(NavigateToPage.to(HomePage.BASE_URL));
    }

    @After
    public void teardown() {
        // ...
    }

    @Test
    public void solicitarPrestamoParaMotocicletaConValoresYPlazosValidos() {
        Actor actor = Actor.named("Juan");
        actor.can(BrowseTheWeb.with(System.getProperty("browser")));
        actor.attemptsTo(OpenBrowser.with(System.getProperty("browser")));
        actor.attemptsTo(NavigateToPage.to(HomePage.BASE_URL));

        HomePage homePage = new HomePage();
        homePage.getBotonSolicitarCrédito().click();

        // ...
    }

    @Test
    public void solicitarPrestamoParaMotocicletaConValoresYPlazosInvalidos() {
        Actor actor = Actor.named("Juan");
        actor.can(BrowseTheWeb.with(System.getProperty("browser")));
        actor.attemptsTo(OpenBrowser.with(System.getProperty("browser")));
        actor.attemptsTo(NavigateToPage.to(HomePage.BASE_URL));

        HomePage homePage = new HomePage();
        homePage.getBotonSolicitarCrédito().click();

        // ...
    }

    @Test
    public void solicitarPrestamoParaMotocicletaConUnValorIngresadoConCaracteresNoNumericos() {
        Actor actor = Actor.named("Juan");
        actor.can(BrowseTheWeb.with(System.getProperty("browser")));
        actor.attemptsTo(OpenBrowser.with(System.getProperty("browser")));
        actor.attemptsTo(NavigateToPage.to(HomePage.BASE_URL));

        HomePage homePage = new HomePage();
        homePage.getBotonSolicitarCrédito().click();

        // ...
    }

    @AfterClass
    public static void writeResults() throws IOException {
        ExcelResultsWriter resultsWriter = new ExcelResultsWriter();
        resultsWriter.writeResults(allStepResults);
    }
}
