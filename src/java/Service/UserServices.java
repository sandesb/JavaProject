package Service;
import DBController.DBconnection;
import Model.login;
import Model.signup;
import Model.video;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kedar on 3/30/2021.
 */
public class UserServices {

    public signup getUser(String username, String password) {

        signup user = null;
        String query = "select * from signup where email=? and password=?";

        PreparedStatement pstm = new DBconnection().getStatement(query);

        try {
            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                user = new signup();
                user.setId(rs.getInt("id"));
                user.setFullname(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                System.out.println(user.getFullname() + " " + user.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
     public void insertUser(login login) {
        String query = "insert into user (email,password)" +
                "values(?,?)";
        PreparedStatement pstm = new DBconnection().getStatement(query);
        try {
            pstm.setString(1, login.getFullName());
            pstm.setString(2, login.getPassword());
            System.out.println(pstm);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      public void insertUser(signup signup) {
        String query = "insert into signup (fullname,email,password)" +
                "values(?,?,?)";
        PreparedStatement pstm = new DBconnection().getStatement(query);
        try {
            pstm.setString(1, signup.getFullname()); /*getter setter ko constructor*/
            pstm.setString(2, signup.getEmail());
            pstm.setString(3, signup.getPassword());
            System.out.println(pstm);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//      video try
       public void insertUser(video video) {
        String query = "insert into movie (movie_desc,thumbnail,video)" +
                "values(?,?,?)";
        PreparedStatement pstm = new DBconnection().getStatement(query);
        try {
            pstm.setString(1, video.getMovie_desc());
            pstm.setString(2, video.getThumbnail()); /*getter setter ko constructor*/
            pstm.setString(3, video.getVideo()); /*getter setter ko constructor*/
/*getter setter ko constructor*/
           
            System.out.println(pstm);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      public void editUser(String id, signup editUser) {
//                   even though the variable is id, in query email is from the cookie, so its written
        String query = "update signup set fullname=?, password=? where email='" + id+"';"; 
        PreparedStatement pstm = new DBconnection().getStatement(query);
        try {
            pstm.setString(1, editUser.getFullname()); /*getter setter ko constructor*/
            pstm.setString(2, editUser.getPassword());
            System.out.println(pstm);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
