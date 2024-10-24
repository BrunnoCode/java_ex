package java_ejercicios;

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
    }
}