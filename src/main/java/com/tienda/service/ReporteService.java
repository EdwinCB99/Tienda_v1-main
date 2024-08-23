package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {

    public ResponseEntity<Resource>
            generaReporte(String reporte,//El nombre del reporte (usuarios.jasper)
                    Map<String, Object> parametros, //Los parametros son el username,....
                    String tipo) throws IOException;// cual es el tipo de reporte que quiere el usuario (pdf, xlsx, csv)
}
