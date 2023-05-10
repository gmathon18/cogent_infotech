package questions;

public class Q2 {
	  public static void main (String [] args){

	    //example
	    int [] arr = { 3, 0, 5, 13, 123, 32};

	    System.out.println(solution(arr));
	  }

	  public static int solution(int[] A){

	    int filters = 0;
	    int sum = processSum(A);
	    int max = -1;
	    double goal = sum/2.0;

	    while (sum > goal){
	      
	      filters += addFilters(A);
	      sum = processSum(A);
	    }
	    
	    return filters;
	  }

	  public static int processSum(int[] A){

	    int sum = 0;
	    for(int i = 0; i<A.length; i++){
	      sum+= A[i];
	    }
	    return sum;
	  }

	  public static int addFilters(int [] A){

	    int max = -1;
	    int filterCount = 0;

	    //find max
	    for(int i = 0; i<A.length; i++){

	      if(A[i] > max){
	        max = A[i];
	      } 
	    }
	    // System.out.println(filterCount);
	    // System.out.println(max);
	    // add filter if factory pollution * 2 is greater than max
	    for(int i = 0; i<A.length; i++){

	      if(A[i] == max){
	          A[i] = A[i] /2;
	          filterCount++;
	      }

	    }
	    // System.out.println(filterCount);
	  return filterCount;
	  }

	}
