package java_ejercicios;

public class Ejercicio2 {

  public static void array(){
    // EJERCICIO 2
    // ARRAYS
    int[] array = new int[5];
    int value = 10;
    for (int i = 0; i < array.length; i++){
        array[i] = value;
        value += 10;
    }
    for (int i = 0; i < array.length; i++){
        System.out.print("["+array[i]+"]");
    }
    System.out.println();
  }

  // ARRAY BIDIMENSIONAL
  public static void arrayBiDimensional(int[][] matrix){
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[i].length; j++){
        System.out.print("["+matrix[i][j]+"] ");
      }
      System.out.println();
    }
  }
}
