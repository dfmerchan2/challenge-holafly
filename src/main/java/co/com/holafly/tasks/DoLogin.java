package co.com.holafly.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.holafly.userinterfaces.LoginPage.TXT_PASSWORD;
import static co.com.holafly.userinterfaces.LoginPage.TXT_USER;
import static co.com.holafly.userinterfaces.LoginPage.BTN_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class DoLogin implements Task {

  private final String user;
  private final String password;

  @Override
  @Step("{0} enter the credentials in the application")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(TXT_USER, isVisible()).forNoMoreThan(10).seconds(),
        Enter.theValue(user).into(TXT_USER),
        Enter.theValue(password).into(TXT_PASSWORD),
        Click.on(BTN_LOGIN));
  }

  public static Performable inSwagLabs(String user, String password) {
    return instrumented(DoLogin.class, user, password);
  }
}
