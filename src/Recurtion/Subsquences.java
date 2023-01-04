package Recurtion;

import java.util.Scanner;

public class Subsquences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();

         String[] output =  subSequence(input);
         for (String outputString : output){
             System.out.print(outputString+" ");
         }
    }

    private static String [] subSequence(String input) {
      if (input.length() == 0){
          String [] output = new String[1];
          output[0] = "";
          return output;
      }

      String [] smallOutput = subSequence(input.substring(1));
      String [] output = new String[smallOutput.length*2];
      for (int i=0;i< smallOutput.length;i++){
          output[i] = smallOutput[i];
      }
        for (int i=0;i< smallOutput.length;i++){
            output[smallOutput.length+i] = input.charAt(0) + smallOutput[i];
        }
      return output;

    }
}
