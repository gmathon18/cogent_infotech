package questions;

import java.util.HashMap;

public class Q5 {

  public static void main (String [] args){

      String arr = "aceaebzbzc";
      HashMap<Character, Integer> map = new HashMap<>();


        //preprocess
      for(int i = 0; i< arr.length(); i++){

        if(map.get(arr.charAt(i)) == null){

          map.put(arr.charAt(i), 1);
        } else{
          int count = map.get(arr.charAt(i));
          count++;
          map.replace(arr.charAt(i), count);
        }
      }

      //find max count
      int max = 0;
      int charsEqualtoMax = 0;
      char curr = '\0';
      for(int i = 0; i< arr.length(); i++){
        
        if(max < map.get(arr.charAt(i))){
          max = map.get(arr.charAt(i));
          curr = arr.charAt(i);
          charsEqualtoMax = 0;
          
        } else if ((curr != arr.charAt(i)) && (max == map.get(arr.charAt(i)))){
          charsEqualtoMax++;
        }
      }

      //scenarios if max isn't 1
      if(charsEqualtoMax ==0 || max==1 ){
        System.out.println("Minimum substrings: " + max);
      } else if(charsEqualtoMax==2){
        System.out.println("Minimum substrings: " + charsEqualtoMax);
      } else if(charsEqualtoMax >=3){
          System.out.println("Minimum substrings: " + 3);
      }

      
  }
}
