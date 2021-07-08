import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SetScrollBar extends JFrame implements
AdjustmentListener
{
int red,green,blue;
JScrollBar s1,s2,s3;
JLabel l1,l2,l3;
SetScrollBar()
{
setLayout(new FlowLayout());
s1=new JScrollBar(JScrollBar.HORIZONTAL);
s2=new JScrollBar(JScrollBar.HORIZONTAL);
s3=new JScrollBar(JScrollBar.HORIZONTAL);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
s3.addAdjustmentListener(this);
l1=new JLabel("RED");
l2=new JLabel("GREEN");
l3=new JLabel("BLUE");
add(l1);
add(s1);
add(l2);
add(s2);
add(l3);
add(s3);
}
public void adjustmentValueChanged(AdjustmentEvent e)
{
red=s1.getValue();
green=s2.getValue();
blue=s3.getValue();
getContentPane().setBackground(new Color(red,green,blue));
}
public static void main(String[] args)
{
SetScrollBar scb=new SetScrollBar();
scb.setSize(500,400);
scb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
scb.setVisible(true);
}
}
