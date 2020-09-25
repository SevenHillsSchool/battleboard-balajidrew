/*Test file for building and running your program - the main is to support
*   development in Repl.it
*
*/

public class Main {

public static void main ( String[] args) {

      //enter a guess?

        //setter method
      Battleboard b1 = new Battleboard();
      b1.placeBoats(1,1);
      b1.placeBoats(2,1);
      b1.placeBoats(3,1);
      b1.placeBoats(4,1);
      b1.printShips();
      //System.out.println("Welcome to the game. Here is your board");
      b1.guessShip(1,1);
      //GamePlay game = new GamePlay();
      //guess[2][2] = 1;
      //b1.guessShip();


  }  //close main method

} . //close the Main class

