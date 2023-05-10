package questions;

import java.util.*;

public class Q1{

  public static void main (String [] args){

    //Autocorrect

    int n = 4; 

    int q = 2;

    String [] words = {"duel", "speed", "dule", "cars"};
    String [] queries = {"spede", "deul"};


     System.out.println(getSearchResults(words, queries));
  }

  public static List<String> getSearchResults(String words[], String queries []){

    
    List<String> answers = new ArrayList<>();


    // for each words
    // for each query
    for(int i = 0; i<words.length;i++){
      for(int j=0; j<queries.length;j++){

        // check if equal length
        if(words[i].length() == queries[j].length()){

          char [] a1 = words[i].toCharArray();
          char [] a2 = queries[j].toCharArray();
          Arrays.sort(a1);
          Arrays.sort(a2);
          if(Arrays.equals(a1,a2)){
            answers.add(words[i]);
          }

        }
      }
    }

      return answers;
  }
  
}
