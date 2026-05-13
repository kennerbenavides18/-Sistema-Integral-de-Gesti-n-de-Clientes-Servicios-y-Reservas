public class ReservaAsesoria extends Servicio {

    public ReservaAsesoria() {
        super("Asesoría");
    }

    @Override
    public double calcularCosto(int horas) {
        return horas * 70000;
    }
}
