package com.motorcycleloantest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Navigate;

public class NavigateToPage implements Task {

    private final String pageUrl;

    public NavigateToPage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Navigate.to(pageUrl));
    }
}
