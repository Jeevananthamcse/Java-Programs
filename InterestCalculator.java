import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class InterestCalculator extends Applet implements ActionListener
{
Button sibtn=new Button("Simple Interest");
Button cibtn=new Button("Compound Interest");
Label lblPrincipal=new Label("Principal");
Label lblInterest=new Label("Interest Rate");
Label lblYears=new Label("Number of Years");
Label lblAmount=new Label("Amount");
TextField textPrincipal=new TextField("0",10);
TextField textInterest=new TextField("0",10);
TextField textYears=new TextField("0",10);
TextField textAmount=new TextField("0",10);
public void init()
{
add(sibtn);
add(cibtn);
add(lblPrincipal);
add(textPrincipal);
add(lblInterest);
add(textInterest);
add(lblYears);
add(textYears);
add(lblAmount);
add(textAmount);
sibtn.addActionListener(this);
cibtn.addActionListener(this);
}
public void actionPerformed(ActionEvent evt)
{
int Principal=Integer.parseInt(getParameter("Principal"));
String P=Integer.toString(Principal);
textPrincipal.setText(P);
int Interest=Integer.parseInt(getParameter("rate"));
String r=Integer.toString(Interest);
textInterest.setText(r);
int Years=Integer.parseInt(getParameter("years"));
String n=Integer.toString(Years);
textYears.setText(n);
double IntRate=(double)Interest/100;
if(evt.getSource()==sibtn)
{
double Amount=Principal+(Principal*IntRate*Years);
String amt=Double.toString(Amount);
textAmount.setText(amt);
repaint();
}
else if(evt.getSource()==cibtn)
{
double Amount=Principal*Math.pow(1+IntRate,Years);
String amt=Double.toString(Amount);
textAmount.setText(amt);
repaint();
}
}
}
