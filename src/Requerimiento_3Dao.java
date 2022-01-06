import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_3Dao {   

    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_3> requerimiento3()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta ="select *from preguntas WHERE nivel == 3";
            
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_3 requerimiento_3 = new Requerimiento_3();
                requerimiento_3.setID_Pregunta(resulset.getInt("id_pregunta"));
                requerimiento_3.setNivel(resulset.getInt("nivel"));
                requerimiento_3.setEnunciado(resulset.getString("enunciado"));
                requerimiento_3.setResc(resulset.getString("resc"));
                requerimiento_3.setResi1(resulset.getString("resi1"));
                requerimiento_3.setResi2(resulset.getString("resi2"));
                requerimiento_3.setResi3(resulset.getString("resi3"));
                respuesta.add(requerimiento_3);

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
