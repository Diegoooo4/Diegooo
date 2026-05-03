package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio13 {
    public static long string(List<String>strings){
        return strings.stream().filter(n->n.length()>=6).count();
    }
    public static class Main {
        public static void main(String[] args) {
            List<String> cadenasTexto = Arrays.asList("pedro", "carla", "Alvaro");

            System.out.println(string(cadenasTexto));
        }
    }
}
