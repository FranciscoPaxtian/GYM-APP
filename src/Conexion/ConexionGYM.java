package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionGYM {
    
    Connection conex;
    Statement stmt = null;
    public boolean b;
    private Connection conn;
    public static ConexionGYM instancia;
    private PreparedStatement ps;

    ConexionGYM() {

        this.conn = null;
    }

    public Connection conectar() {

        try {

            Class.forName("org.postgresql.Driver");

            this.conex = DriverManager.getConnection("jdbc:postgresql://localhost/gym","postgres","paxtian1606");

        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);

        }
        return this.conex;

    }
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public synchronized static ConexionGYM getInstacia() {
        if (instancia == null) {
            instancia = new ConexionGYM();
        }
        return instancia;
    }
    public void desconectar() {
        try {
            this.conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
