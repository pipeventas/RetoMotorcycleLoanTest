package com.motorcycleloantest.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@SerenityWebElement
public class HomePage extends PageObject {

    public static final Target BOTON_SOLICITAR_CREDITO = Target.the("botón solicitar crédito").located(By.xpath("//section[@id='home-conoce-mas-productos']/div/div[2]/div/div/div[2]/span"));
    public static final Target LINK_SABER_MAS = Target.the("SABER MÁS").located(By.linkText("SABER MÁS"));
    public static final Target TAB_HOME_CREDITOS = Target.the("tab-home-creditos").located(By.id("tab-home-creditos"));
    public static final Target BOTON_VER_MAS = Target.the("btn-ver-mas").located(By.id("btn-ver-mas"));
    public static final Target BOTON_VER_SIMULADOR_CREDITO_MOTOS = Target.the("botón ver simulador crédito motos").located(By.xpath("//section[@id='creditos']/div/div/div[31]/div/div[2]/div/a"));
    public static final Target TIPO_CREDITO = Target.the("tipo crédito").located(By.name("tipoCredito"));
    public static final Target VALOR_SOLICITADO = Target.the("valor solicitado").located(By.name("valorSolicitado"));
    public static final Target PLAZO = Target.the("plazo").located(By.name("plazo"));
    public static final Target BOTON_ENVIAR = Target.the("botón enviar").located(By.id("btnSubmit"));
    public static final Target BOTON_SOLICITA_TU_CREDITO = Target.the("botón solicita tu crédito").located(By.linkText("Solicita tu crédito"));

    public WebElementFacade getBotonSolicitarCrédito() {
        return getElement(BOTON_SOLICITAR_CREDITO);
    }

    public WebElementFacade getLinkSaberMás() {
        return getElement(LINK_SABER_MAS);
    }

    public WebElementFacade getTabHomeCreditos() {
        return getElement(TAB_HOME_CREDITOS);
    }

    public WebElementFacade getBotonVerMás() {
        return getElement(BOTON_VER_MAS);
    }

    public WebElementFacade getBotonVerSimuladorCréditoMotos() {
        return getElement(BOTON_VER_SIMULADOR_CREDITO_MOTOS);
    }

    public Select getTipoCrédito() {
        return new Select(getElement(TIPO_CREDITO));
    }

    public WebElementFacade getValorSolicitado() {
        return getElement(VALOR_SOLICITADO);
    }

    public Select getPlazo() {
        return new Select(getElement(PLAZO));
    }

    public WebElementFacade getBotonEnviar() {
        return getElement(BOTON_ENVIAR);
    }

    public WebElementFacade getBotonSolicitaTuCrédito() {
        return getElement(BOTON_SOLICITA_TU_CREDITO);
    }
}