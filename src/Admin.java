
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Admin extends JFrame implements ActionListener
{
    JButton back;
    JButton login;
    JButton Fg;
    JButton Sup;
    JTextField tf1;
    JPasswordField tf2;
    Admin()
    {
        login=new JButton("Login");
        login.setBounds(700,600,150,40);
        login.setFont(new Font("Admin",Font.BOLD,18));
        login.setForeground(Color.WHITE);
        login.setBackground(Color.BLACK);
        add(login);

        back=new JButton("Back");
        back.setBounds(450,600,150,40);
        back.setFont(new Font("user",Font.BOLD,18));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        add(back);

        Sup=new JButton("Sign Up");
        Sup.setBounds(900,600,150,40);
        Sup.setFont(new Font("Admin",Font.BOLD,18));
        Sup.setForeground(Color.WHITE);
        Sup.setBackground(Color.BLACK);
        add( Sup);

        Fg=new JButton("Forget Password");
        Fg.setBounds(100,600,200,40);
        Fg.setFont(new Font("user",Font.BOLD,18));
        Fg.setForeground(Color.BLUE);
        Fg.setBackground(Color.WHITE);
        add(Fg);


        Container c2 = getContentPane();
        JLabel jb = new JLabel();
        jb.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\shobhit2.jpg"));
        Dimension dimention = jb.getPreferredSize();
        jb.setBounds(50,00,dimention.width,dimention.height);
        add(jb);

        Container c1 = getContentPane();
        JLabel il1 = new JLabel();
        il1.setIcon(new ImageIcon("C:\\\\Users\\\\DELL\\\\Pictures\\\\avatar2.png"));
        Dimension size = il1.getPreferredSize();
        il1.setBounds(550, 140, size.width, size.height);
        add(il1);

        Container c3 = getContentPane();
        JLabel il2 = new JLabel();
        il2.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\email2.png"));
        Dimension size1 = il2.getPreferredSize();
        il2.setBounds(270, 410, size1.width, size1.height);
        add(il2);

        Container c4 = getContentPane();
        JLabel il3 = new JLabel();
        il3.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\passwerd (2).png"));
        Dimension size2 = il3.getPreferredSize();
        il3.setBounds(280, 500, size2.width, size2.height);
        add(il3);



        JLabel l = new JLabel(" Shobhit University Gangoh");
        l.setFont(new Font("arial",Font.BOLD,35));
        l.setBounds(360, 50, 600, 50);
        add(l);

      JLabel la = new JLabel("admin");
      la.setBounds(620,345,150,40);
      la.setFont(new Font("arial",Font.BOLD,24));
      add(la);

        JLabel jb1 = new JLabel("Email Address:");
        jb1.setBounds(350,420,300,40);
        jb1.setFont(new Font("arial",Font.BOLD,22));
        add(jb1);

         tf1 = new JTextField();
        tf1.setBounds(550,420,300,40);
        tf1.setFont(new Font("arial",Font.BOLD,22));
        add(tf1);

        JLabel jb2 = new JLabel("Password:");
        jb2.setBounds(350,500,300,40);
        jb2.setFont(new Font("arial",Font.BOLD,22));
        add(jb2);

         tf2 = new JPasswordField();
        tf2.setBounds(550,500,300,40);
        tf2.setFont(new Font("arial",Font.BOLD,22));
        add(tf2);

        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        setSize(1300,1000);
        setLayout(null);
        setVisible(true);
        login.addActionListener(this);
        Sup.addActionListener(this);
        Fg.addActionListener(this);
        back.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == login)
        {
            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                String datbaseurl = "jdbc:mysql://localhost:3306/university";
                String Username = "root";
                String Password = "";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                System.out.println("Database Connected");
                String Email =""+ tf1.getText();
                String password ="" + tf2.getText();
                String q ="select * from AdminSUp where Email='"+Email+"'and Password ='"+password+"'";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(q);
               if (rs.next())
               {
                   setVisible(false);
                   new AdminLg().setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Incorrect admin Email and Password");
               }
            } catch (Exception ex) {
               ex.printStackTrace();
            }

        }
        if (e.getSource() == back)
        {
            setVisible(false);
            new First1().setVisible(true);
        }

       if (e.getSource() == Fg)
        {
            setVisible(false);
            new ForgetPass().setVisible(true);
        }
        if (e.getSource() == Sup)
        {
            setVisible(false);
            new AdminSUp().setVisible(true);
        }
    }



    public static void main(String[] args) {
        new Admin();
}
}
