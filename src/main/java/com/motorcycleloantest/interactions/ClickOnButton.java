package com.motorcycleloantest.interactions;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebElement;

public class ClickOnButton {

    public class ClickOnButton implements Interaction {

        private final WebElement button;

        public ClickOnButton(WebElement button) {
            this.button = button;
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(button));
        }
    }
}
