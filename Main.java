public class Main {
  public static void main(String[] args) {
    String relativePath = "RegistroConsumo.txt";

    // CREAR LISTA DE CONSUMOS A PARTIR DE UN TXT CON FORMATO
    ListaConsumos consumos = new ListaConsumos(relativePath);

    // ITERAR SOBRE LOS CONSUMOS E IMPRIMIR LOS MISMOS EN CONSOLA
    for (Cliente s : consumos.clientes) {
      System.out.println(s);
    }

  }
}
