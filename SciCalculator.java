import java.util.Scanner;
import java.lang.*;

public class SciCalculator{

  public static void main(String[] args){

    Scanner stdin = new Scanner(System.in);

    boolean isOn = true;
    int choice;
    double displayNumber = 0;

    Memory memNumber = new Memory();

    while(isOn){
        //display prompt
      System.out.println("\n******************************************");
      System.out.println(String.format("%"+32+"s", "Scientific Calculator"));
      System.out.println("------------------------------------------");
      System.out.println(displayNumber);
      System.out.println("==========================================");
      System.out.println("Please choose a function (enter # 1-6)");
      System.out.println("(1) Change units");
      System.out.println("(2) Change number system");
      System.out.println("(3) Access memory functions (M+, MC, MRC)");
      System.out.println("(4) Execute calculation");
      System.out.println("(5) Clear display");
      System.out.println("------------------------------------------");
      System.out.println("(6)Quit program");
      System.out.println("******************************************");
      System.out.print("> ");

      choice = stdin.nextInt();

      switch(choice){
        case 1:System.out.println("call change units function");//call change units function
                break;
        case 2:System.out.println("call number system function");//call number system function
                break;
        case 3: System.out.println("------------------------------------------");
                System.out.println("Choose memory function (enter 1 or 2)");
                System.out.println("(1) Recall value in memory");
                System.out.println("(2) Update value in memory");
                System.out.println("------------------------------------------");
                System.out.print("> ");
                int mem = stdin.nextInt();
                if(mem == 1)
                  displayNumber = memNumber.getMemNum();
                else if(mem == 2)
                  memNumber.setMemNum();
                else{
                  System.out.println("Value in memory is: " + memNumber.getMemNum());
                }
                break;
        case 4: Operations op = new Operations();
                displayNumber = op.chooseOp(displayNumber);//call operations function
                break;
        case 5:System.out.println("clear display");//clear display
                break;
        case 6:System.out.println("Goodbye");//clear display
                isOn = false;
                break;
        default:
                break;
      }
    }
  }
}
