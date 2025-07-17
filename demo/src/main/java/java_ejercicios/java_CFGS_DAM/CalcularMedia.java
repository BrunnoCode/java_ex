
import java.util.Scanner;

public class CalcularMedia{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Porfavor indique sus 3 ultimas notas:");
    double nota1, nota2, nota3;

    System.out.print("1º nota: ");
    nota1=0.0;
    nota1 = scan.nextDouble();
    System.out.print("2º nota: ");
    nota2=0.0;
    nota2 = scan.nextDouble();
    System.out.print("3º nota: ");
    nota3=0.0;
    nota3 = scan.nextDouble();
    
    
    
    calculador(nota1, nota2, nota3);
    scan.close();
  }
  public static void calculador(double nota1, double nota2, double nota3){
    double resultado = (nota1+nota2+nota3)/3;
    System.out.printf("Nota promedio es: %.2f\n", resultado);
    if (resultado > 5.0)
      System.out.println("Enhorabuena, Aprobado!");
    else
      System.out.printf("Reprobado, promedio inferior a 5 resultado del promedio: %.2f\n",resultado);
  }
}