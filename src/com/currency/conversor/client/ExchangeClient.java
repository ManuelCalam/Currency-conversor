package com.currency.conversor.client;

import com.currency.conversor.models.CurrencyRecord;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeClient {
    private String url = "https://v6.exchangerate-api.com/v6/febfbc2f3940eaca892fca4e/pair/";
    Gson gson = new Gson();

    public CurrencyRecord requestExchage(){

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            CurrencyRecord currencyRecord = gson.fromJson(response.body(), CurrencyRecord.class);



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
