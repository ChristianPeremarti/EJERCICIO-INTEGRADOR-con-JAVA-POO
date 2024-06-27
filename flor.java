public class flor extends planta{
    
    private String colorPetalos;
    private int cantPetalos;
    private String colorPistilo;
    private String variedad;
    private String estacion;


    public flor() {
    }


    public flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos,
            int cantPetalos, String colorPistilo, String variedad, String estacion) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistilo = colorPistilo;
        this.variedad = variedad;
        this.estacion = estacion;
    }




    public String getColorPetalos() {
        return colorPetalos;
    }


    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }


    public int getCantPetalos() {
        return cantPetalos;
    }


    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }


    public String getColorPistilo() {
        return colorPistilo;
    }


    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }


    public String getVariedad() {
        return variedad;
    }


    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }


    public String getEstacion() {
        return estacion;
    }


    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }


    @Override
    public void decirLoQueSoy() {

        System.out.println("hola, soy una flor");
    }
}
