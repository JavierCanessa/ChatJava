package clase03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Arrays;
import java.util.Comparator;

public class ClienteMinimo2 {
    private static String[] semana={"Lunes.","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
    public static void main(String[] args) {
        String linea;
        try (BufferedReader in=new BufferedReader(
                new InputStreamReader(
                        new Socket("localhost",5000).getInputStream()));){
            //while((linea=in.readLine())!=null){
            //    System.out.println(linea);
            //}No Usar este metodo
            
            //in.lines().forEach(x->System.out.println(x));
            //in.lines().forEach(System.out::println);
            
            //in.lines().sorted().forEach(System.out::println);
            //in.lines().sorted(Comparator.reverseOrder()).forEach(System.out::println);
            
            in
                    .lines()
                    //.filter(x->x.toLowerCase().contains("m"))
                    .sorted()
                    .forEach(System.out::println);
            
            
            Arrays
                    .asList(semana)
                    .stream()
                    .filter(x->x.toLowerCase().contains("m"))
                    .sorted()
                    .forEach(System.out::println);
            
            System.out.println("*********************************************");
            //in.lines().filter(x->Arrays.asList(semana).contains(x)) 
            //        .sorted()
            //        .forEach(System.out::println);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
