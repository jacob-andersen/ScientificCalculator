import java.util.Scanner;
import java.lang.*;

public class Memory{

  Scanner stdin = new Scanner(System.in);
  private double memNum;

  public double getMemNum(){
    return memNum;
  }
  public void setMemNum(){
    System.out.println("Enter number to store to memory");
    num = stdin.nextDouble();
    memNum = num;
  }
}
