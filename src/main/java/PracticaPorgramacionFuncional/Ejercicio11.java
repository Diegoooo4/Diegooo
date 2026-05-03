package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Ejercicio11 {
    public static List<Integer> notas(List<Integer>list){
        return list.stream().filter(n->n>=5).toList();
    }
    public static void main (String[] args){
        List<Integer>lista = Arrays.asList(1,2,3,4,6,6,7,8,9);

        System.out.println(notas(lista));
    }
}
