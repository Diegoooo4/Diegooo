package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {

    public static List<String>strings(List<String>mayusculas){
        return mayusculas.stream().map(String::toUpperCase).toList();
    }

    public static class Main {
        public static void main(String[] args) {
            List<String> cadenasTexto = Arrays.asList("pedro","carla");

            System.out.println(strings(cadenasTexto));
        }
    }
}
