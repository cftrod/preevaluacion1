/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVIDAD;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota,suma_nota,promedio;
       // float suma_nota;
       // float promedio=0;
      
        float promedio_final;
        int i;
        suma_nota=0;
        Scanner lector = new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            System.out.println("Ingrese nota:  ");
            nota=lector.nextFloat();
            suma_nota=suma_nota+nota;            
        }
        promedio=suma_nota/3;
        System.out.println("El promedio es =  " + promedio);
        if(promedio<5.5)
        {
            System.out.println("Alumno debe dar examen");
            float nota_esperada_examen;
            nota_esperada_examen=(float) ((4.0-(0.7*promedio))/0.3);
            System.out.println("La nota esperada en examen debe ser mayor a: "+nota_esperada_examen);
            System.out.println("Ingrese nota examen");
            float examen = lector.nextFloat();
            promedio_final = (float) ((0.7*promedio)+(0.3*examen));        
            if(promedio_final>4)
            
                System.out.println("Alumno aprobo curso....felicidades!!!. Aprueba con un " + promedio_final);
            else
                System.out.println("Lo siento, sera para la proxima oportunidad");
        }            
        else
            System.out.println("Aprobado");       
        System.out.println("CAMBIO PARA GITHUB");// TODO code application logic here
    }
    
}
