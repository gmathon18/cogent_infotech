package questions;

public class Q4 {

	  public static void main (String [] args){

	    int [] arr = {3, -6, 5, -2, 1};

	    System.out.println(minStart(arr));
	  }

	  public static long minStart(int arr []){

	      int firstStart = 1;
	      boolean res  = false;

	      while(res==false){

	        
	        res = checkStart(arr, firstStart);
	        if(res == false){
	            firstStart++;
	        }
	        
	      }
	      
	      return firstStart;
	  }

	  public static boolean checkStart(int arr [], int minStart){

	    // sum starts with starter number
	    int sum = minStart;
	    for(int i =0; i<arr.length;i++){

	          sum += arr[i];
	          
	          //if after every addition, the sum is less than one, starter num cant be used
	          if(sum<1){
	            return false;
	          }
	    }
	    
	    return true;
	  }

	}
