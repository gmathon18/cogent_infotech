import java.util.Scanner;

public class CalcAverage{

  public static double avgFirst(int N) throws IllegalArgumentException
  {
        if(N <0){
            throw new IllegalArgumentException("Value must be non-negative");
        }
        double sum = 0;
        for(int i = 0; i<=N; i++){
          sum = sum + i;
        }
        double avg = sum/N;
        return avg;
  }
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int num = sc.nextInt();
    try{
    System.out.println(avgFirst(num));
    } catch(IllegalArgumentException e) {
      System.out.println("Number must be a natural number");
    }
  }
}

