import co.com.bancolombia.certification.Wingo2.userinterfaces.ComprarVueloUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ComprarVueloTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ComprarVueloUI.ABRIR),
                Click.on(ComprarVueloUI.BOGOTA),
                Click.on(ComprarVueloUI.CALI),
                Click.on(ComprarVueloUI.FECHA1),
                Click.on(ComprarVueloUI.FECHA2),
                Click.on(ComprarVueloUI.AGREGARADUL),
                Click.on(ComprarVueloUI.SELECADULT),
                Click.on(ComprarVueloUI.BTNBUSCAR)



        );
    }
    public static ComprarVueloTasks makeinformation(){
        return instrumented (ComprarVueloTasks.class);
    }
}