package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static List<Integer> par(List<Integer>numero){
        return numero.stream().filter(a->a%2==0).toList();
    }

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(par(numeros));
    }
}
