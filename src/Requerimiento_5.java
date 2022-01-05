public class Requerimiento_5 {
    
    //aquí se coloca los campos con su respectiva asignacion 
    private Integer ID_Pregunta;
    private Integer Nivel;
    private String Enunciado;
    private String Resc;
    private String Resi1;
    private String Resi2;
    private String Resi3;

  //constructo
  public Requerimiento_5(){

      }  

    public Requerimiento_5(Integer id_pregunta, Integer nivel, String enunciado, String resc, String resi1, String resi2, String resi3 ){

        this.ID_Pregunta = id_pregunta;
        this.Nivel = nivel;
        this.Enunciado = enunciado;
        this.Resc = resc;
        this.Resi1 = resi1;
        this.Resi2 = resi2;
        this.Resi3 = resi3;
        //setID_Proyecto(ID_proyecto);
        //setCiudad(ciudad);
    }
    public void setID_Pregunta(Integer id_pregunta){
        ID_Pregunta = id_pregunta;
    
    }

    public Integer getID_Pregunta(){

        return ID_Pregunta;
    }

    public void setNivel(Integer nivel){
        Nivel = nivel;
    
    }

    public Integer getNivel(){

        return Nivel;
    }

    public void setEnunciado(String enunciado){
        Enunciado = enunciado;
    
    }
    public String getEnunciado(){

        return Enunciado;
    }

    public void setResc(String resc){
        Resc = resc;
    
    }
    public String getResc(){

        return Resc;
    }
    public void setResi1(String resi1){
        Resi1 = resi1;
    
    }
    public String getResi1(){

        return Resi1;
    }

    public void setResi2(String resi2){
        Resi2 = resi2;
    
    }
    public String getResi2(){

        return Resi2;
    }

    public void setResi3(String resi3){
        Resi3 = resi3;
    
    }
    public String getResi3(){

        return Resi3;
    }

    
    

}