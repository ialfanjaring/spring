package org.iesch.ad.ejemploExcepciones.config;

import org.iesch.ad.ejemploExcepciones.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configuracion {
    @Bean
    List<Usuario> usuarios(){
        List <Usuario> usuarios = new ArrayList<>();
        usuarios.add(Usuario.builder().id(1).nombre("Juanma").apellidos("Moreno").build());
        usuarios.add(Usuario.builder().id(2).nombre("Pepe").apellidos("Perez Tregon").build());
        usuarios.add(Usuario.builder().id(3).nombre("Marcos").apellidos("Remon Martinez").build());
        usuarios.add(Usuario.builder().id(4).nombre("Mariano").apellidos("De los Juanes").build());
        return usuarios;
    }

}
