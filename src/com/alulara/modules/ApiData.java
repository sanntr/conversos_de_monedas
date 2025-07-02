package com.alulara.modules;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Map;

public class ApiData {
    private  Api api = new Api();
    public JsonObject selectDataConvertion()  {
        JsonObject json = api.conectionApi().getAsJsonObject();
        try {
            return  json.get("conversion_rates").getAsJsonObject();
        }catch (Exception e){
        return JsonParser.parseString("Error: No found").getAsJsonObject();
        }
    }

    public JsonArray getCodes(){
        JsonObject jsonObject= ((JsonObject) api.codes());
        try {
            return jsonObject.get("supported_codes").getAsJsonArray();
        }catch (Exception e){
           return JsonParser.parseString("{\"error\":\"Not found\"}").getAsJsonArray();
        }
    }

    public Map toMap(JsonObject json){
        return json.asMap();
    }

}
