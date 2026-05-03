package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio9 {
    public static Integer numeros(List<Integer>enteros, int valor){
        return enteros.stream().filter(n->n>valor).findFirst().orElse(null);
    }
    public static void main (String[] args){
        List<Integer>lista = Arrays.asList(1,2,3,4,6,6,7,8,9,40,30);

        System.out.println(numeros(lista,10));
    }
}
