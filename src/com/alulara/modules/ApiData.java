package com.alulara.modules;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Map;

public class ApiData {
    public JsonObject selectData(JsonObject json, String data){
        try {
            return  json.get(data).getAsJsonObject();
        }catch (Exception e){
        return JsonParser.parseString("Error: No found").getAsJsonObject();
        }
    }

    public Map toMap(JsonObject json){
        return json.asMap();
    }


}
