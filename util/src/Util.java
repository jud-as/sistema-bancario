import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Util {

    static NumberFormat formatarValores = new DecimalFormat("R$ #,##0.00");

    public static String doubleToString(Double valor){
        return formatarValores.format(valor);
    }

    public static double gerarValorAleatorio(float min, float max){
        return (double) (Math.random() * (max - min) + min);
    }

}
