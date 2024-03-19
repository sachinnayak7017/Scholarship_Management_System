import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public  class UserSUp extends JFrame implements ActionListener {

    JButton Submit;
    JButton back;
    JTextField tf1;
    JTextField tf4;
    JTextField tf3;
    JTextField tf5;
    JTextField tf9;
    JPasswordField tf6;
    JPasswordField tf7;

    UserSUp() {

        JLabel jb0 = new JLabel("Enter  User  Information");
        jb0.setBounds(330,65,400,40);
        jb0.setFont(new Font("arial",Font.BOLD,30));
        jb0.setForeground(Color.red);
        add(jb0);


        JLabel jb1 = new JLabel("Email Address:");
        jb1.setBounds(300,150,200,40);
        jb1.setFont(new Font("arial",Font.BOLD,22));
        add(jb1);

         tf1 = new JTextField();
        tf1.setBounds(500,150,250,40);
        tf1.setFont(new Font("arial",Font.BOLD,22));
        add(tf1);


        JLabel jb3 = new JLabel("Name");
        jb3.setBounds(300,210,200,40);
        jb3.setFont(new Font("arial",Font.BOLD,22));
        add(jb3);

       tf3 = new JTextField();
        tf3.setBounds(500,210,250,40);
        tf3.setFont(new Font("arial",Font.BOLD,22));
        add(tf3);

        JLabel jb4 = new JLabel("University Name:");
        jb4.setBounds(300,270,200,40);
        jb4.setFont(new Font("arial",Font.BOLD,22));
        add(jb4);

       tf4 = new JTextField();
        tf4.setBounds(500,270,250,40);
        tf4.setFont(new Font("arial",Font.BOLD,22));
        add(tf4);

        JLabel jb5 = new JLabel("Gender:");
        jb5.setBounds(300,330,200,40);
        jb5.setFont(new Font("arial",Font.BOLD,22));
        add(jb5);

      tf5 = new JTextField();
        tf5.setBounds(500,330,250,40);
        tf5.setFont(new Font("arial",Font.BOLD,22));
        add(tf5);

        JLabel jb9 = new JLabel("Father Name:");
        jb9.setBounds(300,390,200,40);
        jb9.setFont(new Font("arial",Font.BOLD,22));
        add(jb9);

     tf9= new JTextField();
        tf9.setBounds(500,390,250,40);
        tf9.setFont(new Font("arial",Font.BOLD,22));
        add(tf9);

        JLabel jb6 = new JLabel("Password:");
        jb6.setBounds(300,440,200,40);
        jb6.setFont(new Font("arial",Font.BOLD,22));
        add(jb6);

       tf6 = new JPasswordField();
        tf6.setBounds(500,440,250,40);
        tf6.setFont(new Font("arial",Font.BOLD,22));
        add(tf6);

        JLabel jb7 = new JLabel("Confirm Password:");
        jb7.setBounds(290,490,200,40);
        jb7.setFont(new Font("arial",Font.BOLD,22));
        add(jb7);

        tf7 = new JPasswordField();
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
            String Email = tf1.getText();
            String Name = tf3.getText();
            String University = tf4.getText();
            String Gender = tf5.getText();
            String FatherN = tf9.getText();
            String Password1 = "" + tf6.getText();
            String Cpassword = "" + tf7.getText();

//                if (Email.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the  email  field");
//            } else if (FatherN.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Father name  field");
//            }else if (University.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Father name  field");
//            } else if (Name.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Name  field");
//            } else if (Gender.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the  Gender field");
//            } else if (Password1.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Password  field");
//            } else if (Cpassword.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Confirm password  field");
//            }

            try {

                String driver = "com.mysql.cj.jdbc.Driver";
                String datbaseurl = "jdbc:mysql://localhost:3306/university";
                String Username = "root";
                String Password = "";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                System.out.println("Database Connected");
                String q = "insert into Usersup value ( '" + Email + "'  ,'" + Name + "','" + University + "','" + Gender + "','" + FatherN + "','" + Password1 + "')";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Your data Successfully Inserted");
                System.out.println("Data inserted..");


            } catch (Exception ex5) {
                ex5.getStackTrace();
                System.out.println(ex5);
            }

                setVisible(false);
                new User().setVisible(true);


            } catch(Exception ex5){
                ex5.getStackTrace();
                System.out.println(ex5);
            }
        }

        if (e.getSource() == back)
        {
            setVisible(false);
            new User().setVisible(true);
        }



    }


    public static void main(String[] args) {
        new UserSUp();
    }
}

