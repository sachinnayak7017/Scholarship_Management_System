import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public  class DeleteAdmin extends JFrame implements ActionListener {

    JButton Submit;
    JButton back;
    JTextField tf5;
    JTextField tf1;
    JTextField tf3;
    JTextField tf4;
    JPasswordField tf6;
    JPasswordField tf7;
    Choice cho;
    DeleteAdmin() {

        JLabel jb0 = new JLabel("DELETE  ADMIN Information");
        jb0.setBounds(330,70,600,40);
        jb0.setFont(new Font("arial",Font.BOLD,26));
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


        JLabel jb3 = new JLabel("Department:");
        jb3.setBounds(300,210,200,40);
        jb3.setFont(new Font("arial",Font.BOLD,22));
        add(jb3);

        tf3 = new JTextField();
        tf3.setBounds(500,210,250,40);
        tf3.setFont(new Font("arial",Font.BOLD,22));
        add(tf3);

        JLabel jb4 = new JLabel(" Name:");
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

        JLabel jb6 = new JLabel("Password:");
        jb6.setBounds(300,390,200,40);
        jb6.setFont(new Font("arial",Font.BOLD,22));
        add(jb6);

        tf6 = new JPasswordField();
        tf6.setBounds(500,390,250,40);
        tf6.setFont(new Font("arial",Font.BOLD,22));
        add(tf6);


        JLabel jb8 = new JLabel("Search by Admin Email:");
        jb8.setBounds(600,20,300,40);
        jb8.setFont(new Font("arial",Font.BOLD,22));
        jb8.setForeground(Color.blue);
        add(jb8);

        cho= new Choice();
        cho.setBounds(910,20,250,40);
        cho.setFont(new Font("arial",Font.BOLD,22));
        add(cho);
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String datbaseurl = "jdbc:mysql://localhost:3306/university";
            String Username = "root";
            String Password = "sachin@123";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
            System.out.println("Database Connected");
            String q1="select * from  adminsup";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q1);
            while(rs.next())
            {
                cho.add(rs.getString("Email"));
            }
        }catch (Exception ex1) {
            ex1.printStackTrace();
        }
        cho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    String driver = "com.mysql.cj.jdbc.Driver";
                    String datbaseurl = "jdbc:mysql://localhost:3306/university";
                    String Username = "root";
                    String Password = "";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                    System.out.println("Database Connected");
                    String q =" select * from adminsup where Email='"+cho.getSelectedItem()+"'";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(q);
                    while(rs.next())
                    {
                        tf1.setText(rs.getString("Email"));
                        tf3.setText(rs.getString("Department"));
                        tf4.setText(rs.getString("Name"));
                        tf5.setText(rs.getString("Gender"));
                        tf6.setText(rs.getString("Password"));


                    }
                }catch (Exception ex1) {
                    ex1.printStackTrace();
                }
            }


        });



        Submit=new JButton("Submit");
        Submit.setBounds(650,550,150,40);
        Submit.setFont(new Font("Admin",Font.BOLD,18));
        Submit.setForeground(Color.WHITE);
        Submit.setBackground(Color.BLACK);
        add(Submit);

        back=new JButton("Back");
        back.setBounds(400,550,150,40);
        back.setFont(new Font("user",Font.BOLD,18));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        add(back);


        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        setSize(1300,1000);
        setLayout(null);
        setTitle("Delete Admin");
        setVisible(true);

        Submit.addActionListener(this);


        back.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == Submit) {
            try {
                String Email = tf1.getText();


//                if (Email.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the  email  field");
//            } else if (Department.equals("")) {
//                JOptionPane.showMessageDialog(null, "Please fill the Department  field");
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
                    String q = "delete from adminsup where Email ='" + Email + "'";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Admin Information Successfully Delete ");
                } catch (Exception ex5) {
                    ex5.getStackTrace();
                    System.out.println(ex5);
                }

                setVisible(false);
                new Admin().setVisible(true);


            } catch (Exception ex5) {
                ex5.getStackTrace();
                System.out.println(ex5);
            }
        }

        if (e.getSource() == back)
        {
            setVisible(false);
            new AdminLg().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new DeleteAdmin();
    }
}
