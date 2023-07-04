/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class control_articulos {
    
    
    Sentencias_sql sensql;
   
    public control_articulos() {
        
        sensql = new Sentencias_sql();
    }

    
    /**
     *
     * @param Date
     */
    
   public boolean ingresar_articulo(String id, String descripcion, int precioventa, int preciocosto, int stock, String tipoart, String fechaingreso) {
    String datos[] = {id, descripcion, Integer.toString(precioventa), Integer.toString(preciocosto), Integer.toString(stock), tipoart, fechaingreso};
    return sensql.insertar(datos, "INSERT INTO articulo(id_articulo, descripcion, precio_venta, precio_costo, stock, cod_tipo_articulo,  fecha_ingreso) VALUES (?, ?, ?, ?, ?, (SELECT cod_tipo_articulo FROM tipo_articulo WHERE descripcion_articulo = ?), ?)");
}

public Object[][] consulta_articulos() {
    String[] columnas = {"id_articulo", "descripcion", "precio_venta", "precio_costo", "stock", "fecha_ingreso"};
    Object[][] datos = sensql.GetTabla(columnas, "articulo", "SELECT id_articulo, descripcion, precio_venta, precio_costo, stock, fecha_ingreso FROM articulo;");
    return datos;
}
}