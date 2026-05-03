package PracticaPorgramacionFuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio14 {
    public static void main(String[] args){
        List<Alumno>alumnos1 = Arrays.asList(
                new Alumno("Alvaro",6),
                new Alumno("Mñaño",7),
                new Alumno("Joder",10),
                new Alumno("Carlos",2),
                new Alumno("Pablo",4)
        );
         alumnos1.stream().max(Comparator.comparingInt(Alumno::getNota)).ifPresent(Ejercicio14-> System.out.println("Mejor nota"+Ejercicio14.getNombre()));
    }
}
