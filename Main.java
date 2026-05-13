public class Main {

    public static void main(String[] args) {

        try {

            Cliente c1 =
                    new Cliente("Juan", "123");

            Servicio s1 = new ReservaSala();
            Servicio s2 = new ReservaEquipos();
            Servicio s3 = new ReservaAsesoria();

            Reserva r1 =
                    new Reserva(c1, s1, 2);

            Reserva r2 =
                    new Reserva(c1, s2, 3);

            Reserva r3 =
                    new Reserva(c1, s3, 1);

            r1.mostrarReserva();
            r2.mostrarReserva();
            r3.mostrarReserva();

            // error intencional
            Reserva r4 =
                    new Reserva(c1, s1, -1);

        } catch(Exception e){

            LoggerSistema.registrar(
                    e.getMessage());

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}
