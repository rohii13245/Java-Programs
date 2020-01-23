package sqlQueries;

import java.sql.*;
import java.io.*;
public class NewData {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {

        String s;
        String uname="root";
        String url="jdbc:mysql://localhost:3306/notes_app";

        String password="@sunshine12345";

        int i;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection con=DriverManager.getConnection(url,uname,password);

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select * from student_detail");

            if(rs.next()) {

                i=rs.getInt(1);

                s=rs.getString(2);

                System.out.println(i+"/t"+s);
            }

            rs.close();

            st.close();

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
