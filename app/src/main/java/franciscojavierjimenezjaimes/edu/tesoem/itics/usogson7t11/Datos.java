package franciscojavierjimenezjaimes.edu.tesoem.itics.usogson7t11;

public class Datos {
    String Nombre;
    int Edad;
    String Correo;
    String Curp;

    public Datos(String nombre, int edad, String correo, String curp) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
        Curp = curp;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String curp) {
        Curp = curp;
    }
}
