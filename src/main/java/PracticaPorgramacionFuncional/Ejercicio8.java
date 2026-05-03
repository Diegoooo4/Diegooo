package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ejercicio8 {
    public static List<Integer> numeros(List<Integer>duplicados){
        return duplicados.stream().distinct().toList();
    }
    public static void main (String[] args){
        List<Integer>list = Arrays.asList(1,2,3,4,6,6,7,8,9);

        System.out.println(numeros(list));
    }
}
