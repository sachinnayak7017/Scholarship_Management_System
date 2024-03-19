import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class From2 extends JFrame implements ActionListener {

    JFrame F1;
    JButton back;
    JButton Submit;

    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
//    JLabel l13;
//JDateChooser t13;
    JLabel l14;
    JLabel l15;
    JLabel l16;
    JLabel l17;
    JLabel l18;
    JLabel l19;
    JLabel l20;
    JLabel l21;
    JLabel l22;
    JLabel l23;
    JLabel l24;


    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
//    JTextField t12;
    JRadioButton t12;
    JDateChooser t13;
//    JTextField t13;
    JTextField t14;
    JTextField t15;
    JRadioButton t16;
    JRadioButton t30;
    JTextField t17;
//    JTextField t18;
        JComboBox t18;

    JTextField t19;
    JTextField t20;
    JTextField t21;
//    JTextField t22;
//
        JComboBox t22;
    JTextField t23;
    JTextField t24;
    JTextField t25;
    JTextField t26;
    JTextField t27;
    String Roll;

    From2( String Roll) {
        this.Roll=Roll;
        F1 = new JFrame("Frame 2");
        back = new JButton("Back");
        back.setBackground(Color.green);
        back.setBounds(200, 600, 100, 50);
        F1.add(back);


        Submit = new JButton("Submit");
        Submit.setBackground(Color.green);
        Submit.setBounds(950, 600, 100, 50);
        F1.add(Submit);


        JLabel l1 = new JLabel("Shobhit University Gangoh");
        l1.setFont(new Font("arial", Font.BOLD, 40));
        l1.setBounds(300, 10, 550, 150);
        F1.add(l1);
        Container ct1 = F1.getContentPane();
        JLabel il1 = new JLabel();
        il1.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\shobhit1.jpg"));
        Dimension di = il1.getPreferredSize();
        il1.setBounds(20, 00, di.width, di.height);
        F1.add(il1);

        Container ct2 = F1.getContentPane();
        JLabel il2 = new JLabel();
        il2.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\shobhit2.png"));
        Dimension d = il2.getPreferredSize();
        il2.setBounds(900, 00, d.width, d.height);
        F1.add(il2);


        l7 = new JLabel("Enter Mobile No.*");
        l7.setFont(new Font("arial", Font.BOLD, 18));
        l8 = new JLabel("Enter Alternate Mobile No.");
        l8.setFont(new Font("arial", Font.BOLD, 18));
        l9 = new JLabel("Enter Email ID.*");
        l9.setFont(new Font("arial", Font.BOLD, 18));
        l10 = new JLabel("Gender.*");
        l10.setFont(new Font("arial", Font.BOLD, 18));
        l11 = new JLabel(" Date of Birth.*");
        l11.setFont(new Font("arial", Font.BOLD, 18));
        l5 = new JLabel("Father's Name.*");
        l5.setFont(new Font("arial", Font.BOLD, 18));
        l6 = new JLabel("Enter Mother's Name.*");
        l6.setFont(new Font("arial", Font.BOLD, 18));


//        Integer year[] = {1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967,
//                1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987,
//                1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007,
//                2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027,
//                2028, 2029, 2030, 2031, 2032, 2033, 2034, 2035, 2036, 2037, 2038, 2039, 2040, 2041, 2042, 2043, 2044, 2045, 2046, 2047,
//                2048, 2049, 2050};
        Integer year[] = { 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007,
                2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027,
                2028, 2029, 2030,};
        l14 = new JLabel("Enter 10th Roll No.*");
        l14.setFont(new Font("arial", Font.BOLD, 18));
        l15 = new JLabel(" 10th Pass Year.*");
        l15.setFont(new Font("arial", Font.BOLD, 18));
        l16 = new JLabel("10th BOARD ");
        l16.setFont(new Font("arial", Font.BOLD, 18));
        l17 = new JLabel("10th Obtained Marks.*");
        l17.setFont(new Font("arial", Font.BOLD, 18));
        l18 = new JLabel(" Enter 12th Roll No.*");
        l18.setFont(new Font("arial", Font.BOLD, 18));
        l19 = new JLabel("  12th Pass Year.*");
        l19.setFont(new Font("arial", Font.BOLD, 18));
        l20 = new JLabel(" 12th Obtained Marks.*");
        l20.setFont(new Font("arial", Font.BOLD, 18));
        l21 = new JLabel(" %");
//       l21 .setFont(new Font("arial",Font.BOLD,18));
        l22 = new JLabel(" %");
//        l22.setFont(new Font("arial",Font.BOLD,18));
        l23 = new JLabel("Total");
//        l23.setFont(new Font("arial",Font.BOLD,18));
        l24 = new JLabel("Total");
//       l24.setFont(new Font("arial",Font.BOLD,18));

        t8 = new JTextField();
        t8.setFont(new Font("arial", Font.BOLD, 15));
        t9 = new JTextField();
        t9.setFont(new Font("arial", Font.BOLD, 15));
        t10 = new JTextField();
        t10.setFont(new Font("arial", Font.BOLD, 15));
        t11 = new JTextField();
        t11.setFont(new Font("arial", Font.BOLD, 15));
        t12 = new JRadioButton("Male");
//        t12 = new JTextField();
        t12.setFont(new Font("arial", Font.BOLD, 15));
        t16 = new JRadioButton("Female");
        t16.setFont(new Font("arial", Font.BOLD, 15));
        t30 = new JRadioButton("Other");
        t30.setFont(new Font("arial", Font.BOLD, 15));
        ButtonGroup A = new ButtonGroup();
//        add(t12);
        A.add(t12);
        A.add(t16);
        A.add(t30);


        t16.setFont(new Font("arial", Font.BOLD, 15));
        t13 = new JDateChooser();
//        t13 = new JTextField();

        t13.setFont(new Font("arial", Font.BOLD, 15));
        t14 = new JTextField();
        t14.setFont(new Font("arial", Font.BOLD, 15));
        t15 = new JTextField();
        t15.setFont(new Font("arial", Font.BOLD, 15));


        t17 = new JTextField();
        t17.setFont(new Font("arial", Font.BOLD, 15));
         t18 = new JComboBox(year);//////////////
//        t18 = new JTextField();
        t18.setFont(new Font("arial", Font.BOLD, 15));
        t19 = new JTextField();
        t19.setFont(new Font("arial", Font.BOLD, 15));
        t20 = new JTextField();
        t20.setFont(new Font("arial", Font.BOLD, 15));
        t25 = new JTextField();
        t25.setFont(new Font("arial", Font.BOLD, 15));
        t26 = new JTextField();
        t26.setFont(new Font("arial", Font.BOLD, 15));
        t21 = new JTextField();
        t21.setFont(new Font("arial", Font.BOLD, 15));
         t22= new JComboBox(year);
//        t22 = new JTextField();//////////
        t22.setFont(new Font("arial", Font.BOLD, 15));
        t23 = new JTextField();
        t23.setFont(new Font("arial", Font.BOLD, 15));
        t24 = new JTextField();
        t24.setFont(new Font("arial", Font.BOLD, 15));
        t27 = new JTextField();
        t27.setFont(new Font("arial", Font.BOLD, 15));


        l7.setBounds(40, 150, 230, 40);
        l8.setBounds(40, 210, 230, 40);
        l9.setBounds(40, 270, 230, 40);
        l10.setBounds(40, 330, 230, 40);
        l11.setBounds(40, 390, 230, 40);
        l5.setBounds(40, 450, 230, 40);
        l6.setBounds(40, 510, 230, 40);

        l14.setBounds(640, 150, 230, 40);
        l15.setBounds(640, 210, 230, 40);
        l16.setBounds(640, 270, 230, 40);
        l17.setBounds(640, 330, 230, 40);
        l18.setBounds(640, 390, 230, 40);
        l19.setBounds(640, 450, 230, 40);
        l20.setBounds(640, 510, 230, 40);

        l21.setBounds(1170, 330, 20, 40);
        l22.setBounds(1170, 510, 20, 40);
        l23.setBounds(1010, 510, 40, 40);
        l24.setBounds(1010, 330, 40, 40);
//

        t9.setBounds(310, 150, 300, 40);
        t10.setBounds(310, 210, 300, 40);
        t11.setBounds(310, 270, 300, 40);
        t12.setBounds(300, 330, 80, 40);
        t16.setBounds(400, 330, 80, 40);
        t30.setBounds(500, 330, 80, 40);
        t13.setBounds(310, 390, 300, 40);
        t14.setBounds(310, 450, 300, 40);
        t15.setBounds(310, 510, 300, 40);


        t17.setBounds(830, 150, 300, 40);
        t18.setBounds(830, 210, 150, 40);
        t19.setBounds(830, 270, 300, 40);
        t20.setBounds(830, 330, 80, 40);
        t21.setBounds(830, 390, 300, 40);
        t22.setBounds(830, 450, 150, 40);
        t23.setBounds(830, 510, 80, 40);
        t24.setBounds(920, 510, 80, 40);
        t26.setBounds(920, 330, 80, 40);
        t25.setBounds(1080, 330, 80, 40);
        t27.setBounds(1080, 510, 80, 40);


        F1.add(l7);
        F1.add(l8);
        F1.add(l9);
        F1.add(l10);
        F1.add(l11);
        F1.add(l5);
        F1.add(l6);

        F1.add(l14);
        F1.add(l15);
        F1.add(l16);
        F1.add(l17);
        F1.add(l18);
        F1.add(l19);
        F1.add(l20);
        F1.add(l21);
        F1.add(l22);
        F1.add(l23);
        F1.add(l24);

        F1.add(t8);
        F1.add(t9);
        F1.add(t10);
        F1.add(t11);
        F1.add(t16);
        F1.add(t12);
        F1.add(t30);
        F1.add(t13);////////////////////////////////////////////////////////////////////////////////////////////////
        F1.add(t14);
        F1.add(t15);

        F1.add(t17);
        F1.add(t18);
        F1.add(t19);
        F1.add(t20);
        F1.add(t21);
        F1.add(t22);
        F1.add(t23);
        F1.add(t24);
        F1.add(t25);
        F1.add(t26);
        F1.add(t27);

        Container c = F1.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        F1.setBackground(Color.white);
        F1.setSize(1300, 1000);
        F1.setLayout(null);
        F1.setVisible(true);
        Submit.addActionListener(this);
        back.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back)
        {
            F1.setVisible(false);
            new From1().setVisible(true);
//            dispose();
        }
        try {
            String Mobil =""+ t9.getText();
            String AltMo = ""+t10.getText();
            String Gmail = t11.getText();
//            String Gender = t12.getText();
            String Gender = null;  //female t16////// Male t12
            if (t12.isSelected()) {
                Gender = "Male";
            } else if (t16.isSelected()) {
                Gender = "Female";
            }else if (t30.isSelected()) {
                Gender = "other";
            }
//            String DOB =""+ t13.getText();
            String DOB =((JTextField) t13.getDateEditor().getUiComponent()).getText();
            String FatherNa = t14.getText();
            String MotherNa = t15.getText();
            String Roll10 = ""+t17.getText();
//            String Pass10 = ""+t18.getText();
            String Pass10 = "" + t18.getSelectedItem();

            String Certificate = ""+t19.getText();
            String Marks10 = ""+t20.getText();
            String MarksT10 =""+ t26.getText();
            String Percentage10 =""+ t25.getText();
            String Roll12 =""+ t21.getText();
//            String Pass12 = ""+t22.getText();
            String Pass12 = "" + t22.getSelectedItem();

            String Marks12 =""+ t23.getText();
            String MarksT12 =""+ t24.getText();
            String Percentage12 =""+ t27.getText();

//            if(Mobil.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Mobile NO   field");
//        }else if(Gmail.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Email ID   field");
//        }else if(Gender.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Gender field");
//        }else if(DOB.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the DOB   field");
//        }else if(FatherNa.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Father Name   field");
//        }else if(MotherNa.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Mother Name   field");
//        }else if(Roll10.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the ROll NO 10th   field");
//        }else if(Pass10.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the pass year 10th Class   field");
//        }else if(Marks10.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Marks Class 10th   field");
//        }else if(Roll12.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Roll NO 12th   field");
//        }else if(Pass12.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Pass Year 12th Class   field");
//        }else if(Marks12.equals("")){
//            JOptionPane.showMessageDialog(null,"Please fill the Marks Class 12th   field");
//        }

                try {

            String driver = "com.mysql.cj.jdbc.Driver";
            String datbaseurl = "jdbc:mysql://localhost:3306/university";
            String Username = "root";
            String Password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
            System.out.println("Database Connected");
//            Connection conn = JdbcConnection.getConnection();
            String q2 = "insert into studentInformation2 value( '" +Roll+"','"+ Mobil + "','" + AltMo + "','" + Gmail + "','" + Gender + "','" + DOB + "','" + FatherNa + "','" + MotherNa + "','" + Roll10 + "','" + Pass10 + "','" + Certificate + "','" + Marks10 + "','" + MarksT10 + "','" + Percentage10 + "','" + Roll12 + "','" + Pass12 + "','" + Marks12 + "','" + MarksT12 + "','" + Percentage12 + "')";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(q2);
            JOptionPane.showMessageDialog(null, "Your data Successfully Inserted");

        }
        catch (Exception ex)
        {
            ex.getStackTrace();
        }

        if (e.getSource() == Submit)
        {
            F1.setVisible(false);
            new Show_CertificateWF(Roll).setVisible(true);
        }
    }
    catch(Exception ex2)
        {
        System.out.println(ex2);
        }

}
public static void main(String[] args)
    {
        new From2( "");
    }
}
