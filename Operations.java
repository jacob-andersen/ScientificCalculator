import java.util.Scanner;
import java.lang.*;

public class Operations{

  Scanner stdin = new Scanner(System.in);


public double chooseOp(double num){

  boolean isValid = false;
  int choice;
  double result = -1;

  while(!isValid){
    System.out.println("Select type of operation to perform (enter # 1-3)");
    System.out.println("(1) Core Functions");
    System.out.println("(2) Trigonometry");
    System.out.println("(3) Advanced Functions");
    choice = stdin.nextInt();

    switch(choice){
      case 1: result = coreFunc(num);
              isValid = true;
              break;
      case 2:trigFunc();
              isValid = true;
              break;
      case 3:advFunc();
              isValid = true;
              break;
      default:
              break;
   }
  }
  return result;
}

public double coreFunc(double num){ //take displayNum as input parameter

  boolean isValid = false;
  int choice;
  double entNum, result = -1;


  while(!isValid){
    System.out.println("Select core function to perform (enter # 1-3)");
    System.out.println("(1) Add");
    System.out.println("(2) Subtract");
    System.out.println("(3) Multiply");
    System.out.println("(4) Divide");
    System.out.println("(5) Square");
    System.out.println("(6) Square Root");
    System.out.println("(7) Exponentiation");
    System.out.println("(8) Inverse (1/x)");
    System.out.println("(9) Change sign (+/-)");
    choice = stdin.nextInt();

    switch(choice){
      case 1: System.out.println("Enter number to add to " + num + ": ");
              entNum = stdin.nextDouble();
              result = num + entNum;
              isValid = true;
            break;
      case 2: System.out.println("Enter number to subtract from " + num + ": ");
              entNum = stdin.nextDouble();
              result = num - entNum;
              isValid = true;
            break;
      case 3: System.out.println("Enter number to multiply to " + num + ": ");
              entNum = stdin.nextDouble();
              result = num * entNum;
              isValid = true;
              break;
      case 4: System.out.println("Enter number to divide from " + num + ": ");
              entNum = stdin.nextDouble();
              result = num / entNum; //use Double.isNaN(x)
              isValid = true;
              break;
      case 5:
              isValid = true;
              break;
      case 6:
              isValid = true;
              break;
      case 7:
              isValid = true;
              break;
      case 8:
              isValid = true;
              break;
      case 9:
              isValid = true;
              break;
      default:
              break;
    }
  }
  return result;
}


public double trigFunc(){ //take displayNum as input parameter

  boolean isValid = false;
  int choice;
  double result = -1;

  while(!isValid){
    System.out.println("Select trigonemtric function to perform (enter # 1-3)");
    System.out.println("(1) Sin");
    System.out.println("(2) Cos");
    System.out.println("(3) Tangent");
    System.out.println("(4) ArcSin");
    System.out.println("(5) ArcCos");
    System.out.println("(6) ArcTan");
    choice = stdin.nextInt();

    switch(choice){
      case 1:
              isValid = true;
              break;
      case 2:
              isValid = true;
              break;
      case 3:
              isValid = true;
              break;
      case 4:
              isValid = true;
              break;
      case 5:
              isValid = true;
              break;
      case 6:
              isValid = true;
              break;

    }
  }
  return 2;
}

public double advFunc(){ //take displayNum as input parameter

  boolean isValid = false;
  int choice;

  while(!isValid){
    System.out.println("Select advanced function to perform (enter # 1-3)");
    System.out.println("(1) Factorial");
    System.out.println("(2) Log");
    System.out.println("(3) Inverse log (10^x)");
    System.out.println("(4) Natural log (Ln x)");
    System.out.println("(5) Inverse Natural log (e^x)");
    System.out.println("(6) custom 1"); //add custom 1
    System.out.println("(7) Exponentiation");//add custom 2
    choice = stdin.nextInt();

    switch(choice){
      case 1:
              isValid = true;
              break;
      case 2:
              isValid = true;
              break;
      case 3:
              isValid = true;
              break;
      case 4:
              isValid = true;
              break;
      case 5:
              isValid = true;
              break;
      case 6:
              isValid = true;
              break;
      case 7:
              isValid = true;
              break;
      case 8:
              isValid = true;
              break;
      case 9:
              isValid = true;
              break;
      default:

    }
  }
  return 3;
}

}
