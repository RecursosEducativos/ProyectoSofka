
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;




public class Requerimiento6 extends JFrame {

    public Requerimiento6() throws SQLException{
      
            }
            
    public String[][] mostrar5() throws SQLException{
        ArrayList<Requerimiento_6> lista = new ArrayList<Requerimiento_6>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento6();
        String matriz[][]= new String [lista.size()][7];
        for (int i = 0; i< lista.size(); i++){
            matriz[i][0] = String.valueOf(lista.get(i).getID_Pregunta());
            matriz[i][1] = String.valueOf(lista.get(i).getNivel());
            matriz[i][2] = lista.get(i).getEnunciado();
            matriz[i][3] = lista.get(i).getResc();
            matriz[i][4] = lista.get(i).getResi1();
            matriz[i][5] = lista.get(i).getResi2();
            matriz[i][6] = lista.get(i).getResi3();
        }
        return matriz;
    }
}
