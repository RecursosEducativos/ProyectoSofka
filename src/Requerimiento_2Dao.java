import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_2Dao {   

    //Obtener las preguntas del nivel 2
    public ArrayList<Requerimiento_2> requerimiento2()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta ="select *from preguntas WHERE nivel == 2";
            
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_2 Requerimiento_2 = new Requerimiento_2();
                Requerimiento_2.setID_Pregunta(resulset.getInt("id_pregunta"));
                Requerimiento_2.setNivel(resulset.getInt("nivel"));
                Requerimiento_2.setEnunciado(resulset.getString("enunciado"));
                Requerimiento_2.setResc(resulset.getString("resc"));
                Requerimiento_2.setResi1(resulset.getString("resi1"));
                Requerimiento_2.setResi2(resulset.getString("resi2"));
                Requerimiento_2.setResi3(resulset.getString("resi3"));
                respuesta.add(Requerimiento_2);

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