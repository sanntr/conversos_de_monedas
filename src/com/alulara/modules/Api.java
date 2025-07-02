package com.alulara.modules;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.github.cdimascio.dotenv.Dotenv;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


public class Api {
    private Dotenv dotenv = Dotenv.configure()
            .directory("src/com/alulara/modules/")
            .load();
    private  String key=dotenv.get("API_KEY");

    public JsonElement conectionApi(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+key+"/latest/USD"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException  |InterruptedException e) {
            throw new RuntimeException(e);
        }
        return JsonParser.parseString(response.body()).getAsJsonObject();
    }

    public JsonElement codes(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+key+"/codes"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException  |InterruptedException e) {
            throw new RuntimeException(e);
        }

        return JsonParser.parseString(response.body()).getAsJsonObject();
    }






}
