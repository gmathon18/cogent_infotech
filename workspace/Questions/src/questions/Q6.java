package questions;

public class Q6 {

	  public static void main(String [] args){

	    int [] array = {12,15,17,19,12,12, 99, 1231, 100, 99};

	    int count = 0; //unique count
	    int curr = -1; //iterator

	    for(int i=0; i < array.length;i++){

	        curr = array[i];
	        if(array[i] != -111){
	          count++;
	        }
	        for(int j =i+1; j< array.length;j++){
	          
	          if(curr == array[j]){
	            array[j] = -111; // negative int used as filter    
	          }
	        }
	    } 

	  int [] result = new int [count];

	//new resize array and copy over over unique values
	//display results
	  curr = 0;
	  for(int i=curr; i < array.length;i++){
	    {
	      if(array[i]!= -111){
	        result[curr] = array[i];
	        curr++;
	      }
	    }
	}

	//print result
	for(int i = 0; i < result.length; i++){
	  System.out.print(result[i] + " ");
	}

	  }
	}
