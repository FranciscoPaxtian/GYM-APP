package MetodosDAO;

import Conexion.ConexionGYM;
import MetodosVO.LogginVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LogginDAO extends LogginVO{
    private final ConexionGYM CON;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public LogginDAO() {
        CON = ConexionGYM.getInstacia();
    }
    public boolean validar(String sql) {
        
        
        try {
            ps=CON.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Consultado..." + e);
            return false;
        }
    }
    
    
}