/**
 * The purpse of this program is to have the test
 case recognize if they know who Alice and Bob is.
 *
 * @author Giles Bradford
 * @version 1.0 5-Feb-2020
 */
public class AliceAndBobEngine
{
    String result;

    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input) {
      if (input.equals("Alice")) {
          return "Hello Alice";
      } else if (input.equals("Alicia") || input.equals("Bobert")) {
          return "I DON'T KNOW YOU, YOU ARE SCARY";
      } else if (input.equals("Bob")) {
          return "Hello Bob";
      } else {
        return "invalid";
      }
   }
}
