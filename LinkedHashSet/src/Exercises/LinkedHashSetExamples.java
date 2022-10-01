/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercises;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author USUARIO
 */
public class LinkedHashSetExamples {
    
    public void Example1 (){
    LinkedHashSet<String> nomApe = new LinkedHashSet();

        nomApe.add("Joel Salazar");
        nomApe.add("Ana Guerrero");
        nomApe.add("Sergio Rocha");
        nomApe.add("Sofía Ramos");
        nomApe.add("Erick Martínez");
        //No se va a agregar el nuevo elemento "Sergio Rocha" porque ya existe
        nomApe.add("Sergio Rocha");
        nomApe.add("Luis Roa");
        nomApe.add("Giselle Osorio");

        System.out.println("LinkedHashSet 1: " + nomApe);
        System.out.println("Tamaño del LinkedHashSet: " + nomApe.size());
        System.out.println("Verificando si se encuentra Sofía Ramos: " + nomApe.contains("Sofía Ramos"));
        System.out.println("Removiendo a Giselle: " + nomApe.remove("Giselle Osorio"));
        System.out.println("Removiendo a Inocencio que no está presente: " + nomApe.remove("Inocencio Jiménez"));
        System.out.println("LinkedHasSet actualizado: " + nomApe);
        
        Iterator itr = nomApe.iterator();
        
        System.out.println("Iteración de LinkHashSet 1: ");
        while (itr.hasNext()){
            System.out.println(itr.next() + " ,");
        }
}
    public void Example2(){
        LinkedHashSet<Integer> oddNum = new LinkedHashSet();

        oddNum.add(1);
        oddNum.add(3);
        oddNum.add(5);
        oddNum.add(7);
        oddNum.add(9);

        System.out.println("LinkedHashSet 2: " + oddNum);

        LinkedHashSet<Integer> nextOdd = new LinkedHashSet();
        
        nextOdd.addAll(oddNum);
        
        nextOdd.add(11);
        nextOdd.add(13);
        nextOdd.add(15);
        nextOdd.add(17);
        nextOdd.add(19);
        
        System.out.println("Union de LinkHashSet 2 y 3: " + nextOdd);

    }
}
