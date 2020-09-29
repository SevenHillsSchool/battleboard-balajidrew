/*Startup:

1. Establish 2 'Boards' 8x8 2D array of int[8][8]
2. Establish rules
3. Establish game variations
4. Establish nomenclature for nothing, hit, miss, sunk
5. Establish UI and norms of play
6. Determine (and announce winner) or game over
*/
//build boards
//boat1 = {B2, C2, D2, E2}   0 = nothing, 1 = miss, 2 = hit, 3 = sunk 4 = boat
//boat2 = {B4, B5, B6}
public class Battleboard {
    int[][] boats = new int[8][8];
    int[][] guess = new int[8][8];
    public void placeBoats(int row, int col)
    {
      boats[row][col] = 4;

    }
    public void guessShip(int gr, int gc)
    {
      if (boats[gr][gc] == 4)
      {
        System.out.println("Hit!");
        guess[gc][gr] = 2;
      }
      else if (boats[gr][gc] == 0)
      {
        System.out.println("Miss!");
        guess[gr][gc] = 1;
      }
    }
    //print boards
    public void printShips()
    {
      System.out.println("\nPrinting boats board");
      System.out.println("\n  A B C D E F G H");
      for (int x = 0; x < 8; x++)
      {
        System.out.print(x);
        for (int y = 0; y < 8; y++)
        {
          System.out.print(" " + boats[x][y]);
        }
        System.out.println("");
      }//close for x
    }// close printShips


    public void printGuess()
    {
      System.out.println("\n\n");
      System.out.println("\nPrinting guessing board");
      System.out.println("\n  A B C D E F G H");
      for (int x = 0; x < 8; x++)
      {
        System.out.print(x);
        for (int y = 0; y < 8; y++)
        {
          System.out.print(" " + guess[x][y]);
        }
        System.out.println("");
      }//close x
      System.out.println("\n");
    } // close printGuess

}
