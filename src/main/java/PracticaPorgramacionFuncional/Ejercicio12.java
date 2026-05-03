package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio12 {
    public static List<String> string(List<String>palabras){
        return palabras.stream().map(String::toUpperCase).toList();
    }
    public static class Main {
        public static void main(String[] args) {
            List<String> cadenasTexto = Arrays.asList("pedro","carla","Alvaro");

            System.out.println(string(cadenasTexto));
        }
    }
}
