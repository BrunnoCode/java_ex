package java_ejercicios;

import java.util.LinkedList;

public class Ejercicio3 {

  // Lista Linkada
  public static void showLinkedList(){
    LinkedList<String> names = new LinkedList<>();
    names.add("Brunno");
    names.add("Lucas");
    names.add("Daniel");
    names.add("John Kennedy");

    for (String nombre : names){
      System.out.println(nombre);
    }
  }
  
}
