package com.tallerdeapps.jackson.pojo;

/**
*
 */
public class DatosRegistroEmpleado {
    
    private String domicilio;
    private String ciudad;
    private String cpostal;
    private String pais;

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCpostal() {
        return cpostal;
    }

    public void setCpostal(String cpostal) {
        this.cpostal = cpostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechadealta() {
        return fechadealta;
    }

    public void setFechadealta(String fechadealta) {
        this.fechadealta = fechadealta;
    }
    private String fechadealta;
    
    
}
