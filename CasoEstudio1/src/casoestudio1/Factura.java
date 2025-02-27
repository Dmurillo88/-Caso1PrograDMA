/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dfdf
 */
public class Factura {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getIndauto() {
        return indauto;
    }

    public void setIndauto(String indauto) {
        this.indauto = indauto;
    }

    public String getIndelec() {
        return indelec;
    }

    public void setIndelec(String indelec) {
        this.indelec = indelec;
    }

    public String getIndconstru() {
        return indconstru;
    }

    public void setIndconstru(String indconstru) {
        this.indconstru = indconstru;
    }
 
    private String nombre=JOptionPane.showInputDialog(null,"Entre Nombre");
    private String cedula=JOptionPane.showInputDialog(null,"Entre cedula");
    private String monto=JOptionPane.showInputDialog(null,"Entre monto de venta");
    private String codigo=JOptionPane.showInputDialog(null,"Entre código");
    private String mes=JOptionPane.showInputDialog(null,"Entre mes de 1-12");
    private String indauto=JOptionPane.showInputDialog(null,"Cuantos productos de automóvil?");
    private String indelec=JOptionPane.showInputDialog(null,"Cuantos productos eléctricos?");
    private String indconstru=JOptionPane.showInputDialog(null,"Cuantos productos de construcción?");
            
}