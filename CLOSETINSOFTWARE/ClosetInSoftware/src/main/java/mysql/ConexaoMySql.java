package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoMySql {
    private static  String bancoDeDados = "closet_in_software";
            private static String jdbcUrl = "jdbc:mysql://localhost:3306/" + bancoDeDados;
            private static String usuario = "root";
            private static String senha = "evelyn2022M";

            public static Connection getConexao() {
                try {
                    return DriverManager.getConnection(jdbcUrl,usuario, senha);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return  null;
            }
}
