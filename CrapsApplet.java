/*
 * Brian Frank 
 * A game of craps!
 * <applet code="CrapsApplet.class" CodeBase="" width=500 height=500></applet>
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JOptionPane; // establish an option pane for input device
import java.util.Random; // import random number generation class from the library

public class CrapsApplet extends Applet
{
 // decalre key program variables
 int bet;
 int initialBankroll = 1000;
 int bankroll = initialBankroll;
 int die1 = 0;
 int die2 = 0;
 int boxPoint = 0;
 int boxPoint2 = 0;
 int prevPos = 240; //marker for last drawString statement in print_dots method (prevents overlapping of strings)
 
 // declare graphic variables
   Color burntOrange = new Color(0.9F, 0.5F, 0.0F);
   Color blue = new Color(0.0F,0.0F,1.0F);
   Color white = new Color(1.0F,1.0F,1.0F);
   Rectangle orangeDie1 = new Rectangle(10,10,150,150);
   Rectangle orangeDie2 = new Rectangle(170,10,150,150);
   Font f = new Font("Courier", Font.ITALIC, 12);
   
   //dots
   Ellipse2D.Double die1a = new Ellipse2D.Double(10,10,50,50);
   Ellipse2D.Double die1b = new Ellipse2D.Double(10,60,50,50);
   Ellipse2D.Double die1c = new Ellipse2D.Double(10,110,50,50);
   Ellipse2D.Double die1d = new Ellipse2D.Double(60,60,50,50);
   Ellipse2D.Double die1e = new Ellipse2D.Double(110,10,50,50);
   Ellipse2D.Double die1f = new Ellipse2D.Double(110,60,50,50);
   Ellipse2D.Double die1g = new Ellipse2D.Double(110,110,50,50);
   
   Ellipse2D.Double die2a = new Ellipse2D.Double(170,10,50,50);
   Ellipse2D.Double die2b = new Ellipse2D.Double(170,60,50,50);
   Ellipse2D.Double die2c = new Ellipse2D.Double(170,110,50,50);
   Ellipse2D.Double die2d = new Ellipse2D.Double(220,60,50,50);
   Ellipse2D.Double die2e = new Ellipse2D.Double(270,10,50,50);
   Ellipse2D.Double die2f = new Ellipse2D.Double(270,60,50,50);
   Ellipse2D.Double die2g = new Ellipse2D.Double(270,110,50,50);
   
   //********************* - Paint Dots Method - *******************************************************************
    void paint_dots(Graphics2D g2)
    {
         switch (die1) // switch construct - draws dots for dice1 rolls
         {
           case 1: g2.setColor(burntOrange);
                   g2.draw(orangeDie1);
                   g2.fill(orangeDie1);
                   g2.setColor (white);
                   g2.draw(die1d);
                   g2.fill(die1d);
                   break;
           case 2: g2.setColor(burntOrange);
                   g2.draw(orangeDie1);
                   g2.fill(orangeDie1);
                   g2.setColor (white);
                   g2.draw(die1a);
                   g2.fill(die1a);
                   g2.draw(die1g);
                   g2.fill(die1g);
                   break;
           case 3: g2.setColor(burntOrange);
                   g2.draw(orangeDie1);
                   g2.fill(orangeDie1);
                   g2.setColor (white);
                   g2.draw(die1a);
                   g2.fill(die1a);
                   g2.draw(die1d);
                   g2.fill(die1d);
                   g2.draw(die1g);
                   g2.fill(die1g);
                   break;
           case 4: g2.setColor(burntOrange);
                   g2.draw(orangeDie1);
                   g2.fill(orangeDie1);
                   g2.setColor (white);
                   g2.draw(die1a);
                   g2.fill(die1a);
                   g2.draw(die1c);
                   g2.fill(die1c);
                   g2.draw(die1e);
                   g2.fill(die1e);
                   g2.draw(die1g);
                   g2.fill(die1g);
                   break;
           case 5: g2.setColor(burntOrange);
                   g2.draw(orangeDie1);
                   g2.fill(orangeDie1);
                   g2.setColor (white);
                   g2.draw(die1a);
                   g2.fill(die1a);
                   g2.draw(die1c);
                   g2.fill(die1c);
                   g2.draw(die1d);
                   g2.fill(die1d);
                   g2.draw(die1e);
                   g2.fill(die1e);
                   g2.draw(die1g);
                   g2.fill(die1g);
                   break;
           case 6: g2.setColor(burntOrange);
                   g2.draw(orangeDie1);
                   g2.fill(orangeDie1);
                   g2.setColor (white);
                   g2.draw(die1a);
                   g2.fill(die1a);
                   g2.draw(die1b);
                   g2.fill(die1b);
                   g2.draw(die1c);
                   g2.fill(die1c);
                   g2.draw(die1e);
                   g2.fill(die1e);
                   g2.draw(die1f);
                   g2.fill(die1f);
                   g2.draw(die1g);
                   g2.fill(die1g);
                   break;
         }
         switch (die2)  // switch construct - draws dots for dice2 rolls
         {
           case 1: g2.setColor(burntOrange);
                   g2.draw(orangeDie2);
                   g2.fill(orangeDie2);
                   g2.setColor (white);
                   g2.draw(die2d);
                   g2.fill(die2d);
                   break;
           case 2: g2.setColor(burntOrange);
                   g2.draw(orangeDie2);
                   g2.fill(orangeDie2);
                   g2.setColor (white);
                   g2.draw(die2a);
                   g2.fill(die2a);
                   g2.draw(die2g);
                   g2.fill(die2g);
                   break;
           case 3: g2.setColor(burntOrange);
                   g2.draw(orangeDie2);
                   g2.fill(orangeDie2);
                   g2.setColor (white);
                   g2.draw(die2a);
                   g2.fill(die2a);
                   g2.draw(die2d);
                   g2.fill(die2d);
                   g2.draw(die2g);
                   g2.fill(die2g);
                   break;
           case 4: g2.setColor(burntOrange);
                   g2.draw(orangeDie2);
                   g2.fill(orangeDie2);
                   g2.setColor (white);
                   g2.draw(die2a);
                   g2.fill(die2a);
                   g2.draw(die2c);
                   g2.fill(die2c);
                   g2.draw(die2e);
                   g2.fill(die2e);
                   g2.draw(die2g);
                   g2.fill(die2g);
                   break;
           case 5: g2.setColor(burntOrange);
                   g2.draw(orangeDie2);
                   g2.fill(orangeDie2);
                   g2.setColor (white);
                   g2.draw(die2a);
                   g2.fill(die2a);
                   g2.draw(die2c);
                   g2.fill(die2c);
                   g2.draw(die2d);
                   g2.fill(die2d);
                   g2.draw(die2e);
                   g2.fill(die2e);
                   g2.draw(die2g);
                   g2.fill(die2g);
                   break;
           case 6: g2.setColor(burntOrange);
                   g2.draw(orangeDie2);
                   g2.fill(orangeDie2);
                   g2.setColor (white);
                   g2.draw(die2a);
                   g2.fill(die2a);
                   g2.draw(die2b);
                   g2.fill(die2b);
                   g2.draw(die2c);
                   g2.fill(die2c);
                   g2.draw(die2e);
                   g2.fill(die2e);
                   g2.draw(die2f);
                   g2.fill(die2f);
                   g2.draw(die2g);
                   g2.fill(die2g);
                   break;
         }
    }
   
//********************* - Game Starts - *************************************
   public void init()
   {
      String input = JOptionPane.showInputDialog("You have $" + bankroll + " in your pocket. Place your bet up to $100:");
      
      bet = Integer.parseInt(input);
         // bet approval

         if (bet > 100 || bet > bankroll || bet < 0) //changed from while to if
         {
           input = JOptionPane.showInputDialog("Please enter a bet less than or equal to $100");
           bet = Integer.parseInt(input);
         }
      //while (bet != 0) {
      //}
  }
   

   

    
//*************** - Draws Dice and Text - ******************************************    
   public void paint (Graphics g)
   {  Graphics2D g2 = (Graphics2D)g;
         g2.setFont(f);
         g2.setColor (blue);
         g2.drawString ("You bet " + bet + " dollars",10,180);
         // roll the dice
         Random generator = new Random (); // establish connection
         die1 = 1 + generator.nextInt(6);
         die2 = 1 + generator.nextInt(6);
         boxPoint = die1 + die2;
         g2.drawString ("You rolled " + die1 + " and " + die2 + " for a total of " + boxPoint,10,200);
         paint_dots(g2);
         g2.setColor (blue);
         // switch construct - implementation of craps rules
         switch (boxPoint)
         {
           case 7:
           case 11: g2.drawString ("You won!",10,220);
                    bankroll = bankroll + bet;
                    break;
           case 2:
           case 3:
           case 12: g2.drawString ("You lost!",10,220);
                    bankroll = bankroll - bet;
                    break;
           default: g2.drawString ("Your box point is " + boxPoint + ", roll again.",10,220);
                    for(int x=0; x<100000000; x++); // time delay
                    // roll again
                    die1 = 1 + generator.nextInt(6);
                    die2 = 1 + generator.nextInt(6);
                    paint_dots(g2);
                    g2.setColor (blue);
                    int nextRoll = die1 + die2;
                    g2.drawString ("You rolled " + die1 + " and " + die2 + " for a total of " + nextRoll,10,240);
                    while (nextRoll != boxPoint && nextRoll != 7)
                    {
                       for(int x=0; x<100000000; x++); // time delay
                       prevPos = prevPos+20;
                       die1 = 1 + generator.nextInt(6);
                       die2 = 1 + generator.nextInt(6);
                       nextRoll = die1 + die2;
                       paint_dots(g2);
                       g2.setColor (blue);
                       g2.drawString ("You rolled " + die1 + " and " + die2 + " for a total of " + nextRoll,10, prevPos);
                    }
                    if (nextRoll == 7)
                       {
                       g2.drawString ("You rolled a " + nextRoll + " and lost",10,prevPos+20);
                       bankroll = bankroll - bet;
                       }
                    else
                       {
                       g2.drawString ("You rolled your boxpoint and won $" + bet + "!",10,prevPos+20);
                       bankroll = bankroll + bet;
                       }
                       break;
          }
         g2.drawString ("You now have $ " + bankroll + " in your pocket.",10,prevPos+40);
         prevPos = 240;
         // replay();
       }
/*   
       void replay() //experimental
       {
         String replay = JOptionPane.showInputDialog("Would you like to play again? (yes or no)");
         System.out.println(replay);
         if (replay != "no")
            {
            // init();
            repaint();
            }
       }
*/
}
     

