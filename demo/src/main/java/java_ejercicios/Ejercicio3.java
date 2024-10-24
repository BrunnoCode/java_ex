package java_ejercicios;

import java.util.LinkedList;
import java.util.Stack;

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

  // STACKS PILAS
  public static void myStack(){
    Stack<Integer> newStack = new Stack<>();
    newStack.push(15);
    newStack.push(56);
    newStack.push(65);
    System.out.println("Numeros insertados: "+newStack+"\nNumero removido: "+newStack.pop()+"\nNumero en el topo de la pila: "+newStack.peek());
  }
  
}
