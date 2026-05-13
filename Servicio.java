public abstract class Servicio {

    protected String nombre;

    public Servicio(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularCosto(int horas);
}
