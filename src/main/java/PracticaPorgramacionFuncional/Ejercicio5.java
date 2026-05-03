package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static int numer(List<Integer> enteros, int valor) {
        return (int) enteros.stream().filter(v -> v > valor).count();
    }

    public static class Main {
        public static void main(String[] args){
            List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9,20);

            System.out.println(numer(list,10));
        }
    }
}
