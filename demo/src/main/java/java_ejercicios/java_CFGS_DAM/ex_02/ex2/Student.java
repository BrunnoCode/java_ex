package java_ejercicios.java_CFGS_DAM.ex_02.ex2;

public class Student{
  
  private Integer id;
  private String name;
  private double score;

  public Student(Integer id, String name, double score) {
    this.id = id;
    this.name = name;
    this.score = score;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
  }
}