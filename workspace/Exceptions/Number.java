import java.util.Scanner;

public class Number{

  int firstNumber;
  int secondNumber;
  int result;

  public Number(int x, int y){
    this.firstNumber = x;
    this.secondNumber = y;
  }

  public void add(){
    result = firstNumber+secondNumber;
  }

   public void sub(){
    result = firstNumber-secondNumber;
  }
   public void mul(){
    result = firstNumber*secondNumber;
  }
  public void div(){
    if(this.secondNumber==0){
      throw new ArithmeticException("Division by zero is not allowed");
    }
    result = firstNumber/secondNumber;
  }
  public void display(){

    System.out.println("The result is: "+result);
  }
  public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try{
        do{
            System.out.println("*********** MENU ***********");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            choice = sc.nextInt();
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            Number num = new Number(num1, num2);
            switch(choice){
              case 1:
                    num.add();
                    num.display();
                    break;
              case 2:
                    num.sub();
                    num.display();
                    break;
              case 3: 
                    num.mul();
                    num.display();
                    break;
              case 4: 
                    num.div();
                    num.display();
                    break;
              case 5: 
                    break;
            }
        }while(choice!=5);
        
        } catch(ArithmeticException e){
              System.out.println("Division by zero not allowed");
        }
  }
}
