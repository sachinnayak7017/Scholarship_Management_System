import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;


public  class ShowUserF1 extends JFrame implements ActionListener {

    JButton search;
    JButton print;
    JButton back;

    JTable table;
    Choice cho;
    JLabel jb8;
    ShowUserF1() {

        jb8 = new JLabel("Search by  RollNO :");
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
            String q1="select * from  StudentInfo2";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(q1);
            while(rs.next())
            {
                cho.add(rs.getString("RollNO"));
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

        print = new JButton("Print");
        print.setBounds(950, 30, 100, 30);
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
            String q2="select * from  StudentInfo2 ";
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
        setTitle("UserSHow");
        setVisible(true);

        search.addActionListener(this);
        back.addActionListener(this);
        print.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==search) {
            String q3 = "select * from StudentInfo2 where RollNO='" + cho.getSelectedItem() + "'";


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
                table .setModel(DbUtils.resultSetToTableModel(rs4));


            } catch (Exception ex5) {
                ex5.getStackTrace();
                System.out.println(ex5);
            }
        }

        if (e.getSource() == print) {
            try{
                table.print();
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        }


        if (e.getSource() == back) {
            setVisible(false);
            new AdminLg().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new ShowUserF1();
    }
}



