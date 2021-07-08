import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseMove extends JFrame implements
MouseMotionListener
{
public JLabel label;
public static void main(String args[])
{
MouseMove mm=new MouseMove();
mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
MouseMove()
{
setSize(500,400);
setTitle("Java Swing-JFrame Mouse Hover Get Coordinates");
label=new JLabel("No Mouse Event Captured",JLabel.CENTER);
add(label);
addMouseMotionListener(this);
setVisible(true);
}
public void mouseMoved(MouseEvent e)
{
label.setText("Mouse Cursor Coordinates=>X:"+e.getX()+"|Y:"+e.getY());
}
public void mouseDragged(MouseEvent e)
{}
}
