import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_5Dao {   

    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_5> requerimiento5()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_5> respuesta = new ArrayList<Requerimiento_5>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta ="select *from preguntas WHERE nivel == 5";
            
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_5 requerimiento_5 = new Requerimiento_5();
                requerimiento_5.setID_Pregunta(resulset.getInt("id_pregunta"));
                requerimiento_5.setNivel(resulset.getInt("nivel"));
                requerimiento_5.setEnunciado(resulset.getString("enunciado"));
                requerimiento_5.setResc(resulset.getString("resc"));
                requerimiento_5.setResi1(resulset.getString("resi1"));
                requerimiento_5.setResi2(resulset.getString("resi2"));
                requerimiento_5.setResi2(resulset.getString("resi2"));
                respuesta.add(requerimiento_5);

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