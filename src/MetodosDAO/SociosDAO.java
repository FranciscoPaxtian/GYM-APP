package MetodosDAO;
import Conexion.ConexionGYM;
import MetodosVO.SociosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class SociosDAO {
    private final ConexionGYM CON;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public SociosDAO() {
        CON = ConexionGYM.getInstacia();
    }
    public void insertarA(String id_socio, String nombre, String apellido, String genero, String edad, String telefono, String email){
        try{
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql = "insert into socios values('"+id_socio+"','"+nombre+"','"+apellido+"','"+genero+"','"+edad+"','"+telefono+"','"+email+"')";
            st.execute(sql);
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "Socio registrado.");
        }catch(Exception e){
            System.out.println("Error al insertar");
        }
    }
    public void actualizarA(String nombre, String apellido, String genero, String edad, String telefono, String email, String id_socio) {
        try {
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql = "update socios set nombre='"+nombre+"',apellido='"+apellido+"',genero ='"+genero+"',edad='"+edad+"',telefono='"+telefono+"',email='"+email+"' where id_socio='"+id_socio+"';";
            st.executeUpdate(sql);
            st.close();
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminarA(String id_socio){
        try {
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql="delete from socios where id_socio='"+id_socio+"'; ";
            st.executeUpdate(sql);
            st.close();
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "Socio eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro "+ e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
   
}