import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_6Dao {   

    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_6> requerimiento6()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_6> respuesta = new ArrayList<Requerimiento_6>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta ="select *from preguntas WHERE nivel == 1";
            
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_6 requerimiento_6 = new Requerimiento_6();
                requerimiento_6.setID_Pregunta(resulset.getInt("id_pregunta"));
                requerimiento_6.setNivel(resulset.getInt("nivel"));
                requerimiento_6.setEnunciado(resulset.getString("enunciado"));
                requerimiento_6.setResc(resulset.getString("resc"));
                requerimiento_6.setResi1(resulset.getString("resi1"));
                requerimiento_6.setResi2(resulset.getString("resi2"));
                requerimiento_6.setResi3(resulset.getString("resi3"));
                respuesta.add(requerimiento_6);

            }
            resulset.close();
            statement.close();
        }
        catch(SQLException e){
            System.err.println("Error consultado: "+ e);
        }
        finally{
            if(conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }

}