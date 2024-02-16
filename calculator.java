import javax.swing.*;						
import java.awt.*;						
import java.awt.event.*;					
class ex implements ActionListener 
{
    JFrame jf;
    JTextField tf1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    String s0, s1, s2;
    ex() 
    {
        jf = new JFrame("Simple Calculator");
        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setLayout(new GridLayout(6,4 ));
        tf1 = new JTextField(20);
        b1 = new JButton("AC");
        b2 = new JButton("=");
        b3 = new JButton("+");
        b4 = new JButton("-");
        b5 = new JButton("*");
        b6 = new JButton("/");
        b7 = new JButton("1");
        b8 = new JButton("2");
        b9 = new JButton("3");
        b10 = new JButton("4");
        b11 = new JButton("5");
        b12 = new JButton("6");
        b13 = new JButton("7");
        b14 = new JButton("8");
        b15 = new JButton("9");
        b16 = new JButton("0");
        jf.add(tf1);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.add(b10);
        jf.add(b11);
        jf.add(b12);
        jf.add(b13);
        jf.add(b14);
        jf.add(b15);
        jf.add(b16);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        
        s0 = s1 = s2 = "";
    }

    public void actionPerformed(ActionEvent e) 
    {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') 
        {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            tf1.setText(s0 + s1 + s2);
        } 
        else if (s.charAt(0) == 'A' && s.charAt(1) == 'C') 
        {
            s0 = s1 = s2 = "";
            tf1.setText("");
        } 
        else if (s.charAt(0) == '=') 
        {
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/")) 
            {
                if (Double.parseDouble(s2) != 0)
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else 
                {
                    tf1.setText("Cannot divide by zero");
                    return;
                }
            } 
            else if (s1.equals("*"))
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) % Double.parseDouble(s2));
            tf1.setText(s0 + s1 + s2 + "=" + te);
            s0 = Double.toString(te);
            s1 = s2 = "";
        } 
        else 
        {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else 
            {
                double te;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/")) 
                {
                    if (Double.parseDouble(s2) != 0)
                        te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                    else 
                    {
                        tf1.setText("Cannot divide by zero");
                        return;
                    }
                } 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            tf1.setText(s0 + s1 + s2);
        }
    }
}

class calculator{
    public static void main(String[] args) {
        new ex();
    }
}