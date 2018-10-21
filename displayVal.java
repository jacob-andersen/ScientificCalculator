import java.util.Scanner;
import java.lang.*;

public class displayVal{

  Scanner stdin = new Scanner(System.in);
  private double displayValue = 0;

  public double getMemNum(){
     return this.memNum;
  }
  public void setMemNum(){
    System.out.println("Enter number to store to memory");
    System.out.print("> ");
    double num = stdin.nextDouble();
    this.memNum = num;
  }
}
