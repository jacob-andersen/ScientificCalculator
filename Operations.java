import java.util.Scanner;
import java.lang.*;

public class Operations{

  Scanner stdin = new Scanner(System.in);


public double chooseOp(double num){

  boolean isValid = false;
  int choice;
  double result = -1;

  while(!isValid){
    System.out.println("\n-------------------------------------------------");
    System.out.println("Select type of operation to perform (enter # 1-3)");
    System.out.println("(1) Core Functions");
    System.out.println("(2) Trigonometry");
    System.out.println("(3) Advanced Functions");
    System.out.println("-------------------------------------------------");
    System.out.print("> ");
    choice = stdin.nextInt();

    switch(choice){
      case 1: result = coreFunc(num);
              isValid = true;
              break;
      case 2: result = trigFunc(num);
              isValid = true;
              break;
      case 3: result = advFunc(num);
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
  double entNum, result = 0;


  while(!isValid){
    System.out.println("\n---------------------------------------------");
    System.out.println("Select core function to perform (enter # 1-9)");
    System.out.println("(1) Add");
    System.out.println("(2) Subtract");
    System.out.println("(3) Multiply");
    System.out.println("(4) Divide");
    System.out.println("(5) Square");
    System.out.println("(6) Square Root");
    System.out.println("(7) Exponentiation");
    System.out.println("(8) Inverse (1/x)");
    System.out.println("(9) Change sign (+/-)");
    System.out.println("---------------------------------------------");
    System.out.print("> ");
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
      case 5: System.out.println("Squaring number on display (" + num + "^2) ");
              result = num * num;
              isValid = true;
            break;
      case 6: System.out.println("Taking square root of " + num);//cant take negative #
              result = Math.sqrt(num);
              isValid = true;
            break;
      case 7: System.out.println("Enter exponent to raise " + num + " to (" + num + "^n)");
              entNum = stdin.nextDouble();
              result = num * entNum;
              isValid = true;
            break;
      case 8: System.out.println("Calculating inverse of " + num + " (1/" + num + ")");
              result = 1/num;
              isValid = true;
            break;
      case 9: System.out.println("Calculating negation of  " + num + " (n -> -n , -n -> n)");
              result = num * -1;
              isValid = true;
            break;
      default:
            break;
    }
  }
  return result;
}


public double trigFunc(double num){ //take displayNum as input parameter

  boolean isValid = false;
  int choice;
  double result = -0;

  while(!isValid){
    System.out.println("\n--------------------------------------------");
    System.out.println("Select trigonemtric function (enter # 1-6)");
    System.out.println("(1) Sin");
    System.out.println("(2) Cos");
    System.out.println("(3) Tangent");
    System.out.println("(4) ArcSin");
    System.out.println("(5) ArcCos");
    System.out.println("(6) ArcTan");
    System.out.println("--------------------------------------------");
    System.out.print("> ");
    choice = stdin.nextInt();

    switch(choice){
      case 1: System.out.println("Calculating sine of " + num);
              result = Math.sin(num);
              isValid = true;
              break;
      case 2: System.out.println("Calculating cosine of " + num);
              result = Math.cos(num);
              isValid = true;
              break;
      case 3: System.out.println("Calculating tangent of " + num);
              result = Math.tan(num);
              isValid = true;
              break;
      case 4: System.out.println("Calculating inverse sine (arcSin) of " + num);
              result = Math.asin(num);
              isValid = true;
              break;
      case 5: System.out.println("Calculating inverse cosine (arcCos) of " + num);
              result = Math.acos(num);
              isValid = true;
              break;
      case 6: System.out.println("Calculating inverse tangent (arcTan) of " + num);
              result = Math.atan(num);
              isValid = true;
              break;

    }
  }
  return result;
}

public double advFunc(double num){ //take displayNum as input parameter

  boolean isValid = false;
  int choice;
  double result = 0;

  while(!isValid){
    System.out.println("\n-------------------------------------------------");
    System.out.println("Select advanced function to perform (enter # 1-7)");
    System.out.println("(1) Factorial");
    System.out.println("(2) Log");
    System.out.println("(3) Inverse log (10^x)");
    System.out.println("(4) Natural log (Ln x)");
    System.out.println("(5) Inverse Natural log (e^x)");
    System.out.println("(6) Cubed root"); //add custom 1
    System.out.println("(7) Absolute value");//add custom 2
    System.out.println("-------------------------------------------------");
    System.out.print("> ");
    choice = stdin.nextInt();

    switch(choice){
      case 1: System.out.println("Calculating factorial of " + num);
              int i;
              double fct = 1;
              for(i=2; i<num; i++){
                fct *= i;
              }
              result = fct;
              isValid = true;
              break;
      case 2: System.out.println("Calculating log of " + num);
              result = Math.log10(num);
              isValid = true;
              break;
      case 3: System.out.println("Calculating inverse log (10^x) of " + num);
              result = Math.pow(10 , Math.log10(num));
              isValid = true;
              break;
      case 4: System.out.println("Calculating natural log (Ln) of " + num);
              result = Math.log(num);
              isValid = true;
              break;
      case 5: System.out.println("Calculating inverese natural log (e^x) of " + num);
              result = Math.exp(num);
              isValid = true;
              break;
      case 6: System.out.println("Calculating cubed root of " + num);
              result = Math.cbrt(num);
              isValid = true;
              break;
      case 7: System.out.println("Calculating absolute value of " + num);
              result = Math.abs(num);
              isValid = true;
              break;
      default:
            break;

    }
  }
  return result;
}

}
