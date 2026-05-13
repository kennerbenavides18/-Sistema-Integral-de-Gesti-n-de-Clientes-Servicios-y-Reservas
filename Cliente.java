public class Cliente {
    private String nombre;
    private String cedula;

    public Cliente(String nombre, String cedula) {

        if(nombre.isEmpty() || cedula.isEmpty()){
            throw new IllegalArgumentException("Datos inválidos");
        }

        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
}
