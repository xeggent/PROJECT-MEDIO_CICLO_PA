/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

public class IVA {
    
    private Double precio;
    
    
    public IVA(Double precio) {
        this.precio = precio;
       
    }
   
    public Double calcular_iva() {
        double iva;
        iva = precio * 0.12; // Tasa de IVA en Ecuador es del 12%
        return iva;
    }
    }

