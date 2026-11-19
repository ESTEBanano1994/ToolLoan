
package controller;


public class TipoHerramientaController {
    
   
    private String electrica;
    private String medicion; 
    private String manual;
    
    
    
    public TipoHerramientaController(String electrica, String medicion, String manual) {
        
        this.electrica = "electrica";
        this.medicion = "medicion";
        this.manual = "manual";
        
        
    }

    public void setElectrica(String electrica) {
        this.electrica = electrica;
    }

    public void setMedicion(String medicion) {
        this.medicion = medicion;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public String getElectrica() {
        return electrica;
    }

    public String getMedicion() {
        return medicion;
    }

    public String getManual() {
        return manual;
    }
    
    
    
}
