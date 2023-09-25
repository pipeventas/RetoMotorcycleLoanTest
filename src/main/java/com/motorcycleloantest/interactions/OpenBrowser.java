package com.motorcycleloantest.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.OpenBrowser;

public class OpenBrowser implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OpenBrowser.with(System.getProperty("browser")));
    }
}