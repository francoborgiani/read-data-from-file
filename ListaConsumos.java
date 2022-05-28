import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListaConsumos {
  ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public ListaConsumos(String filename) {
    cargarListaDeConsumos(filename);
  }

  public void cargarListaDeConsumos(String filename) {
    try {
      ArrayList<String> listaConsumos;
      // LEER TODAS LAS LINEAS DE UN TXT
      listaConsumos = new ArrayList<>(Files.readAllLines(Paths.get(filename)));

      // CARGA DE CONSUMO
      cargarConsumo(listaConsumos);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void cargarConsumo(ArrayList<String> listaConsumos) {
    // ITERACIÓN SOBRE CADA LINEA DEL TXT
    for (String linea : listaConsumos) {
      // SEPARAR CADA DATO DE UNA LÍNA EN CADA LUGAR QUE SE ENCUENTRE UNA ","

      String[] datos = linea.split(",");

      // DEFINICIÓN DEL CLIENTE
      Cliente cliente;

      switch (datos[0]) {
        // CASO CLIENTE COMERCIAL
        case "C":
        // INSTANCIA DE CLIENTE COMERCIAL 
          cliente = new ClienteComercial(datos[1], datos[2],
              BigInteger.valueOf(Long.parseLong(datos[3])), Integer.parseInt(datos[4]));

          // AGREGAR CLIENTE A LA LISTA DE CLIENTES
          clientes.add(cliente);
          break;

        // CASO CLIENTE FAMILIA
        case "F":
          // INSTANCIA DE CLIENTE FAMILIAR
          cliente = new ClienteFamiliar(
              datos[1], datos[2], BigInteger.valueOf(Long.parseLong(datos[3])), Integer.parseInt(datos[4]));
            
          // AGREGAR CLIENTE A LA LISTA DE CLIENTES
          clientes.add(cliente);
          break;
      }
    }
  }
}
