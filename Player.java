import java.util.Scanner;

public class Player {
    private String name;
    private int score;

  public Player()
  {
   
    System.out.println("Enter Name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();
    System.out.println(" Welcome to the Game of Nim " + name + "!");
    score = 0;
  }

  public String getName(){
    return name;
  }

  public int getScore(){
    return score;
  }
 
  public void setName(String inputName){
    name = inputName;
  }

  public void increaseScore(){
    score ++; 
  }

}




