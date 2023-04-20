package MetodosDAO;
import Conexion.ConexionGYM;
import MetodosVO.UsuariosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDAO {
    private final ConexionGYM CON;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public UsuariosDAO() {
        CON = ConexionGYM.getInstacia();
    }
    public void insertarA(String Usuario,String Contrasena ){
        try{
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql = "insert into Admin values('"+Usuario+"','"+Contrasena+"')";
            st.execute(sql);
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "Usuario registrado.");
        }catch(Exception e){
            System.out.println("Error al insertar");
        }
    }
    public void actualizarA(String Contrasena, String Usuario) {
        try {
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql = "update Admin set Contrasena='"+Contrasena+"' where Usuario='"+Usuario+"';";
            st.executeUpdate(sql);
            st.close();
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "Contrasena actualizada", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminarA(String Usuario){
        try {
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql="delete from Admin where Usuario='"+Usuario+"'; ";
            st.executeUpdate(sql);
            st.close();
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario "+ e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
   
}