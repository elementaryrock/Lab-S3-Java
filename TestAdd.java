import java.awt.event.*;
import javax.swing.*;
class TestAdd extends JFrame implements ActionListener{
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JButton b1;
    public TestAdd(){
        setSize(640,480);
        setLayout(null);
        l1 = new JLabel("First no:");
        t1 = new JTextField();
        l2 = new JLabel("Second no:");
        t2 = new JTextField();
        b1 = new JButton("Add");
        l3 = new JLabel("Aswer:");
        t3 = new JTextField();
        l1.setBounds(50,50,100,50);
        l2.setBounds(50,150,100,50);
        l3.setBounds(50,350,100,50);
        t1.setBounds(200,50,100,50);
        t2.setBounds(200,150,100,50);
        t3.setBounds(200,350,100,50);
        b1.setBounds(75,250,100,50);
        add(b1);
        add(t1);
        add(t2);
        add(t3);
        add(l1);
        add(l2);
        add(l3);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Integer x = Integer.parseInt(t1.getText());
        Integer y = Integer.parseInt(t2.getText());
        Integer sum = x+y;
        t3.setText(sum.toString());
    }
    public static void main(String args[])
    {
        TestAdd a = new TestAdd();
        a.setVisible(true);
    }
}
