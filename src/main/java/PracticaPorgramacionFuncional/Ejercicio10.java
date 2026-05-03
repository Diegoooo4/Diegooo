package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio10 {
    public static long string(List<String>palabras){
        return palabras.stream().filter(n->n.startsWith("A")).count();
    }
    public static class Main {
        public static void main(String[] args) {
            List<String> cadenasTexto = Arrays.asList("pedro","carla","Alvaro");

            System.out.println(string(cadenasTexto));
        }
    }
}
