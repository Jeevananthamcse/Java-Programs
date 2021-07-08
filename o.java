import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;
public class ColorDemo extends JFrame implements
ItemListener
{
int r=0,g=0,b=0;
JCheckBox red,green,blue,yellow,white;
JPanel P=new JPanel();
JPanel cpanel=new JPanel();
Container pane=getContentPane();
ButtonGroup group=new ButtonGroup();
ColorDemo(String cd)
{
super(cd);
red=new JCheckBox("red");
red.addItemListener(this);
green=new JCheckBox("green");
green.addItemListener(this);
blue=new JCheckBox("blue");
blue.addItemListener(this);
yellow=new JCheckBox("yellow");
yellow.addItemListener(this);
white=new JCheckBox("white");
white.addItemListener(this);
group.add(red);
group.add(green);
group.add(blue);
group.add(yellow);
group.add(white);
cpanel.add(red);
cpanel.add(green);
cpanel.add(blue);
cpanel.add(yellow);
cpanel.add(white);
getContentPane().add(cpanel,"North");
setSize(400,400);
setVisible(true);
getContentPane().add(P);
setVisible(true);
}
public static void main(String[] args)
{
ColorDemo cd=new ColorDemo("ColorCheckBox");
cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}                                        
public void itemStateChanged(ItemEvent ie) {
  
  if(ie.getItem()==red)
  P.setBackground(new Color(255,0,0));
  else if(ie.getItem()==green)
  P.setBackground(new Color(0,255,0));
  else if(ie.getItem()==blue)
  P.setBackground(new Color(0,0,255));
  else if(ie.getItem()==yellow)
  P.setBackground(new Color(255,255,0));
  else if(ie.getItem()==white)
  P.setBackground(new Color(255,255,255));
}
}
