import java.applet.* ;
import java.util.*;
import java.awt.*;
public class gj extends Applet
{
int n=0;
String label[]= new String[5];
String values[]= new String[5];
int value[]= new int[5];
public void init()
{
try
{
label[0]="Tamil";
label[1]="English";
label[2]="Maths";
label[3]="Science";
label[4]="Social";
value[0]=75;
value[1]=57;
value[2]=92;
value[3]=66;
value[4]=80;
values[0]="75";
values[1]="57";
values[2]="92";
values[3]="66";
values[4]="80";
}
catch(Exception e){ }
}
public void paint(Graphics g)
{
for(int i=0;i<5;i++)
{
g.setColor(Color.black);
g.drawString(label[i],5,(i*50)+30);
g.setColor(Color.blue);
g.fillRect(60,(i*50)+10,value[i],30);
g.setColor(Color.red);
g.drawString(values[i],value[i]+70,(i*50)+30);
}
}
}
