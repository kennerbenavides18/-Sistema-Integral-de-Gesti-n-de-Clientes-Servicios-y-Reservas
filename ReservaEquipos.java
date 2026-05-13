public class ReservaEquipos extends Servicio {

    public ReservaEquipos() {
        super("Reserva Equipos");
    }

    @Override
    public double calcularCosto(int horas) {
        return horas * 30000;
    }
}
