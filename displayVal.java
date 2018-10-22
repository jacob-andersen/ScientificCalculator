import java.util.Scanner;
import java.lang.*;

public class DisplayVal{

  private double value = 0;
  private String numSys = "Decimal";
  private String disVal = "0";
  Scanner stdin = new Scanner(System.in);

  NumSystemsConverter conv = new NumSystemsConverter();


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
  this.setDisVal(conv.updateDisplayNumber(this.value,num)); //not working
}

public void toggleNumSys(){
  if(this.numSys == "Decimal"){
    this.numSys = "Binary";
  } else if(this.numSys == "Binary"){
    this.numSys = "Octal";
  } else if(this.numSys == "Octal"){
    this.numSys = "Hexadecimal";
  } else if(this.numSys == "Hexadecimal"){
    this.numSys = "Decimal";
  } else {
    this.numSys = "Decimal";
  }

}

public String getNumSys(){
  return this.numSys;
}

public void setDisVal(String value){
  this.disVal = value;
}


  public String valToString(double num){
    String displayStr = new String();
    displayStr += "" + num;
    return displayStr;
  }
}
