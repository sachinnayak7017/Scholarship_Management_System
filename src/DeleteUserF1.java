

import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class DeleteUserF1 extends JFrame implements ActionListener {
    JFrame F;
    JButton next;
    JButton submit1;
    JButton close;
    JLabel l0;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;

    JLabel l11;
    JLabel l12;
    JLabel l13;

    JLabel l16;

    JLabel l21;


    JLabel l29;
    JLabel l30;

    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;

    JComboBox t6;
    JTextField t7;

    JComboBox t26;
    JTextField t27;
    JComboBox t8;
    JTextField t9;
    JTextField t11;
    JTextField t12;
    JComboBox t13;
    JTextField t17;
    Choice cho;

    DeleteUserF1(){
        F = new JFrame();
        next = new JButton("DELETE");
        close = new JButton("Back");
        submit1 = new JButton("Submit");
        next.setBackground(Color.LIGHT_GRAY);
        close.setBackground(Color.LIGHT_GRAY);
        submit1.setBackground(Color.green);
        JLabel l = new JLabel(" Personal Information for University");
        l.setFont(new Font("arial",Font.BOLD,35));
        l.setBounds(380, 20, 600, 50);


        Container ct = F.getContentPane();

        JLabel il = new JLabel();
        il.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\shobhit1.jpg"));
        Dimension dimension = il.getPreferredSize();
        il.setBounds(100,00, dimension.width, dimension.height);



        F.add(il);
        l0 = new JLabel("Enrolment No.*");
        l0.setFont(new Font("arial",Font.BOLD,18));
        l1 = new JLabel("Enter Roll No.*");
        l1.setFont(new Font("arial",Font.BOLD,18));
        l2 = new JLabel("Enter your Name.*");
        l2. setFont(new Font("arial",Font.BOLD,18));

        l3 = new JLabel("Enter Course.*");
        l3. setFont(new Font("arial",Font.BOLD,18));

        l4 = new JLabel("Enter Branch.*");
        l4.setFont(new Font("arial",Font.BOLD,18));

        l5 = new JLabel("Entry Year in University.*");
        l5. setFont(new Font("arial",Font.BOLD,18));

        l6 = new JLabel("Aadhaar card No.*");
        l6. setFont(new Font("arial",Font.BOLD,18));


        l29 = new JLabel(" State ");
        l29.setFont(new Font("arial",Font.BOLD,18));

        l30 = new JLabel("Your Address.*");
        l30 .setFont(new Font("arial",Font.BOLD,18));

        l7 = new JLabel("Graduation Year.*");
        l7. setFont(new Font("arial",Font.BOLD,18));
        l8 = new JLabel("Graduation Year marks");
        l8.setFont(new Font("arial",Font.BOLD,18));
        l11 = new JLabel("CGPA.");
        l11.setFont(new Font("arial",Font.BOLD,13));
        l12 = new JLabel("SGPA.");
        l12. setFont(new Font("arial",Font.BOLD,13));
        l13 = new JLabel("Percentage");
        l13. setFont(new Font("arial",Font.BOLD,13));
        l16 = new JLabel("Category.");
        l16. setFont(new Font("arial",Font.BOLD,18));
        l21 = new JLabel("Attendance.");
        l21. setFont(new Font("arial",Font.BOLD,18));



        Container c = F.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        Integer year[] = {1, 2, 3, 4};
        Integer Enteryear[] = {1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967,
                1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987,
                1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007,
                2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027,
                2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047,
                2048, 2049, 2050};

        String State[] = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat",
                "Haryana", "Himachal Pradesh", "JharKhand", "Karnataka", "Kerala", "Madhye Pradesh", "Maharashtra", "Manipur",
                "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana",
                "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"};
        String Cata[]={"General","OBC","SC","ST"};
        t1 = new JTextField();
        t1.setFont(new Font("arial",Font.BOLD,15));
        t2 = new JTextField();
        t2.setFont(new Font("arial",Font.BOLD,15));
        t3 = new JTextField();
        t3.setFont(new Font("arial",Font.BOLD,15));
        t4 = new JTextField();
        t4.setFont(new Font("arial",Font.BOLD,15));
        t5 = new JTextField();
        t5.setFont(new Font("arial",Font.BOLD,15));
        t6 = new JComboBox(Enteryear);
        t6.setFont(new Font("arial",Font.BOLD,15));
        t7 = new JTextField();
        t7.setFont(new Font("arial",Font.BOLD,15));
        t8 = new JComboBox(year);
        t8.setFont(new Font("arial",Font.BOLD,15));
        t9 = new JTextField();
        t9.setFont(new Font("arial",Font.BOLD,15));
        t11 = new JTextField();
        t11.setFont(new Font("arial",Font.BOLD,15));
        t12 = new JTextField();
        t12.setFont(new Font("arial",Font.BOLD,15));
        t13 = new JComboBox(Cata);
        t13.setFont(new Font("arial",Font.BOLD,15));
        t17 = new JTextField();
        t17.setFont(new Font("arial",Font.BOLD,15));

        t26 = new JComboBox(State);
        t26.setFont(new Font("arial",Font.BOLD,15));
        t27 = new JTextField();
        t27.setFont(new Font("arial",Font.BOLD,15));






        l0.setBounds(70, 150, 230, 40);
        l1.setBounds(70, 205, 230, 30);
        l2.setBounds(70, 265, 230, 30);
        l3.setBounds(70, 325, 230, 30);
        l4.setBounds(70, 380, 230, 30);
        l5.setBounds(70, 435, 230, 30);
        l6.setBounds(70, 490, 230, 30);
        l29.setBounds(70, 545, 230, 30);

        l30.setBounds(600, 525, 230, 40);
        l7.setBounds(580, 150, 230, 30);
        l8.setBounds(580, 200, 300, 30);
        l11.setBounds(620, 250, 100, 30);
        l12.setBounds(620, 300, 100, 30);
        l13.setBounds(620, 360, 100, 30);
        l16.setBounds(600, 420, 100, 30);
        l21.setBounds(600, 470, 100, 30);
        t1.setBounds(310, 150, 250, 30);
        t2.setBounds(310, 205, 250, 30);
        t3.setBounds(310, 265, 250, 30);
        t4.setBounds(310, 325, 250, 30);
        t5.setBounds(310, 380, 250, 30);
        t6.setBounds(310, 435, 100, 30);
        t7.setBounds(310, 490, 250, 30);
        t26.setBounds(310, 545, 250, 30);

        t8.setBounds(770, 150, 100, 30);
        t9.setBounds(770, 250, 90, 30);
        t27.setBounds(770, 520, 260, 35);
        t11.setBounds(770, 300, 90, 30);
        t12.setBounds(770, 360, 90, 30);
        t13.setBounds(770, 420, 90, 30);
        t17.setBounds(770,470 , 100, 30);




        close.setBounds(200, 640, 100, 40);
        next.setBounds(950, 640, 100, 40);
        submit1.setBounds(550, 640, 100, 40);

        F.add(l);

        F.add(l0);
        F.add(l1);
        F.add(l2);
        F.add(l3);
        F.add(l4);
        F.add(l5);
        F.add(l6);
        F.add(l7);
        F.add(l8);
        F.add(l11);
        F.add(l12);
        F.add(l13);
        F.add(l16);
        F.add(l21);

        F.add(l29);
        F.add(l30);
        F.add(t1);
        F.add(t2);
        F.add(t3);
        F.add(t4);
        F.add(t5);
        F.add(t6);
        F.add(t7);
        F.add(t8);
        F.add(t9);
        F.add(t11);
        F.add(t12);
        F.add(t13);
        F.add(t17);

        F.add(t26);
        F.add(t27);
        F.add(next);
        F.add(close);
//        F.add(submit1);

        JLabel jb8 = new JLabel("Search by Admin RollNO :");
        jb8.setBounds(650,80,300,40);
        jb8.setFont(new Font("arial",Font.BOLD,22));
        jb8.setForeground(Color.blue);
        F. add(jb8);

        cho= new Choice();
        cho.setBounds(950,80,250,40);
        cho.setFont(new Font("arial",Font.BOLD,22));
        F. add(cho);
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
                    String q =" select * from StudentInfo2 where RollNO='"+cho.getSelectedItem()+"'";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(q);
                    while(rs.next())
                    {
                        t1.setText(rs.getString("Enrolment"));
                        t2.setText(rs.getString("RollNO"));
                        t3.setText(rs.getString("Name"));
                        t4.setText(rs.getString("Course"));
                        t5.setText(rs.getString("Branch"));
                        t6.setSelectedItem(rs.getString("Entry_Year"));
                        t7.setText(rs.getString("Aadhaar_no"));

                        t26.setSelectedItem(rs.getString("State"));
                        t8.setSelectedItem(rs.getString("Graduation_Year"));
                        t9.setText(rs.getString("CGPA"));
                        t11.setText(rs.getString("SGPA"));
                        t12.setText(rs.getString("Percentage"));
                        t13.setSelectedItem(rs.getString("Cateagary"));
                        t17.setText(rs.getString("Attends"));
                        t27.setText(rs.getString("Address"));


                    }
                }catch (Exception ex1) {
                    ex1.printStackTrace();
                }
            }


        });





        F.setSize(1300, 1000);
        F.setLayout(null);
        F.setVisible(true);

        next.addActionListener(this);
        close.addActionListener(this);
        submit1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == close) {
            F.setVisible(false);
            new AdminLg().setVisible(true);
        }
        if (e.getSource() == next) {
            try {

                String Enrolment = "" + t1.getText();
                String Roll = "" + t2.getText();
                String Name = t3.getText();
                String Course = t4.getText();
                String Branch = t5.getText();
                String EyearUni = "" + t6.getSelectedItem();
                String Aadhaar = "" + t7.getText();

                String State = "" + t26.getSelectedItem();
                String GraduYear = "" + t8.getSelectedItem();
                String Cgpa = "" + t9.getText();
                String Sgpa = "" + t11.getText();
                String Percentage = "" + t12.getText();
                String Cateagary = "" + t13.getSelectedItem();
                String Attends = "" + t17.getText();
                String Address = t27.getText();


                try {

                    String driver = "com.mysql.cj.jdbc.Driver";
                    String datbaseurl = "jdbc:mysql://localhost:3306/university";
                    String Username = "root";
                    String Password = "";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                    System.out.println("Database Connected");
//                Connection conn = JdbcConnection.getConnection();
                    String q = "Delete from  StudentInfo2  where RollNo='" + Roll + "'";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(q);
                    String q1 = "Delete from  StudentInformation2  where RollNo='" + Roll + "'";
                    Statement stm = conn.createStatement();
                    stm.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null, "Your All data Successfully Delete");

                } catch (Exception ex) {
                    ex.getStackTrace();
                    System.out.println(ex);
                }

                F.setVisible(false);
//                new DeleteUserF2(Roll).setVisible(true);
            } catch (Exception ex2) {
                System.out.println(ex2);
            }
        }
    }
    public static void main(String[] args)
    {
        new DeleteUserF1();
    }
}

