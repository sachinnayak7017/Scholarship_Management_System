import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public  class CheckSchole extends JFrame implements ActionListener {

    JButton Submit;
    JButton back;
    JTextField tf1;
    JTextField tf4;
    JTextField tf3;
    JTextField tf5;
    JTextField tf9;
    JTextField tf6;
    JTextField tf7;

    CheckSchole() {

        JLabel jb0 = new JLabel("Information For Scholarship");
        jb0.setBounds(330,65,400,40);
        jb0.setFont(new Font("arial",Font.BOLD,30));
        jb0.setForeground(Color.red);
        add(jb0);


        JLabel jb1 = new JLabel(" Student Name:");
        jb1.setBounds(300,150,200,40);
        jb1.setFont(new Font("arial",Font.BOLD,22));
        add(jb1);

        tf1 = new JTextField();
        tf1.setBounds(500,150,250,40);
        tf1.setFont(new Font("arial",Font.BOLD,22));
        add(tf1);


        JLabel jb3 = new JLabel("Father Name:");
        jb3.setBounds(300,210,200,40);
        jb3.setFont(new Font("arial",Font.BOLD,22));
        add(jb3);

        tf3 = new JTextField();
        tf3.setBounds(500,210,250,40);
        tf3.setFont(new Font("arial",Font.BOLD,22));
        add(tf3);

        JLabel jb4 = new JLabel("Course:");
        jb4.setBounds(300,270,200,40);
        jb4.setFont(new Font("arial",Font.BOLD,22));
        add(jb4);

        tf4 = new JTextField();
        tf4.setBounds(500,270,250,40);
        tf4.setFont(new Font("arial",Font.BOLD,22));
        add(tf4);

        JLabel jb5 = new JLabel("Branch:");
        jb5.setBounds(300,330,200,40);
        jb5.setFont(new Font("arial",Font.BOLD,22));
        add(jb5);

        tf5 = new JTextField();
        tf5.setBounds(500,330,250,40);
        tf5.setFont(new Font("arial",Font.BOLD,22));
        add(tf5);

        JLabel jb9 = new JLabel("10th RollNo:");
        jb9.setBounds(300,390,200,40);
        jb9.setFont(new Font("arial",Font.BOLD,22));
        add(jb9);

        tf9= new JTextField();
        tf9.setBounds(500,390,250,40);
        tf9.setFont(new Font("arial",Font.BOLD,22));
        add(tf9);

        JLabel jb6 = new JLabel("10th Percentage:");
        jb6.setBounds(300,440,200,40);
        jb6.setFont(new Font("arial",Font.BOLD,22));
        add(jb6);

        tf6 = new JTextField();
        tf6.setBounds(500,440,250,40);
        tf6.setFont(new Font("arial",Font.BOLD,22));
        add(tf6);

        JLabel jb7 = new JLabel("12th Percentage:");
        jb7.setBounds(290,490,200,40);
        jb7.setFont(new Font("arial",Font.BOLD,22));
        add(jb7);

        tf7 = new JTextField();
        tf7.setBounds(500,490,250,40);
        tf7.setFont(new Font("arial",Font.BOLD,22));
        add(tf7);



        Submit=new JButton("Submit");
        Submit.setBounds(700,600,150,40);
        Submit.setFont(new Font("Admin",Font.BOLD,18));
        Submit.setForeground(Color.WHITE);
        Submit.setBackground(Color.BLACK);
        add(Submit);

        back=new JButton("Back");
        back.setBounds(450,600,150,40);
        back.setFont(new Font("user",Font.BOLD,18));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        add(back);


        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        setSize(1300,1000);
        setLayout(null);
        setTitle("Usersup");
        setVisible(true);

        Submit.addActionListener(this);
        back.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Submit) {
            try {
                String Name = tf1.getText();
                String Father = tf3.getText();
                String Course = tf4.getText();
                String Branch = tf5.getText();
                String Roll10 = tf9.getText();
                String Parcentage10 = "" + tf6.getText();
                String Parcentage12 = "" + tf7.getText();

//                if (Name.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the  Name  field");
//            } else if (Father.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Father name  field");
//            }else if (Course.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Course  field");
//            } else if (Branch.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Branch  field");
//            } else if (Roll10.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the  10th ROllNO field");
//            } else if (Parcentage10.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the 10th Parcentage  field");
//            } else if (Parcentage12.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the 12th Parcentage  field");
//            }

                try {

                    String driver = "com.mysql.cj.jdbc.Driver";
                    String datbaseurl = "jdbc:mysql://localhost:3306/university";
                    String Username = "root";
                    String Password = "";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                    System.out.println("Database Connected");
                    String q = "insert into CheckScholer value ( '" + Name + "'  ,'" + Father + "','" + Course + "','" + Branch + "','" + Roll10 + "','" + Parcentage10 + "','" + Parcentage12 + "')";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Your data Successfully Inserted");
                    System.out.println("Data inserted..");


                } catch (Exception ex5) {
                    ex5.getStackTrace();
                    System.out.println(ex5);
                }

                setVisible(false);
                new Show_Certificate1(Roll10).setVisible(true);


            } catch (Exception ex5) {
                ex5.getStackTrace();
                System.out.println(ex5);
            }
        }


        if (e.getSource() == back)
        {
            setVisible(false);
            new First1().setVisible(true);
        }



    }


    public static void main(String[] args) {
        new CheckSchole();
    }
}

