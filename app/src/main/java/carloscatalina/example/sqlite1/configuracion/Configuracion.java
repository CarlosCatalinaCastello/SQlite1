package carloscatalina.example.sqlite1.configuracion;

import java.text.NumberFormat;

public class Configuracion {
    public static final String BD_NAME = "tienda.bd";
    public static final int BD_VERSION = 1;
    public static final NumberFormat NF;
    public static final NumberFormat NFM;

    static{
        NF = NumberFormat.getNumberInstance();
        NFM = NumberFormat.getCurrencyInstance();
    }
}
