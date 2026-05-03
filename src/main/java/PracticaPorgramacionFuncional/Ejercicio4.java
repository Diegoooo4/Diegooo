package PracticaPorgramacionFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;

public class Ejercicio4 {
    public static int numeros(List<Integer>maxnm){
        return maxnm.stream().mapToInt(Integer::intValue).max().orElseThrow(()-> new NoSuchElementException("no valido"));
    }

    public static class Main{
        public static void main(String[] args){
            List<Integer>list = Arrays.asList(1,2,3,20,4,5,6,7,8,9);


            System.out.println(numeros(list));
        }
    }
}
