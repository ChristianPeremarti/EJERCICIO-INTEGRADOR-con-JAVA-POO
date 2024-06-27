public class arbusto extends planta{

    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private boolean sePodaONo;


    public arbusto() {
    }

    public arbusto(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, double ancho,
            boolean esDomestico, String variedad, String colorHojas, boolean sePodaONo) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return this.esDomestico;
    }

    public boolean getEsDomestico() {
        return this.esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return this.variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return this.colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONo() {
        return this.sePodaONo;
    }

    public boolean getSePodaONo() {
        return this.sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("hola, soy un arbusto");
    }
    

}
