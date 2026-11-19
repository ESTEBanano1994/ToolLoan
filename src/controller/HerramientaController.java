
package controller;
        
        
public class HerramientaController {
    
    private int id_prestamo = 12;
    private String nombre_estudiante = "Juan";
    private double fecha_prestamo = 12;
    private double id_tipo = 1;
    
    
    if (int id_tipo = 12;) {
    
        System.out.println("Se realizo el retiro de una herramienta electrica");
            
    }else if (int id_prestamo = 2;){
    
        System.out.println("Se realizo el retiro de una herramienta de medicion");
        
    }else{
    
        System.out.println("Se realizo el retiro de una herramienta manual");
    
    }
    
    
    public HerramientaController(int id_prestamo, String nombre_estudiante, double fecha_prestamo, double id_tipo) {
        
      this.id_prestamo = id_prestamo;
      this.nombre_estudiante = nombre_estudiante;
      this.fecha_prestamo = fecha_prestamo;
      this.id_tipo = id_tipo;
         }
        
    
    
      

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public void setFecha_prestamo(double fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setId_tipo(double id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public double getFecha_prestamo() {
        return fecha_prestamo;
    }

    public double getId_tipo() {
        return id_tipo;
    }
}
