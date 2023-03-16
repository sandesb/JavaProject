

package Service;
import DBController.DBconnection;
import Model.fav;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kedar on 3/30/2021.
 */
public class FavServices {


     public void insertFav(fav fav) {
        String query = "insert into fav(fname)" +
                "values(?)";
        PreparedStatement pstm = new DBconnection().getStatement(query);
        try {
            pstm.setString(1, fav.getFav());
          
            System.out.println(pstm);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
