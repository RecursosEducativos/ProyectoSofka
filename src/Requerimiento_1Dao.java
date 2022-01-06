import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.util.ArrayList;

public class Requerimiento_1Dao {   

    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_1> requerimiento1()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta ="select *from preguntas";
            
            
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resulset = statement.executeQuery();
            while(resulset.next()){

                Requerimiento_1 requerimiento_1 = new Requerimiento_1();
                requerimiento_1.setID_Pregunta(resulset.getInt("id_pregunta"));
                requerimiento_1.setNivel(resulset.getInt("nivel"));
                requerimiento_1.setEnunciado(resulset.getString("enunciado"));
                requerimiento_1.setResc(resulset.getString("resc"));
                requerimiento_1.setResi1(resulset.getString("resi1"));
                requerimiento_1.setResi2(resulset.getString("resi2"));
                requerimiento_1.setResi3(resulset.getString("resi3"));
                respuesta.add(requerimiento_1);

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
