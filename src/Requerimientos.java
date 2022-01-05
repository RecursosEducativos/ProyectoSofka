import java.sql.SQLException;
import java.util.ArrayList;



public class Requerimientos {

   
    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento1();
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

        public String[][] mostrar1() throws SQLException{
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

            public String[][] mostrar2() throws SQLException{
                ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
                ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
                lista = controlador.consultarRequerimiento3();
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
                public String[][] mostrar3() throws SQLException{
                    ArrayList<Requerimiento_4> lista = new ArrayList<Requerimiento_4>();
                    ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
                    lista = controlador.consultarRequerimiento4();
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
                    public String[][] mostrar4() throws SQLException{
                        ArrayList<Requerimiento_5> lista = new ArrayList<Requerimiento_5>();
                        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
                        lista = controlador.consultarRequerimiento5();
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
    
    

