import java.util.Scanner;
import java.lang.*;

public class DisplayVal{

  private double value = 0;
  private String numSys = "Decimal";
  Scanner stdin = new Scanner(System.in);

  //Scanner stdin = new Scanner(System.in);

  public double getValue(){
     return this.value;
  }
  public void setValue(double num){
    this.value = num;
  }

  public void setNumSys(){
    System.out.println("Select number system to use: (Enter # 1-4)");
    System.out.println("(1)Decimal");
    System.out.println("(2)Binary");
    System.out.println("(3)Octal");
    System.out.println("(4)Hexadecimal");
    System.out.print("> ");
    int num = stdin.nextInt();

    switch(num){
      case 1:
              this.numSys = "Decimal";
            break;
      case 2:
              this.numSys = "Binary";
            break;
      case 3:
              this.numSys = "Octal";
            break;
      case 4:
              this.numSys = "Hexadecimal";
            break;
  }
}

public String getNumSys(){
  return this.numSys;
}

  public String valToString(double num){
    String displayStr = new String();
    displayStr += "" + num;
    return displayStr;
  }
}
