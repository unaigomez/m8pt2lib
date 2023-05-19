import java.util.List;


public class mates1 {
    public static double calcularMedia(List<Double> numeros) {
        double suma = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }
}
