import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;



public class Requerimiento2 extends JFrame {

    public Requerimiento2() throws SQLException{
        initUI();
            }
            public void initUI() throws SQLException{
                setLayout(new BorderLayout());
                String[] nombres = {"ID_Pregunta", "Nivel", "Enunciado", "Resc", "Resi1","Resi2","Resi3"};
                JTable tabla1 = new JTable(mostrar2(), nombres);
                JScrollPane Panel = new JScrollPane(tabla1);
                add(Panel, BorderLayout.CENTER);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(400, 500);
                setLocationRelativeTo(null);
                setVisible(true);
        
    }
    

    
    public String[][] mostrar2() throws SQLException{
        ArrayList<Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento2();
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


