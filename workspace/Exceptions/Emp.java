import java.util.Scanner;

class LowSalException extends Exception{
  
      LowSalException(String msg){
      super(msg);
      }
  
}
public class Emp {

  int empId;
  String empName;
  String designation;
  double basic;
  double hra;

  public Emp(int id, String name, String designation, double base) throws LowSalException{
    if(base < 500){
      throw new LowSalException("base is less than 500");
    }
    this.empId = id;
    this.empName = name;
    this.designation = designation;
    this.basic = base;
    calculationHRA();
  }

  void printDET(){
      System.out.println("The id of the Emp is: "+this.empId);
      System.out.println("The name of the Emp is: "+this.empName);
      System.out.println("The designation of the Emp is: "+this.designation);
      System.out.println("The basic of the Emp is: "+this.basic);
      System.out.println("The hra of the Emp is: "+this.hra);
  }

  void calculationHRA(){

    if(this.designation.equals("Manager")){
      this.hra = this.basic *0.10;
    } else if(this.designation.equals("Officer")){
      this.hra = this.basic *0.12;
    } else if(this.designation.equals("Clerk")){
      this.hra = this.basic *0.05;
  }
  }

  public static void main(String [] args){

    try{
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter id");
          int id = sc.nextInt();
          System.out.println("Please enter name");
          String name = sc.next();
          System.out.println("Please enter designation");
          String des = sc.next();
          System.out.println("Please enter base");
          double b = sc.nextDouble();
          Emp e = new Emp(id, name, des, b);

          e.printDET();
    } catch(LowSalException e){
      System.out.println("base is less than 500");
    }

  }
}

