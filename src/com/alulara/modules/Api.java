package com.alulara.modules;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Api {
    private Gson gson = new Gson();
    public JsonObject conectionApi() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/05ceaf62bad8e0552ef87fc9/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject monedas = JsonParser.parseString(response.body()).getAsJsonObject();
        System.out.println(monedas.get("conversion_rates"));
        return monedas;
    }
}
