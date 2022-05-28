public class Cliente {
  private String nombre;
  private String direccion;
  private Integer metrosConsumidos;

  public Cliente(String nombre, String direccion, Integer metrosConsumidos) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.metrosConsumidos = metrosConsumidos;
  }

  // DIRECCION
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  // METROS CONSUMIDOS
  public Integer getMetrosConsumidos() {
    return metrosConsumidos;
  }
  public void setMetrosConsumidos(Integer metrosConsumidos) {
    this.metrosConsumidos = metrosConsumidos;
  }

  // NOMBRE
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // METODO toString
  @Override
  public String toString() {
    return "[nombre: " + nombre + ", direccion: " + direccion + ", metrosConsumidos: " + metrosConsumidos + "]";
  }
}
