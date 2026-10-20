public class AlertaSistema {

    private static final int PRIORIDAD_MINIMA = 1;
    private static final int PRIORIDAD_MAXIMA = 5;

    private static int contadorAlertas = 0;

    private final int identificador;
    private String descripcion;
    private int priodidad;


    public AlertaSistema(int identificador, String descripcion){
        if(identificador <= 0){
            System.out.println("El identificador debe ser positivo.");
        }
        if(descripcion == null || descripcion.trim().isEmpty()){
            System.out.println("La descripción no puede estar vacía.");
        }
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.priodidad = PRIORIDAD_MINIMA; // Nace siendo minima su prioridad
        contadorAlertas ++;
    }

    public int getIdentificador(){
        return identificador;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        if(descripcion != null && !descripcion.trim().isEmpty()){
            this.descripcion = descripcion;
        }
    }

    public int getPriodidad(){
        return priodidad;
    }

    public static int getContadorAlertas(){
        return contadorAlertas;
    }

    // ===== MÉTODOS UTILITARIOS =====

    public boolean aumentarPrioridad(){
        if(this.priodidad < PRIORIDAD_MAXIMA){
            this.priodidad ++;
            return true;
        }
        return false;
    }

    public boolean esUrgente(){
        return this.priodidad >= 4;
    }

}
