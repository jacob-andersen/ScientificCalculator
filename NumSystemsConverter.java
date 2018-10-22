public class NumSystemsConverter
{
    // display mode is sent along with displayNumber, could also be defined globally)
    public String updateDisplayNumber(double displayNumber,int mode){
        String str="";
        switch(mode) {
            case 1:{
                str=Double.toString(displayNumber);
                break;
            }
            case 2:{
                str=Long.toBinaryString(Double.doubleToRawLongBits(displayNumber));
                break;
            }
            case 3:{
                str=Double.toHexString(displayNumber);
                break;
            }
            case 4:{
                double fraction = (displayNumber%1);
                double integral = (displayNumber-fraction);
                str=Integer.toOctalString((int)integral)+"."+Integer.toOctalString((int)(fraction+.5));
                break;
            }
        }
        return str;
    }
}

