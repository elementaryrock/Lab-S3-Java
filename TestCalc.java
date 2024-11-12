import java.awt.event.*;
import javax.swing.*;
class TestCalc extends JFrame implements ActionListener{
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    public TestCalc(){
        setSize(640,480);
        setLayout(null);
        l1 = new JLabel("First no:");
        l1.setBounds(110,50,100,50);
        add(l1);
        l2 = new JLabel("Second no:");
        l2.setBounds(110,150,100,50);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(350,50,100,50);
        add(t1);
        t2 = new JTextField();
        t2.setBounds(350,150,100,50);
        add(t2);
        b1 = new JButton("+");
        b1.setBounds(110,250,50,50);
        add(b1);
        b2 = new JButton("-");
        b2.setBounds(180,250,50,50);
        add(b2);
        b3 = new JButton("*");
        b3.setBounds(250,250,50,50);
        add(b3);
        b4 = new JButton("/");
        b4.setBounds(320,250,50,50);
        add(b4);
        l3 = new JLabel("Second no:");
        l3.setBounds(500,150,100,50);
        add(l3);
        l4 = new JLabel("Second no:");
        l4.setBounds(500,350,100,50);
        add(l4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
        public void actionPerformed(ActionEvent e)
        {
            Integer x = Integer.parseInt(t1.getText());
            Integer y = Integer.parseInt(t2.getText());
            Integer ans=0;
            if(e.getSource()==b1)
            {
                ans=x+y;
            }
            if(e.getSource()==b2)
            {
                ans=x-y;
            }
            if(e.getSource()==b3)
            {
                ans=x*y;
            }
            if(e.getSource()==b4)
            {
                ans=x/y;
            }
            l4.setText(ans.toString());
        }
        public static void main(String args[])
        {
            TestCalc c = new TestCalc();
            c.setVisible(true);
        }
    }

