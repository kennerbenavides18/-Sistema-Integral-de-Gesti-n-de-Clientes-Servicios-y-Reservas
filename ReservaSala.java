public class ReservaSala extends Servicio {

    public ReservaSala() {
        super("Reserva Sala");
    }

    @Override
    public double calcularCosto(int horas) {
        return horas * 50000;
    }
}
