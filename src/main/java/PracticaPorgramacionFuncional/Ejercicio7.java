package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {
    public static List<Integer> numeros(List<Integer>listEnteros){
        return  listEnteros.stream().map(n->n*n).toList();
    }

    public static void main(String[] args){
        List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(numeros(list));
    }
}
