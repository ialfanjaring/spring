package org.iesch.ad.ejemploExcepciones.exceptions;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException (String s){
        super(s);
    }
}
