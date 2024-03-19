import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowCertificate extends Frame implements ActionListener {

JLabel jb0;
JLabel jb1;
JLabel jb2;
JLabel jb3;
JLabel jb4;
JLabel jb8;

JLabel jb9;
JButton print;

Choice cho;
Choice cho1;

//JFrame f;
    ShowCertificate()
    {
//        f=new JFrame();

        JLabel il3 = new JLabel();
        il3.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\38e64776-4b74-44bb-93cb-634facfb71c2.jpg"));
        Dimension size2 = il3.getPreferredSize();
        il3.setBounds(10, 80, size2.width, size2.height);
       add(il3);


         jb0 = new JLabel();
        jb0.setBounds(700, 345, 200, 40);
        jb0.setFont(new Font("arial", Font.BOLD, 20));
        il3.add(jb0);


         jb1 = new JLabel();
        jb1.setBounds(200, 375, 200, 40);
        jb1.setFont(new Font("arial", Font.BOLD, 15));
        il3.add(jb1);

        jb2 = new JLabel();
        jb2.setBounds(580, 372, 150, 40);
        jb2.setFont(new Font("arial", Font.BOLD, 20));
        il3.add(jb2);


         jb3 = new JLabel();
        jb3.setBounds(660, 425, 200, 40);
        jb3.setFont(new Font("arial", Font.BOLD, 15));
        il3.add(jb3);

        jb4 = new JLabel();
        jb4.setBounds(760, 372, 80, 40);
        jb4.setFont(new Font("arial", Font.BOLD, 20));
        il3.add(jb4);

//
         jb8 = new JLabel("Search User RollNO :");
        jb8.setBounds(20,30,250,40);
        jb8.setFont(new Font("arial",Font.BOLD,22));
        jb8.setForeground(Color.blue);
        add(jb8);

        cho= new Choice();
        cho.setBounds(275,30,200,40);
        cho.setFont(new Font("arial",Font.BOLD,22));
         add(cho);
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String datbaseurl = "jdbc:mysql://localhost:3306/university";
            String Username = "root";
            String Password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
            System.out.println("Database Connected");
            String q1="select * from StudentInfo2 ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q1);
            while(rs.next())
            {
                cho.add(rs.getString("RollNo"));
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
                    String q1 = "select * from  StudentInfo2 where RollNO='"+cho.getSelectedItem()+"'";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(q1);
                    while (rs.next()) {
                        jb0.setText(rs.getString("Name"));
                        jb2.setText(rs.getString("Course"));
                        jb4.setText(rs.getString("Branch"));

                    }
                } catch (Exception ex1) {
                    ex1.printStackTrace();
                    System.out.println(ex1);
                }

            }
             });


        jb9 = new JLabel("10th RollNO :");
        jb9.setBounds(490,30,200,40);
        jb9.setFont(new Font("arial",Font.BOLD,22));
        jb9.setForeground(Color.blue);
        add(jb9);

        cho1= new Choice();
        cho1.setBounds(690,35,170,30);
        cho1.setFont(new Font("arial",Font.BOLD,22));
        add(cho1);
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String datbaseurl = "jdbc:mysql://localhost:3306/university";
            String Username = "root";
            String Password = "sachin@123";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
            System.out.println("Database Connected");
            String q1="select * from StudentInformation2 ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q1);
            while(rs.next())
            {
                cho1.add(rs.getString("10th_ROll_No"));
            }
        }catch (Exception ex1) {
            ex1.printStackTrace();
        }
        cho1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                try {
                    String driver = "com.mysql.cj.jdbc.Driver";
                    String datbaseurl = "jdbc:mysql://localhost:3306/university";
                    String Username = "root";
                    String Password = "sachin@123";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                    System.out.println("Database Connected");
                    String q1 = "select * from  StudentInformation2 where 10th_ROll_No='"+cho1.getSelectedItem()+"'";
                    Statement stmt = conn.createStatement();
                    ResultSet rs1 = stmt.executeQuery(q1);
                    while (rs1.next()) {
                        jb1.setText(rs1.getString("Father_Name"));
                    }
                } catch (Exception ex1) {
                    ex1.printStackTrace();
                    System.out.println(ex1);
                }

            }
        });


        print = new JButton("Print");
        print.setBounds(900, 30, 100, 30);
        print.setFont(new Font("user", Font.BOLD, 18));
        print.setForeground(Color.WHITE);
        print.setBackground(Color.blue);
        add(print);



        setSize(1030,700);
        setLayout(null);
        setTitle("Certificate");
        setVisible(true);
        print.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {

//        if (e.getSource() == print) {
//            try{
//               f.print();
//            }catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }



    }

    public static void main(String[] args) {
        new ShowCertificate();

    }
}