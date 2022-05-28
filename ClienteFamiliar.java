import java.math.BigInteger;

public class ClienteFamiliar extends Cliente implements GastosConsumo {
  // ATRIBUTOS
  private String nombre;
  private BigInteger cedula;
  private String direccion;
  private Integer metrosConsumidos;

  public ClienteFamiliar(String nombre, String direccion, BigInteger cedula, Integer metrosConsumidos) {
    super(nombre, direccion, metrosConsumidos);

    // DEFINIR ATRIBUTOS DE LA INSTANCIA DE CLIENTE FAMILIAR
    this.nombre = super.getNombre();
    this.cedula = cedula;
    this.direccion = super.getDireccion();
    this.metrosConsumidos = super.getMetrosConsumidos();
  }

  public double calcularConsumo() {
    
    // Cargo fijo familia + metros * 100 (si es menor igual a 10)
    // • Lo anterior más diferencia en mayor que 10 * 120
    // • Lo anterior más diferencia en mayor que 20 * 135
    double consumo = 0;
    
    // NO ESTAMOS SEGUROS DE HABER HECHO LA CORRECTA INTERPRETACIÓN DE LA LETRA
    // Lo importante es el intento 😇
    
    if (metrosConsumidos <= 10) {
      consumo = CARGOFIJOFLIA + metrosConsumidos * 100;
    }
    
    if (metrosConsumidos > 10 && metrosConsumidos <= 20) {
      consumo = CARGOFIJOFLIA + metrosConsumidos * 120;
    }
    
    if (metrosConsumidos > 20) {
      consumo = (CARGOFIJOFLIA + metrosConsumidos * 135);
    }
    
    return consumo;
  }

  @Override
  public String toString() {
    // METODO toString DE LA CLASE CLIENTE
    return "[nombre: " + this.nombre + ", direccion: " + this.direccion + ", cedula: " + this.cedula
        + ", metrosConsumidos: "
        + this.metrosConsumidos + "]";
  }

}