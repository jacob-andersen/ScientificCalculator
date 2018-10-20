
/**
 * Write a description of class SwitchModes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchModes
{
    // instance variables - replace the example below with your own
    public static int displayMode=1;
    public static int unitMode=1;

    /**
     * Constructor for objects of class SwitchModes
     */
    public SwitchModes()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
public static void switchDisplayMode (String mode){
mode.toLowerCase();
    switch (mode) {
            case "hex": { 
                displayMode=1;
                // call update display
                break;
            }
            case "bin": { 
                displayMode=2;
                // call update display
                break;
            }
            case "dec": { 
                displayMode=3;
                // call update display
                break;
            }case "oct": { 
                displayMode=4;
                // call update display
                break;
            }
        }
    }
            
    public static void switchDisplayMode(){
        if (displayMode==4){
            displayMode=1;
            // call update display
        } 
        else {
            displayMode++;
            // call update display
        }

    }

    public static void switchUnitsMode (String mode){
        if (mode.toLowerCase()=="degrees") {
            unitMode=1;
            
        } else if(mode.toLowerCase()=="radians")
            unitMode=2;
                

    }

    public static void switchUnitsMode(){
        if (displayMode==4){
            unitMode=1;
            // call update display
        } 
        else {
            unitMode++;
            // call update display
        }

    }

    
}
