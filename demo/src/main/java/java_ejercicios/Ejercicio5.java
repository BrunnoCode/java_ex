package java_ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {
  // EJERCICIO 5 LECTURA y ESCRITA DE FICHEROS
  public static void creatFileTxt(String name){
    try {
      FileWriter creatorFile = new FileWriter(name);
      creatorFile.write("Este es un archivo de prueba\n");
      creatorFile.close();
    } catch (IOException e) {
      System.out.println("Error en escribir en el archivo!");
      e.printStackTrace();
  }
}
public static void readFile(String file){
  try {
    FileReader lector = new FileReader(file);
    BufferedReader buffer = new BufferedReader(lector);

    String line;
    while((line = buffer.readLine()) != null){
      System.out.println(line);
    }
    buffer.close();
    
  } catch (IOException e) {
    System.out.println("Error al leer el archivo!");
    e.printStackTrace();
  }
}

}
