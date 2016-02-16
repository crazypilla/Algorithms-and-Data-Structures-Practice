/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package allpermutations;

/**
 *
 * @author Harshita V
 */
public class Allpermutations {

    /**
     * @param args the command line arguments
     */
    
 public static void permuteString(String beginningString, String endingString) {
    if (endingString.length() <= 1)
      System.out.println(beginningString + endingString);
    else
      for (int i = 0; i < endingString.length(); i++) {
        try {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

          permuteString(beginningString + endingString.charAt(i), newString);
        } catch (StringIndexOutOfBoundsException exception) {
          exception.printStackTrace();
        }
      }
  }
 
    public static void main(String[] args) {
        // TODO code application logic here
        permuteString("","aaa");
    }
    
}
