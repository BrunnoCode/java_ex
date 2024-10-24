// EJERCICIO 4 ESTRUCTURAS
package java_ejercicios;

public class Coche {
  private String marca;
  private String modelo;
  private int year;

  public Coche(){};

  public Coche(String marca, String modelo, int year){
    this.marca = marca;
    this.modelo = modelo;
    this.year = year;
  }

  public String getMarca(){
    return this.marca;
  }
  public void setMarca(String marca){
    this.marca = marca;
  }
  public String getModelo(){
    return this.modelo;
  }
  public void setModelo(String modelo){
    this.modelo = modelo;
  }
  public int getYear(){
    return this.year;
  }
  public void setYear(int year){
    this.year = year;
  }

  @Override

  public String toString(){
    return "Coche: "+getMarca()+"\nModelo: "+getModelo()+"\nAño: "+getYear();
  }
}
