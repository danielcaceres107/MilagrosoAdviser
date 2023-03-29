package com.example.milagrosoadviser;

import java.util.ArrayList;
import java.util.List;

    public class MeasureExpert {
        List<String> getMeasures(String tipo){
            List<String> measures = new ArrayList<>();
            if (tipo.equals("Hipertension")){
                measures.add("Presion arterial");
            }if (tipo.equals("Diabetes")){
                measures.add("Glucosa");
                measures.add("Agudeza visual");
            }if (tipo.equals("Insuficiencia Cardiaca")){
                measures.add("Frecuancia Cardiaca");
            }
            return measures;
        }
}
