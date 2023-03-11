import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String dbURL = "jdbc:oracle:thin:@localhost:1521:orcl";
        conn= DriverManager.getConnection(dbURL, "c##gejiaqi", "qieerxi2015");

        System.out.println("数据库连接成功！");

        Statement statement = conn.createStatement();

        // Execute the SELECT statement
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
        while(resultSet.next()){
            String a=resultSet.getString("SNO");
            System.out.println(a);
            String b=resultSet.getString("sname");
            System.out.println(b);
            int c=resultSet.getInt("sage");
            System.out.println(c);
            String d=resultSet.getString("ssex");
            System.out.println(d);
        }

//
//        while (resultSet.next()) {
//            String column1 = resultSet.getString("column1");
//            int column2 = resultSet.getInt("column2");
//            System.out.println(column1 + ", " + column2);
//        }
//        student student=new student("zhangsan",15,'m');
//        System.out.println(student._age);
//        System.out.println(student._gender);
//        System.out.println(student._name);
    }
}
