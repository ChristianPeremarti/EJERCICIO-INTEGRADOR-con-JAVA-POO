public class arbol extends planta{

    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    


    public arbol() {
    }


    public arbol(String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }
    



    @Override
    public void decirLoQueSoy() {
        System.out.println("hola, soy un árbol");
    }
    
}
