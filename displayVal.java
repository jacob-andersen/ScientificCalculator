import java.util.Scanner;
import java.lang.*;

public class DisplayVal{

  private double value = 0;

  //Scanner stdin = new Scanner(System.in);

  public double getValue(){
     return this.value;
  }
  public void setValue(double num){
    this.value = num;
  }

  public String valToString(double num){
    String displayStr = new String();
    displayStr += "" + num;
    return displayStr;
  }
}
