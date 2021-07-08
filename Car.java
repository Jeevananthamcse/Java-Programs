/** Car.java
  Main class of an applet program to draw an old-fashioned car
**/

import java.awt.* ;
import java.applet.Applet ;

public class Car extends Applet
{
    // size of area needed for applet figure
  public final int FIGUREHEIGHT = 280;
  public final int FIGUREWIDTH  = 445;

    // color definitions (red, green, blue)
        Color REDBROWN = new Color ( 182, 100, 110 ) ;
        Color DARKBROWN = new Color ( 150, 70, 80 ) ;
        Color LTBLUE = new Color ( 35, 206, 255 ) ;
        Color DARKGOLD = new Color ( 240, 220, 0 ) ;

    // Applets have a paint method
  public void paint (Graphics myCar)
      // all paint methods require a Graphics parameter)
  {
      // background for figure
                myCar.setColor ( Color.white ) ;
                myCar.fillRect ( 0, 0, FIGUREWIDTH, FIGUREHEIGHT ) ;

      // front tire
                myCar.setColor ( Color.black ) ;
      myCar.fillOval ( 20, 170, 100, 100 ) ;
                myCar.setColor ( Color.white ) ;
      myCar.fillOval ( 30, 180, 80, 80 ) ;
                myCar.setColor ( Color.black ) ;
      myCar.drawOval ( 40, 190, 60, 60 ) ;

      // back tire
                myCar.setColor ( Color.black ) ;
      myCar.fillOval ( 270, 170, 100, 100 ) ;
                myCar.setColor ( Color.white ) ;
      myCar.fillOval ( 280, 180, 80, 80 ) ;
                myCar.setColor ( Color.black ) ;
      myCar.drawOval ( 290, 190, 60, 60 ) ;

      // car hood
                myCar.setColor ( DARKBROWN ) ;
      myCar.fillRect ( 10, 113, 122, 12 ) ;
                myCar.setColor ( REDBROWN ) ;
      myCar.fillRect ( 10, 123, 122, 82 ) ;

      // car hood ornament
                myCar.setColor ( DARKGOLD ) ;
      myCar.fillOval ( 10, 105, 10, 10 ) ;

      //  car window
                myCar.setColor ( LTBLUE ) ;
                myCar.fillRect ( 130, 15, 130, 100 ) ; 

      // car door
                myCar.setColor ( REDBROWN ) ;
      myCar.fillRect ( 130, 113, 130, 92 ) ;

      // car backseat
                myCar.setColor ( REDBROWN ) ;
      myCar.fillRect ( 258, 15, 122, 190 ) ;

      // car trunk
                myCar.setColor ( REDBROWN ) ;
      myCar.fillRect ( 378, 80, 57, 125 ) ;

      // car running board
                myCar.setColor ( DARKBROWN ) ;
      myCar.fillRect ( 118, 205, 154, 10 ) ;

      // visor
                myCar.setColor ( Color.black ) ;
    myCar.drawLine ( 131, 15, 110, 30) ;
    myCar.drawLine ( 131, 16, 110, 31) ;
    myCar.drawLine ( 131, 17, 110, 32) ;

      // door handle
                myCar.setColor ( Color.black ) ;
    myCar.drawLine ( 145, 125, 170, 125) ;
    myCar.drawLine ( 145, 124, 170, 124) ;
    myCar.drawLine ( 145, 123, 170, 123) ;
  }
}
