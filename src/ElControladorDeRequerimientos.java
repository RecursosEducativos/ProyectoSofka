import java.sql.SQLException;
import java.util.ArrayList;

public class ElControladorDeRequerimientos {
    
    private final Requerimiento_1Dao REQUERIMIENTO_1DAO;
    private final Requerimiento_2Dao REQUERIMIENTO_2DAO;
    private final Requerimiento_3Dao REQUERIMIENTO_3DAO;
    private final Requerimiento_4Dao REQUERIMIENTO_4DAO;
    private final Requerimiento_5Dao REQUERIMIENTO_5DAO;
    private final Requerimiento_6Dao REQUERIMIENTO_6DAO;

    public ElControladorDeRequerimientos(){
        this.REQUERIMIENTO_1DAO= new Requerimiento_1Dao();
        this.REQUERIMIENTO_2DAO= new Requerimiento_2Dao();
        this.REQUERIMIENTO_3DAO= new Requerimiento_3Dao();
        this.REQUERIMIENTO_4DAO= new Requerimiento_4Dao();
        this.REQUERIMIENTO_5DAO= new Requerimiento_5Dao();
        this.REQUERIMIENTO_6DAO= new Requerimiento_6Dao();
    }
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código
            
            return this.REQUERIMIENTO_1DAO.requerimiento1();
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
           
            return this.REQUERIMIENTO_2DAO.requerimiento2();
        }
      
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código}
           
            return this.REQUERIMIENTO_3DAO.requerimiento3();
        } 

        public ArrayList<Requerimiento_4> consultarRequerimiento4() throws SQLException {
            // Su código}
           
            return this.REQUERIMIENTO_4DAO.requerimiento4();
        } 
        public ArrayList<Requerimiento_5> consultarRequerimiento5() throws SQLException {
            // Su código}
           
            return this.REQUERIMIENTO_5DAO.requerimiento5();
        } 
        public ArrayList<Requerimiento_6> consultarRequerimiento6() throws SQLException {
            // Su código}
           
            return this.REQUERIMIENTO_6DAO.requerimiento6();
        } 

}
