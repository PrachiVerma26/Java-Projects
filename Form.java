import java.awt.*;
import java.awt.event.*;
 
class Forme extends Frame
{
 Forme()
{
 Color bg =new Color(46,2,25);
setBackground(bg);
setForeground(Color.WHITE);

 Label l1 = new Label("Graphical Form");
add(l1); 
l1.setBounds(400,50,100,50);

Label l2 = new Label("First Name");
add(l2);
l2.setBounds(250,100,100,10);

TextField t1 = new TextField(15);
add(t1);
t1.setBounds(400,100,100,50);
t1.setForeground(Color.WHITE);
t1.setBackground(Color.BLACK);

Label l3 = new Label("Last Name");
add(l3);
l3.setBounds(250,200,100,50);

TextField t2 = new TextField(15);
add(t2);
t2.setBounds(400,200,100,30);
t2.setForeground(Color.WHITE);
t2.setBackground(Color.BLACK);

Label l4 = new Label("Address");
add(l4);
l4.setBounds(250,300,100,50);

TextArea a = new TextArea(10,10);
add(a);
a.setBounds(400,300,100,50);
a.setForeground(Color.WHITE);
a.setBackground(Color.BLACK);

Label l6 = new Label ("Gender");
add(l6);
l6.setBounds(200,400,100,50);

CheckboxGroup cbg = new CheckboxGroup();
Checkbox c4 = new Checkbox("Male",cbg,false);
add(c4);
c4.setBounds(400,400,100,50);

Checkbox c5 = new Checkbox("Female",cbg,false);
add(c5);
c5.setBounds(500,400,100,50);

Label l5 = new Label("hobbies");
add(l5);
l5.setBounds(250,500,100,50);

Checkbox c1 = new Checkbox("Cricket");
add(c1);
c1.setBounds(350,500,100,50);
Checkbox c2 = new Checkbox("Reading");
add(c2);
c2.setBounds(450,500,100,50);

Checkbox c3 = new Checkbox("Playing games");
add(c3);
c3.setBounds(550,500,100,50);

Label l7 = new Label("Preferrable Subjects");
add(l7);
l7.setBounds(250,600,100,50);

List l = new List(4);
l.add("c++");
l.add("java");
l.add("c");
l.add("python");
add(l);
l.setBounds(350,620,100,50);
l.setForeground(Color.WHITE);
l.setBackground(bg);

Label l8 = new Label("Area Of Interest");
add(l8);
l8.setBounds(250,700,100,50);

Choice c = new Choice();
c.add("app developer");
c.add("game developer");
c.add("data analyst");
add(c);
c.setBounds(350,720,100,50);
c.setForeground(Color.WHITE);
c.setBackground(bg);

Button b = new Button("Submit Your Form");
add(b);
b.setBounds(400,800,100,50);
b.setForeground(Color.BLACK);

addWindowListener(new WindowAdapter(){
 public void windowClosing(WindowEvent we)
{
  System.exit(0);
}
});


setVisible(true);
setSize(800,900);
setTitle("Graphical Form");
setLayout(null);
setResizable(false);
}


  public static void main(String args[])
{
 Forme f = new Forme();
}
}