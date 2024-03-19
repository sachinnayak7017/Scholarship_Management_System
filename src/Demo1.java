import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public  class Demo1 extends JFrame implements ActionListener {
    JTable table;
    JButton Submit;
    JButton back;
    JTextField tf2;
    JTextField tf1;
    JTextField tf3;
    JTextField tf4;


    Demo1() {

        JLabel jb0 = new JLabel("Enter  student  Information");
        jb0.setBounds(150, 80, 400, 40);
        jb0.setFont(new Font("arial", Font.BOLD, 26));
        jb0.setForeground(Color.red);
        add(jb0);


        JLabel jb1 = new JLabel("Student Id");
        jb1.setBounds(100, 150, 200, 40);
        jb1.setFont(new Font("arial", Font.BOLD, 22));
        add(jb1);

        tf1 = new JTextField();
        tf1.setBounds(300, 150, 150, 40);
        tf1.setFont(new Font("arial", Font.BOLD, 22));
        add(tf1);


        JLabel jb3 = new JLabel("Student Name :");
        jb3.setBounds(100, 210, 200, 40);
        jb3.setFont(new Font("arial", Font.BOLD, 22));
        add(jb3);

        tf2 = new JTextField();
        tf2.setBounds(300, 210, 150, 40);
        tf2.setFont(new Font("arial", Font.BOLD, 22));
        add(tf2);

        JLabel jb4 = new JLabel(" Course :");
        jb4.setBounds(100, 270, 200, 40);
        jb4.setFont(new Font("arial", Font.BOLD, 22));
        add(jb4);

        tf3 = new JTextField();
        tf3.setBounds(300, 270, 150, 40);
        tf3.setFont(new Font("arial", Font.BOLD, 22));
        add(tf3);

        JLabel jb5 = new JLabel("Age :");
        jb5.setBounds(100, 330, 200, 40);
        jb5.setFont(new Font("arial", Font.BOLD, 22));
        add(jb5);

        tf4 = new JTextField();
        tf4.setBounds(300, 330, 150, 40);
        tf4.setFont(new Font("arial", Font.BOLD, 22));
        add(tf4);


        Submit = new JButton("Submit");
        Submit.setBounds(350, 540, 150, 40);
        Submit.setFont(new Font("Admin", Font.BOLD, 18));
        Submit.setForeground(Color.WHITE);
        Submit.setBackground(Color.BLACK);
        add(Submit);

        back = new JButton("Show");
        back.setBounds(140, 540, 150, 40);
        back.setFont(new Font("user", Font.BOLD, 18));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        add(back);


        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);
        setSize(1300, 1000);
        setLayout(null);
        setTitle("student");
        setVisible(true);

        Submit.addActionListener(this);
        back.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Submit) {
            try {
                String id = tf1.getText();
                String name = tf2.getText();
                String course = tf3.getText();
                String age = tf4.getText();

                try {

                    String driver = "com.mysql.cj.jdbc.Driver";
                    String datbaseurl = "jdbc:mysql://localhost:3306/test1";
                    String Username = "root";
                    String Password = "";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                    System.out.println("Database Connected");
                    String q = "insert into student value ( '" + id + "'  ,'" + name + "','" + course + "','" + age + "')";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Your data Successfully Inserted");
                    System.out.println("Data inserted..");


                } catch (Exception ex5) {
                    ex5.getStackTrace();
                    System.out.println(ex5);
                }


            } catch(Exception ex5){
                ex5.getStackTrace();
                System.out.println(ex5);
            }
        }


        if (e.getSource() == back) {
            table = new JTable();
            add(table);
            try{
                String driver = "com.mysql.cj.jdbc.Driver";
                String datbaseurl = "jdbc:mysql://localhost:3306/test1";
                String Username = "root";
                String Password = "";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                System.out.println("Database Connected");
                String q2="select * from  student ";
                Statement stmt = conn.createStatement();
                ResultSet rs1 = stmt.executeQuery(q2);
                table .setModel(DbUtils.resultSetToTableModel(rs1));

            }catch (Exception ex)
            {
                ex.printStackTrace();
                System.out.println(ex);
            }
            JScrollPane jsp=new JScrollPane(table);
            jsp.setBounds(500,100,600,400);
            jsp.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            jsp.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            add(jsp);

        }
    }


    public static void main(String[] args) {
        new Demo1();
    }
}
