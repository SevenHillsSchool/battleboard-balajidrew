/*Test file for building and running your program - the main is to support
*   development in Repl.it
*
*/

import java.util.Scanner;
public class Battleship
{
  public static void main(String[] args )
  {
    Scanner scan = new Scanner(System.in);
      //enter a guess?

        //setter method
      Battleboard b1 = new Battleboard();
      System.out.println("This is for your battleship, length 4");
      for (int i = 0; i < 4; i++)
      {
        System.out.print("Input row of ship(0-7): ");
        int gr = scan.nextInt();
        System.out.print("Input column of ship(0-7): ");
        int gc = scan.nextInt();
        //if (gr[0] != gr[1] && gc[0] != gc[1])
        //{
        //  System.out.println("Diagonal/Non-continous ships aren't allowed, try again");
        //}
        if (gr > 7 || gc > 7)
        {
          System.out.println("That placement is out of bounds");
        }
        else
        {
          b1.placeBoats(gr,gc);
        }
        System.out.println(i);
      }
      System.out.println("This is for your submarine, length 3");
      for (int j = 0; j < 3; j++)
      {
        System.out.print("Input row of ship(0-7): ");
        int gr = scan.nextInt();
        System.out.print("Input column of ship(0-7): ");
        int gc = scan.nextInt();
        if (gr > 7 || gc > 7)
        {
          System.out.println("That placement is out of bounds");
        }
        else
        {
          b1.placeBoats(gr,gc);
        }
      }
      System.out.println("This is for your cruiser, length 3");
      for (int k = 0; k < 3; k++)
      {
        System.out.print("Input row of ship(0-7): ");
        int gr = scan.nextInt();
        System.out.print("Input column of ship(0-7): ");
        int gc = scan.nextInt();
        if (gr > 7 || gc > 7)
        {
          System.out.println("That placement is out of bounds");
        }
        else
        {
          b1.placeBoats(gr,gc);
        }
      }
      System.out.println("This is for your destroyer, length 2");
      for (int l = 0; l < 2; l++)
      {
        System.out.print("Input row of ship(0-7): ");
        int gr = scan.nextInt();
        System.out.print("Input column of ship(0-7): ");
        int gc = scan.nextInt();
        if (gr > 7 || gc > 7)
        {
          System.out.println("That placement is out of bounds");
        }
        else
        {
          b1.placeBoats(gr,gc);
        }
      }

/*
      b1.placeBoats(2,1);
      b1.placeBoats(3,1);
      b1.placeBoats(4,1);
      */
      b1.printShips();
      for (int a = 0; a < 20; a++)
      {
        System.out.print("Input row of guess: ");
        int gr = scan.nextInt();
        System.out.print("Input column of guess: ");
        int gc = scan.nextInt();
        b1.guessShip(gr, gc);
        b1.printGuess();
      }

  }
}

