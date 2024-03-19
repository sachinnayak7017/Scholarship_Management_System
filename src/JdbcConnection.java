import java.sql.DriverManager;
import java.sql.*;

public class JdbcConnection
{
    public static void main(String[] args)
    {
        getConnection();
    }
    private static Connection conn;

    public static Connection getConnection()
    {
        try
        {
            String driver = "com.mysql.cj.jdbc.Driver";
                String datbaseurl = "jdbc:mysql://localhost:3306/university";
                String Username = "root";
                String Password = "";
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
                System.out.println("Database Connected");
//             String q = "CREATE TABLE StudentInfo2( Enrolment BIGINT(15)  , RollNO BIGINT(15),Name VARCHAR(30), Course VARCHAR(40), Branch varchar(12),Entry_Year VARCHAR(8), Aadhaar_no BIGINT(12), State VARCHAR(50),  Graduation_Year INT(9), CGPA DOUBLE(10,2), SGPA DOUBLE(10,2),Percentage DOUBLE(10,2),Cateagary Varchar(15), Attends DOUBLE(5,2), Address VARCHAR(90)) ";
////
//            String q = "CREATE TABLE studentInformation2("+
//                    "RollNo BIGINT(14),"+
//                    "Mobile_no BIGINT(10),"
//                    + "Alternate_Mo BIGINT(10),"
//                    + " Gmail_id varchar(30)," +
//                    "Gender varchar(10)," +
//                    "DOB varchar(20)," +
//                    "Father_Name varchar(50)," +
//                    "Mother_Name varchar(50)," +
//                    "10th_Roll_no BIGINT(20)," +
//                    "10th_Pass_year BIGINT(80)," +
//                    " 10th_BOARD varchar(35)," +
//                    "10th_Masks BIGINT(20)," +
//                    "10th_Total_Masks BIGINT(20)," +
//                    "10th_percentage DOUBLE(10,2)," +
//                    "12th_Roll_no BIGINT(20)," +
//                    "12th_Pass_year BIGINT(8)," +
//                    "12th_Marks BIGINT(8)," +
//                    "12th_Total_Masks BIGINT(20)," +
//                    "12th_percentage DOUBLE(10,2))";


//            String q = "CREATE TABLE AdminSUp(Email varchar(20) ,Department varchar(20),Name varchar(30),Gender varchar(10),Password varchar(20))" ;


//            String q = "CREATE TABLE UserSup(Email varchar(20) ,Name varchar(20),University varchar(40),Gender varchar(10),FatherN varchar(30),Password varchar(20))" ;

            String q = "CREATE TABLE CheckScholer(Name varchar(30) ,Father varchar(30),Course varchar(40),Branch varchar(10),Roll10 varchar(30),Percentage10 varchar(30),Percentage12 varchar(20))" ;

            Statement stmt = conn.createStatement();
            stmt.execute(q);
            System.out.println("Your table is create in this Database");
            return conn;

        } catch (Exception e) {
                        System.out.println(e);
                    }
        return null;
                }
            }
