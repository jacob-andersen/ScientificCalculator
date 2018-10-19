import java.util.Scanner;
import java.lang.*;

public class SciCalculator{

  public static void main(String[] args){

    Scanner stdin = new Scanner(System.in);

    boolean isOn = true;
    int choice;
    double displayNumber = 0;

    while(isOn){
        //display prompt
      System.out.println("-----------------");
      System.out.println(displayNumber);
      System.out.println("-----------------");
      System.out.println("Please choose a function (enter # 1-4)");
      System.out.println("(1) Change units");
      System.out.println("(2) Change number system");
      System.out.println("(3) Access memory functions (M+, MC, MRC)");
      System.out.println("(4) Execute calculation");
      System.out.println("(5) Clear display");
      System.out.println("-----------------");
      System.out.println("(6)Quit program");

      choice = stdin.nextInt();

      switch(choice){
        case 1:System.out.println("call change units function");//call change units function
                break;
        case 2:System.out.println("call number system function");//call number system function
                break;
        case 3:System.out.println("call memory function");//call memory function
                break;
        case 4:System.out.println("call operations function");//call operations function
                break;
        case 5:System.out.println("clear display");//clear display
                break;
        case 6:System.out.println("Goodbye");//clear display
                isOn = false;
                break;
      }
    }
  }
}
