package org.iesch.ad.ejemploExcepciones.erroresDTO;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorDTO {
    private String message;
    private String error;
    private int Status;
    private Date date;
}
