package eee_Login;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mysqL {

    private static String serverName = "sql7.freesqldatabase.com";
    private static String kadi = "sql7348423";
    private static String dbname = "sql7348423";
    private static Integer  portnumber = 3306;
 private static String sifre = "gdTSqbCMM6";

    public static Connection getConnection() {
        Connection cnc = null;
        MysqlDataSource datasource = new MysqlDataSource();


        datasource.setServerName(serverName);
        datasource.setUser(kadi);
        datasource.setPassword(sifre);
         datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
      datasource.setUseUnicode(true);
        datasource.setCharacterEncoding("UTF-8");
       // datasource.setURL("jdbc:mysql://localhost:3306/eee?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey");

        try {
            cnc = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " + mysqL.class.getName()).log(Level.SEVERE, null, ex);
        }

         return cnc;
    }

}
