package ejercicio2;

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 2
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
}