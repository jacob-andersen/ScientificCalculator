public class NumSystemsConverter
{
 // Decimal to binary converter

public String toBinary(double d, int precision) {
    long wholePart = (long) d;
    return wholeToBinary(wholePart) + '.' + fractionalToBinary(d - wholePart, precision);
}

private String wholeToBinary(long l) {
    return Long.toBinaryString(l);
}

private String fractionalToBinary(double num, int precision) {
    StringBuilder binary = new StringBuilder();
    while (num > 0 && binary.length() < precision) {
        double r = num * 2;
        if (r >= 1) {
            binary.append(1);
            num = r - 1;
        } else {
            binary.append(0);
            num = r;
        }
    }
    return binary.toString();
}

// display mode is sent along with displayNumber, could also be defined globally)
public String updateDisplayNumber(double displayNumber,int mode){
  String str="";
switch(mode) {
  case 1:{
    str=Double.toString(displayNumber);
    break;
  }
  case 2:{
    // toBinary takes number to convert and precision
    str=toBinary(displayNumber,2);
    break;
  }
  case 3:{
    str=Double.toHexString(displayNumber);
    break;
  }
  // OCTAL CONVERSION
  // case 4:{
  //  double fraction = (int)((displayNumber%1)+0.5);
  //  double integral = (int)displayNumber-fraction;
  //  String str=Integer.toOctalString(integral)+"."+Integer.toOctalString(fraction);
  //  break;
  // }
}
  return str;
}
}


