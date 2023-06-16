import javax.swing.JOptionPane;

public class Principal {

    Flecha flecha;

    public static void main(String[] args) {
        Principal miPrincipal = new Principal();
        miPrincipal.crearFlecha();
        miPrincipal.imprimirFlecha();
    }

    public void crearFlecha() {
        String inputLongitud = JOptionPane.showInputDialog(null, "Ingrese la longitud de la flecha:");
        int longitud = Integer.parseInt(inputLongitud);

        flecha = new Flecha(longitud, "negro");
    }

    public void imprimirFlecha() {
        flecha.construirFlecha();
        flecha.imprimirEspacio();
    }
}
