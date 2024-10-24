package java_ejercicios;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // EJERCICIO 2
        Ejercicio2.array(); // array de interos
        Metodos.putline();
        // ARRAY BIDIMENSIONAL
        int[][] matrix = {{1,15,65,9},{5,22,65,48},{62,69,47,5},{45,88,77,3}};
        Ejercicio2.arrayBiDimensional(matrix);
        Metodos.putline();

        // EJERCICIO 3

        // LISTAS ENLAZADAS
        Ejercicio3.showLinkedList();
        Metodos.putline();

        // STACKS PILAS
        Ejercicio3.myStack();
        Metodos.putline();

        // FILAS
        Ejercicio3.myQueue();
        Metodos.putline();
        
        // EJERCICIO 4
        // OBJETO COCHE
        Coche car = new Coche();
        car.setMarca("BMW");
        car.setModelo("X6");
        car.setYear(2024);
        System.out.println(car.toString());
        Metodos.putline();

        // EJERCICIO 5 LECTURA y ESCRITA DE ARCHIVOS

        // CREANDO ARCHIVO.TXT
        String file = "ejemplo.txt";
        Ejercicio5.creatFileTxt(file);

        // LEYENDO ARCHIVO.TXT
        Ejercicio5.readFile(file);
        Metodos.putline();
        // EJERCICIO 6 OTRAS ESTRUCTURAS MAS COMPLEJAS
        HashMap<String, Integer> keys = new HashMap<>();
        keys.put("Jose", 54);
        keys.put("Manuela", 21);
        keys.put("Carlos", 35);

        for (String clave : keys.keySet()){
            System.out.println("Nombre: "+clave+", Edad: "+keys.get(clave)+" años");
        }
    }
}