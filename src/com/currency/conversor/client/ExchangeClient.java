package com.currency.conversor.client;

import com.currency.conversor.models.CurrencyRecord;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeClient {
    Gson gson = new Gson();
    HttpClient client = HttpClient.newHttpClient();

    public CurrencyRecord requestExchage(String base_code, String target_code, double amount){
        String url = "https://v6.exchangerate-api.com/v6/febfbc2f3940eaca892fca4e/pair/"+base_code+"/"+target_code+"/"+amount;
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            CurrencyRecord currencyRecord = gson.fromJson(response.body(), CurrencyRecord.class);

            return currencyRecord;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
