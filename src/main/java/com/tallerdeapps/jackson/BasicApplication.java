package com.tallerdeapps.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tallerdeapps.jackson.pojo.DatosRegistroEmpleado;
import com.tallerdeapps.jackson.pojo.Empleado;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
        System.out.println("*** AQUI COMIENZA: com.example.BasicApplication.main()");

        try {
            //COMO OBTENER DATOS JSON CON POJO:
            // crear un objeto mapper
            ObjectMapper miMapper = new ObjectMapper();
            // leer el JSON y convertirlo a POJO
            Empleado miEmpleado = miMapper.readValue(new File("data/datos_empleados.json"), Empleado.class);
            // Ver información
            System.out.println("Nombre: " + miEmpleado.getNombre());
            System.out.println("Apellido: " + miEmpleado.getApellido());
            for (String idioma: miEmpleado.getIdiomas()){
              System.out.println("Idioma: " + idioma);  
            }
            
            DatosRegistroEmpleado miDatosRegistroEmpleado = miEmpleado.getDatos_registro();
            System.out.println("Domicilio: " + miDatosRegistroEmpleado.getDomicilio());
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(BasicApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
