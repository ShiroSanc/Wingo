package co.com.bancolombia.certification.Wingo2.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ComprarVueloUI {
        public static final Target ABRIR = Target.the("Abrir").
                locatedBy("(//div[@class='select']/div)[1]");
        public static final Target BOGOTA = Target.the("Bogota").
                locatedBy("//li[@data-cod='BOG']");

        public static final Target CALI = Target.the("Cali").
                locatedBy("(//li[@data-cod='CLO'])[2]");
        public static final Target FECHA1 = Target.the("Fecha1").
                locatedBy("(//*[text()='22'])[4]");

        public static final Target FECHA2 = Target.the("Fecha2").
                locatedBy("(//*[text()='22'])[4]");

        public static final Target AGREGARADUL= Target.the("Agregaradult").
                locatedBy("//div[@class='icon-chev']");

        public static final Target SELECADULT= Target.the("Seleccadult").
                locatedBy("//div[@class='icon-chev']");

        public static final Target BTNBUSCAR= Target.the("BTNBuscar").
                locatedBy("(//div[@class='input']");


}
