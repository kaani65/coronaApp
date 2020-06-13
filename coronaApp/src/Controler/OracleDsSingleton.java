package Controler;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class OracleDsSingleton {

        private static OracleDsSingleton dss = null;
        private static OracleDataSource ds = null;



        private OracleDsSingleton(){

                try {
                        ds = new OracleDataSource();

                        ds.setDataSourceName("HWROracleDataSource"); // Oracle DB HWR
                        ds.setURL("jdbc:oracle:thin:@//wi-dbora.hwr-berlin.de/dbk.hwr-berlin.de");

                        ds.setUser("oop2_ss20_g2_corona");
                        ds.setPassword("oop2_ss20_g2_corona");

                } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        }


        public static OracleDsSingleton getInstance() {
                if(dss == null) dss = new OracleDsSingleton();
                return dss;
        }

        public Connection getConnection() throws SQLException{
                Connection con = null;
                con = ds.getConnection();
                return con;
        }


}
