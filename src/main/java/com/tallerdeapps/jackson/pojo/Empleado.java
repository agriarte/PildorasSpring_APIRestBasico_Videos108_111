package com.tallerdeapps.jackson.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 */
// Sin la propiedad, daría error si en el archivo JSON hay alguna propiedad que no se usa en el POJO.
// En caso de que todas las propiedades existan en el POJO, no es estrictamente necesario.
@JsonIgnoreProperties(ignoreUnknown = true)
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private boolean activo;
    private String[] idiomas;
    private DatosRegistroEmpleado datos_registro;

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public DatosRegistroEmpleado getDatos_registro() {
        return datos_registro;
    }

    public void setDatos_registro(DatosRegistroEmpleado datos_registro) {
        this.datos_registro = datos_registro;
    }
    
    
}
