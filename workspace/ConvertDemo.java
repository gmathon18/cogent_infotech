public class ConvertDemo{

  public static void main(String [] args){

    
    int val1 = 4;
    double val2 = 4.5;
    boolean val3 = true;
    String val4 = "";
    byte val5 = 10;
    short val6 = 3;
   

    Integer object1 = Integer.valueOf(val1);
    Double object2 = Double.valueOf(val2);
    Boolean object3 = Boolean.valueOf(val3);
    String object4 = String.valueOf(val4);
    Byte object5 = Byte.valueOf(val5);
    Short object6 = Short.valueOf(val6);
    

    int a = object1.intValue();
    double c = object2.doubleValue();
    boolean d = object3.booleanValue();
    String s = object4.toString();
    byte f = object5.byteValue();
    short g = object6.shortValue();
    
  }
}

