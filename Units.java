import java.util.Scanner;

public class Units
{

Scanner units = new Scanner(System.in);

    public double choice (double num) {

        boolean isValid = false;
        int modechoice = 0;
        double result = 0;

    while(!isValid){
    System.out.println("\n-------------------------------------------------");
    System.out.println(num);
    System.out.println("-------------------------------------------------");
    System.out.println("Select which unit you would like to convert to (enter #1 or #2)");
    System.out.println("(1) Degrees");
    System.out.println("(2) Radians");
    System.out.println("--------------------------------------------");
    System.out.print("> ");
    modechoice = units.nextInt();

    switch(modechoice){
        case 1: result = this.degrees(num);
        isValid = true;
        break;
        case 2: result = this.radians(num);
        isValid = true;
        break; }
    }
    return result;
    }

    public double degrees (double num) {

        System.out.println("Please enter your value for degree conversion");

          boolean isValid = false;
          double output = 0;
          double input = units.nextInt();

          if (!Double.isNaN(num)) {
              System.out.println("Calculating degrees of " + input);
              num = Math.toDegrees(input);
              System.out.println(num);}
          else {
              System.out.println("Please enter your value");
                      }
          return num;
    };
    public double radians (double num) {

        System.out.println("Please enter your value for radian conversion");

    boolean isValid = true;
    double output = 0;
    double input = units.nextInt();

        if (!Double.isNaN(num)) {
              System.out.println("Calculating radians of " + input);
              num = Math.toRadians(input);
              System.out.println(num);}
        else {
            System.out.println("Please enter your value");
        }
        return num;

}



}
