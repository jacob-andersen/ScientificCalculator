import java.util.Scanner;
import java.lang.*;

public class SciCalculator{

  public static void main(String[] args){

    Scanner stdin = new Scanner(System.in);

    boolean isOn = true;
    int choice;

    Memory memNumber = new Memory();
    DisplayVal val = new DisplayVal();

    while(isOn){
        //display prompt
      System.out.println("\n******************************************");
      System.out.println(String.format("%"+30+"s", "Scientific Calculator"));
      System.out.println("------------------------------------------");
      System.out.println("Number System: " + val.getNumSys());
      System.out.println("------------------------------------------");
      System.out.println(val.valToString(val.getValue()));
      System.out.println("==========================================");
      System.out.println("Please choose a function (enter # 1-6)");
      System.out.println("(1) Input value to calculator");
      System.out.println("(2) Execute calculation");
      System.out.println("(3) Access memory functions (M+, MC, MRC)");
      System.out.println("(4) Change number system "); //may link to class
      System.out.println("(5) Change units (maybe)"); //may link to class
      System.out.println("(6) Clear display");
      System.out.println("------------------------------------------");
      System.out.println("(7)Quit program");
      System.out.println("******************************************");
      System.out.print("> ");

      choice = stdin.nextInt();

      switch(choice){
        case 1: System.out.println("Enter the value you want to input to calculator:");//call change units function
                System.out.print("> ");
                double inVal = stdin.nextDouble();
                val.setValue(inVal);
              break;
        case 2: Operations op = new Operations();
                val.setValue(op.chooseOp(val.getValue()));//call operations function
              break;
        case 3: System.out.println("\n------------------------------------------");
                System.out.println("Choose memory function (enter 1 or 2)");
                System.out.println("(1) Recall value in memory");
                System.out.println("(2) Update value in memory");
                System.out.println("------------------------------------------");
                System.out.print("> ");
                int mem = stdin.nextInt();
                if(mem == 1){
                  val.setValue(memNumber.getMemNum());
                }
                else if(mem == 2){
                  memNumber.setMemNum();
                }
                else{
                  System.out.println("Value in memory is: " + memNumber.getMemNum());
                }
                break;
        case 4: val.setNumSys();//clear display
              break;
        case 5: System.out.println("units func");;//clear display
              break;
        case 6: System.out.println("clear display function");
              break;
        case 7:System.out.println("Goodbye");//clear display
                isOn = false;
              break;
        default:
              break;
      }
    }
  }
}
