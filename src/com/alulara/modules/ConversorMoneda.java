package com.alulara.modules;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.Map;


public class ConversorMoneda {
    public  double Conversor(String moneda1, String moneda2, double valor){

        ApiData apiData = new ApiData();
       Map monedas= apiData.toMap(apiData.selectDataConvertion());
       if (monedas.containsKey(moneda1.toUpperCase()) && monedas.containsKey(moneda2.toUpperCase()) ){
           double valor1 = valor / conversData((JsonPrimitive) monedas.get(moneda1.toUpperCase()));

           return  valor1*conversData((JsonPrimitive) monedas.get(moneda2.toUpperCase()));
       }else {
           System.out.println("una de las monedas no existe");
           return 0;
       }

    }

    private double conversData(JsonPrimitive jsonPrimitive){
        return  Double.parseDouble(String.valueOf(JsonParser.parseString(String.valueOf(jsonPrimitive))));
    }

    public void listarMonedas(){
        ApiData apiData = new ApiData();
        for (Object object: apiData.getCodes()){
            System.out.println(object);
        }
    }
}
