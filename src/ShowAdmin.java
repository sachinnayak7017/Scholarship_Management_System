//
////import javax.swing.*;
////import javax.swing.filechooser.FileNameExtensionFilter;
////import javax.swing.table.DefaultTableModel;
////import java.awt.*;
////import java.awt.event.ActionListener;
////import java.awt.event.*;
////import java.io.*;
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.ResultSet;
////import java.sql.Statement;
////import net.proteanit.sql.DbUtils;
////import org.apache.poi.xssf.usermodel.XSSFCell;
////import org.apache.poi.xssf.usermodel.XSSFRow;
////import org.apache.poi.xssf.usermodel.XSSFSheet;
////import org.apache.poi.xssf.usermodel.XSSFWorkbook;
////import org.apache.poi.xssf.usermodel.*;
////
////
////public  class ShowAdmin extends JFrame implements ActionListener {
////
////    JButton search;
////    JButton print;
////    JButton back;
////    JButton Excel;
////
////    JTable table;
////    Choice cho;
////    JLabel jb8;
////    ShowAdmin() {
////
////         jb8 = new JLabel("Search by  Email ID :");
////        jb8.setBounds(20,30,250,40);
////        jb8.setFont(new Font("arial",Font.BOLD,22));
////        jb8.setForeground(Color.blue);
////         add(jb8);
////
////        cho= new Choice();
////        cho.setBounds(290,30,200,40);
////        cho.setFont(new Font("arial",Font.BOLD,22));
////        add(cho);
////        try{
////            String driver = "com.mysql.cj.jdbc.Driver";
////            String datbaseurl = "jdbc:mysql://localhost:3306/university";
////            String Username = "root";
////            String Password = "sachin@123";
////            Class.forName(driver);
////            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
////            System.out.println("Database Connected");
////            String q1="select * from  adminsup ";
////            Statement stmt = conn.createStatement();
////            ResultSet rs = stmt.executeQuery(q1);
////            while(rs.next())
////            {
////                cho.add(rs.getString("Email"));
////            }
////        }catch (Exception ex1) {
////            ex1.printStackTrace();
////            System.out.println(ex1);
////        }
////
////
////        search = new JButton("Search");
////        search.setBounds(520, 30, 100, 30);
////        search.setFont(new Font("Admin", Font.BOLD, 18));
////        search.setForeground(Color.WHITE);
////        search.setBackground(Color.BLACK);
////        add(search);
////
////        back = new JButton("Back");
////        back.setBounds(700, 30, 100, 30);
////        back.setFont(new Font("user", Font.BOLD, 18));
////        back.setForeground(Color.WHITE);
////        back.setBackground(Color.black);
////        add(back);
////        Excel = new JButton("Excel");
////        Excel.setBounds(900, 30, 100, 30);
////        Excel.setFont(new Font("user", Font.BOLD, 18));
////        Excel.setForeground(Color.WHITE);
////        Excel.setBackground(Color.black);
////        add(Excel);
////
////        print = new JButton("Print");
////        print.setBounds(1050, 30, 100, 30);
////        print.setFont(new Font("user", Font.BOLD, 18));
////        print.setForeground(Color.WHITE);
////        print.setBackground(Color.blue);
////        add(print);
////
////        table = new JTable();
////        add(table);
////        try{
////            String driver = "com.mysql.cj.jdbc.Driver";
////            String datbaseurl = "jdbc:mysql://localhost:3306/university";
////            String Username = "root";
////            String Password = "sachin@123";
////            Class.forName(driver);
////            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
////            System.out.println("Database Connected");
////            String q2="select * from  adminsup ";
////            Statement stmt = conn.createStatement();
////            ResultSet rs1 = stmt.executeQuery(q2);
////            table .setModel(DbUtils.resultSetToTableModel(rs1));
////
////        }catch (Exception ex)
////        {
////            ex.printStackTrace();
////            System.out.println(ex);
////        }
////        JScrollPane jsp=new JScrollPane(table);
////        jsp.setBounds(0,150,1300,800);
////        jsp.setHorizontalScrollBarPolicy(
////                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
////        jsp.setVerticalScrollBarPolicy(
////                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
////        add(jsp);
////
////
////        Container c = getContentPane();
////        c.setLayout(null);
////        c.setBackground(Color.white);
////        setSize(1350, 1000);
////        setLayout(null);
////        setTitle("AdminSHow");
////        setVisible(true);
////
////        search.addActionListener(this);
////        back.addActionListener(this);
////        print.addActionListener(this);
////        Excel.addActionListener(this);
////
////    }
////
////    public void actionPerformed(ActionEvent e) {
////
////        if (e.getSource() == search) {
////            String q3 = "select * from adminsup where Email='" + cho.getSelectedItem() + "'";
////
////
////            try {
////
////                String driver = "com.mysql.cj.jdbc.Driver";
////                String datbaseurl = "jdbc:mysql://localhost:3306/university";
////                String Username = "root";
////                String Password = "sachin@123";
////                Class.forName(driver);
////                Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
////                System.out.println("Database Connected");
////                Statement stmt = conn.createStatement();
////                ResultSet rs4 = stmt.executeQuery(q3);
////                table.setModel(DbUtils.resultSetToTableModel(rs4));
////
////
////            } catch (Exception ex5) {
////                ex5.getStackTrace();
////                System.out.println(ex5);
////            }
////        }
////        if (e.getSource() == print) {
////            try {
////                table.print();
////            } catch (Exception ex) {
////                ex.printStackTrace();
////            }
////        }
////        if (e.getSource() == back) {
////                setVisible(false);
////                new AdminLg().setVisible(true);
////            }
////        }
////
////
////    public static void main(String[] args) {
////        new ShowAdmin();
////    }
////
////
////}
////
//

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;


