
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Show_CertificateWF extends Frame implements ActionListener {

    JLabel jb0;
    JLabel jb1;
    JLabel jb2;
    JLabel jb3;
    JLabel jb4;
    JLabel jb8;


    JButton print;
    JButton back;
    String Roll;


    JFrame f;
    JPanel p;
    JLabel il3;
    Show_CertificateWF(String Roll)
    {
        this.Roll=Roll;
        f=new JFrame();
        p=new JPanel();
        f.add(p);

        il3 = new JLabel();
        il3.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Screenshot (20).png"));
        Dimension size2 = il3.getPreferredSize();
        il3.setBounds(10, 80, size2.width, size2.height);
        add(il3);

//
        jb0 = new JLabel();
        jb0.setBounds(400, 392, 200, 40);
        jb0.setFont(new Font("arial", Font.BOLD, 20));
        il3.add(jb0);


        jb1 = new JLabel();
        jb1.setBounds(750, 392, 200, 40);
        jb1.setFont(new Font("arial", Font.BOLD, 15));
        il3.add(jb1);

        jb2 = new JLabel();
        jb2.setBounds(220, 422, 150, 40);
        jb2.setFont(new Font("arial", Font.BOLD, 20));
        il3.add(jb2);


        jb3 = new JLabel();
        jb3.setBounds(460, 423, 200, 40);
        jb3.setFont(new Font("arial", Font.BOLD, 15));
        il3.add(jb3);

        jb4 = new JLabel();
        jb4.setBounds(830, 470, 80, 40);
        jb4.setFont(new Font("arial", Font.BOLD, 20));
        il3.add(jb4);
        try {
                    String driver = "com.mysql.cj.jdbc.Driver";
                    String datbaseurl = "jdbc:mysql://localhost:3306/university";
                    String Username = "root";
                    String Password = "";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                    System.out.println("Database Connected");
                    String q1 = "select * from  studentInfo2 where RollNO='"+Roll+"'";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(q1);
                    while (rs.next()) {
                        jb0.setText(rs.getString("Name"));
                        jb2.setText(rs.getString("Course"));
                        jb3.setText(rs.getString("Branch"));

                    }
                } catch (Exception ex1) {
                    ex1.printStackTrace();
                    System.out.println(ex1);
                }   try {
                    String driver = "com.mysql.cj.jdbc.Driver";
                    String datbaseurl = "jdbc:mysql://localhost:3306/university";
                    String Username = "root";
                    String Password = "";
                    Class.forName(driver);
                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                    System.out.println("Database Connected");
                    String q1 = "select * from  studentInformation2 where RollNo='"+Roll+"'";
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(q1);
                    while (rs.next()) {

                        jb1.setText(rs.getString("Father_Name"));


                    }
                } catch (Exception ex1) {
                    ex1.printStackTrace();
                    System.out.println(ex1);
                }

        print = new JButton("Print");
        print.setBounds(900, 30, 100, 30);
        print.setFont(new Font("user", Font.BOLD, 18));
        print.setForeground(Color.WHITE);
        print.setBackground(Color.blue);
        print.setActionCommand("print");
        add(print);

        back = new JButton("back");
        back.setBounds(750, 30, 100, 30);
        back.setFont(new Font("user", Font.BOLD, 18));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.black);
        add(back);


        setSize(1100,730);
        setLayout(null);
        setTitle("Certificate");
        setVisible(true);
        print.addActionListener(this);
        back.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == print) {
            try {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setJobName("Print Data");
                job.setPrintable(new Printable() {
                    public int print(Graphics pg, PageFormat pf, int pageNum) {
                        pf.setOrientation(PageFormat.LANDSCAPE);
                        if (pageNum > 0) {
                            return Printable.NO_SUCH_PAGE;
                        }
                        Graphics g2 = (Graphics2D) pg;
                        g2.translate((int) pf.getImageableX(), (int) pf.getImageableY());
                        ((Graphics2D) g2).scale(0.50, 0.50);

                        il3.print(g2);
                        return Printable.PAGE_EXISTS;

                    }
                });
                boolean ok = job.printDialog();
                if (ok) {
                    try {
                        job.print();
                    } catch (PrinterException ex) {
                        ex.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        if (e.getSource() == back)
        {
            setVisible(false);
            new User().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Show_CertificateWF("");

    }
}
