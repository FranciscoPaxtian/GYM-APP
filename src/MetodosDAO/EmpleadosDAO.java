package MetodosDAO;
import Conexion.ConexionGYM;
import MetodosVO.EmpleadosVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class EmpleadosDAO {
    private final ConexionGYM CON;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public EmpleadosDAO() {
        CON = ConexionGYM.getInstacia();
    }
    public void insertarA(String id_empleado, String nombre, String apellido, String genero, String edad, String ocupacion, String telefono, String rfc, String direccion){
        try{
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql = "insert into empleado values('"+id_empleado+"','"+nombre+"','"+apellido+"','"+genero+"','"+edad+"','"+ocupacion+"','"+telefono+"','"+rfc+"','"+direccion+"')";
            st.execute(sql);
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "Empleado registrado.");
        }catch(Exception e){
            System.out.println("Error al insertar");
        }
    }
    public void actualizarA(String id_empleado, String nombre, String apellido, String genero, String edad, String ocupacion, String telefono, String rfc, String direccion) {
        try {
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql = "update empleado set nombre='"+nombre+"',apellido='"+apellido+"',genero ='"+genero+"',edad='"+edad+"',ocupacion='"+ocupacion+"',telefono='"+telefono+"',rfc='"+rfc+"',direccion='"+direccion+"' where id_empleado='"+id_empleado+"';";
            st.executeUpdate(sql);
            st.close();
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminarA(String id_empleado){
        try {
            Connection ConexionGYM = CON.conectar();
            java.sql.Statement st=ConexionGYM.createStatement();
            String sql="delete from empleado where id_empleado='"+id_empleado+"'; ";
            st.executeUpdate(sql);
            st.close();
            ConexionGYM.close();
            JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente","Eliminado",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro "+ e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
   
}