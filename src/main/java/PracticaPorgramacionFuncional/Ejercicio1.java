package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {


    public static int listaEnteros(List<Integer>numeros){
        return numeros.stream().reduce(0, Integer::sum);
    }
    public static class Main{
        public static void main(String[] args){
            List<Integer>listardenumeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

            System.out.println(listaEnteros(listardenumeros));


        }
    }
}