public  class ShowAdmin extends JFrame implements ActionListener {

    JButton search;
    JButton print;
    JButton back;
    JButton Excel;

    JTable table;
    Choice cho;
    JLabel jb8;
    ShowAdmin() {

        jb8 = new JLabel("Search by  Email ID :");
        jb8.setBounds(20,30,250,40);
        jb8.setFont(new Font("arial",Font.BOLD,22));
        jb8.setForeground(Color.blue);
        add(jb8);

        cho= new Choice();
        cho.setBounds(290,30,200,40);
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
            String q1="select * from  adminsup ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q1);
            while(rs.next())
            {
                cho.add(rs.getString("Email"));
            }
        }catch (Exception ex1) {
            ex1.printStackTrace();
            System.out.println(ex1);
        }


        search = new JButton("Search");
        search.setBounds(520, 30, 100, 30);
        search.setFont(new Font("Admin", Font.BOLD, 18));
        search.setForeground(Color.WHITE);
        search.setBackground(Color.BLACK);
        add(search);

        back = new JButton("Back");
        back.setBounds(700, 30, 100, 30);
        back.setFont(new Font("user", Font.BOLD, 18));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.black);
        add(back);
        Excel = new JButton("Excel");
        Excel.setBounds(900, 30, 100, 30);
        Excel.setFont(new Font("user", Font.BOLD, 18));
        Excel.setForeground(Color.WHITE);
        Excel.setBackground(Color.black);
        add(Excel);

        print = new JButton("Print");
        print.setBounds(1050, 30, 100, 30);
        print.setFont(new Font("user", Font.BOLD, 18));
        print.setForeground(Color.WHITE);
        print.setBackground(Color.blue);
        add(print);

        table = new JTable();
        add(table);
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String datbaseurl = "jdbc:mysql://localhost:3306/university";
            String Username = "root";
            String Password = "";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
            System.out.println("Database Connected");
            String q2="select * from  adminsup ";
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery(q2);
            table .setModel(DbUtils.resultSetToTableModel(rs1));

        }catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println(ex);
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,150,1300,800);
        jsp.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(jsp);


        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        setSize(1350, 1000);
        setLayout(null);
        setTitle("AdminSHow");
        setVisible(true);

        search.addActionListener(this);
        back.addActionListener(this);
        print.addActionListener(this);
        Excel.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == search) {
            String q3 = "select * from adminsup where Email='" + cho.getSelectedItem() + "'";


            try {

                String driver = "com.mysql.cj.jdbc.Driver";
                String datbaseurl = "jdbc:mysql://localhost:3306/university";
                String Username = "root";
                String Password = "";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                System.out.println("Database Connected");
                Statement stmt = conn.createStatement();
                ResultSet rs4 = stmt.executeQuery(q3);
                table.setModel(DbUtils.resultSetToTableModel(rs4));


            } catch (Exception ex5) {
                ex5.getStackTrace();
                System.out.println(ex5);
            }
        }
        if (e.getSource() == print) {
            try {
                table.print();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == back) {
            setVisible(false);
            new AdminLg().setVisible(true);
        }
    }


    public static void main(String[] args) {
        new ShowAdmin();
    }


}

