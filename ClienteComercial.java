import java.math.BigInteger;

public class ClienteComercial extends Cliente implements GastosConsumo {
  // ATRIBUTOS
  public String nombre;
  public String direccion;
  public Integer metrosConsumidos;
  private BigInteger rut;

  public ClienteComercial (String nombre, String direccion, BigInteger rut, Integer metrosConsumidos) {
    super(nombre, direccion, metrosConsumidos);

    // DEFINIR ATRIBUTOS DE LA INSTANCIA DE CLIENTE COMERCIAL
    this.nombre = super.getNombre();
    this.direccion = super.getDireccion();
    this.metrosConsumidos = super.getMetrosConsumidos();
    this.rut = rut;
  }

  public double calcularConsumo() {
    double consumo = 0;

    // DEFINIR CÁLCULO DE CONSUMO
    if (metrosConsumidos <= 10) {
      consumo = CARGOFIJOFLIA + metrosConsumidos * 130;
    }

    if (metrosConsumidos > 10 && metrosConsumidos <= 20) {
      consumo = CARGOFIJOFLIA + metrosConsumidos * 150;
    }

    if (metrosConsumidos > 20) {
      consumo = (CARGOFIJOFLIA + metrosConsumidos * 160);
    }

    return consumo;
  }

  @Override
  public String toString() {
    // METODO toString DE LA CLASE CLIENTE
    return "[nombre: " + this.nombre + ", direccion: " + this.direccion + ", rut: " + this.rut
        + ", metrosConsumidos: "
        + this.metrosConsumidos + "]";
  }
}
