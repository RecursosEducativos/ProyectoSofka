import java.util.ArrayList;

public class VistaRequerimientos {

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public static void requerimiento1(){
        
        try {
            // Su código
            ArrayList<Requerimiento_1>lista1 = controlador.consultarRequerimiento1();
            for(Requerimiento_1 reque : lista1) {
                System.out.printf("%s %s %s %s %n",
                reque.getID_Pregunta(),
                reque.getNivel(),
                reque.getEnunciado(),
                reque.getResc(),
                reque.getResi1(),
                reque.getResi2(),
                reque.getResi3());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){
        
        try {
            // Su código
            ArrayList<Requerimiento_2>lista2 = controlador.consultarRequerimiento2();
            for(Requerimiento_2 reque : lista2) {
                System.out.printf("%d %d %s %s %s %s %n",
                reque.getID_Pregunta(),
                reque.getNivel(),
                reque.getEnunciado(),
                reque.getResc(),
                reque.getResi1(),
                reque.getResi2(),
                reque.getResi3());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){
        
        try {
            // Su código
            ArrayList<Requerimiento_3>lista3 = controlador.consultarRequerimiento3();
            for(Requerimiento_3 reque : lista3) {
                System.out.printf("%d %d %s %s %s %s %n",
                reque.getID_Pregunta(),
                reque.getNivel(),
                reque.getEnunciado(),
                reque.getResc(),
                reque.getResi1(),
                reque.getResi2(),
                reque.getResi3());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void Requerimiento4(){
        
        try {
            // Su código
            ArrayList<Requerimiento_4>lista4 = controlador.consultarRequerimiento4();
            for(Requerimiento_4 reque : lista4) {
                System.out.printf("%d %d %s %s %s %s %n",
                reque.getID_Pregunta(),
                reque.getNivel(),
                reque.getEnunciado(),
                reque.getResc(),
                reque.getResi1(),
                reque.getResi2(),
                reque.getResi3());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
    public static void Requerimiento5(){
        
        try {
            // Su código
            ArrayList<Requerimiento_5>lista5 = controlador.consultarRequerimiento5();
            for(Requerimiento_5 reque : lista5) {
                System.out.printf("%d %d %s %s %s %s %n",
                reque.getID_Pregunta(),
                reque.getNivel(),
                reque.getEnunciado(),
                reque.getResc(),
                reque.getResi1(),
                reque.getResi2(),
                reque.getResi3());

            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    
}