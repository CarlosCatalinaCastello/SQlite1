package carloscatalina.example.sqlite1.modelos;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "productos")
public class Producto {
    @DatabaseField(columnName = "id_producto", generatedId = true)
    private int id;
    @DatabaseField(columnName = "nombre", canBeNull = false)
    private String nombre;
    @DatabaseField(canBeNull = false)
    private int cantidad;
    @DatabaseField(canBeNull = false)
    private double precio;
    @DatabaseField(columnName = "total_producto", canBeNull = false)
    private double total;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, double precio, double total) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", total=" + total +
                '}';
    }
}
