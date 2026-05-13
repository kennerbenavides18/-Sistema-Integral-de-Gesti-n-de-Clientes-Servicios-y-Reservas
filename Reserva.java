public class Reserva {

    private Cliente cliente;
    private Servicio servicio;
    private int horas;

    public Reserva(Cliente cliente, Servicio servicio, int horas)
            throws ExcepcionReserva {

        if(horas <= 0){
            throw new ExcepcionReserva("Horas inválidas");
        }

        this.cliente = cliente;
        this.servicio = servicio;
        this.horas = horas;
    }

    public void mostrarReserva(){

        System.out.println("Cliente: " + cliente.getNombre());

        System.out.println("Costo: $" +
                servicio.calcularCosto(horas));
    }
}
