package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.API.apiRequest;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> currency = Arrays.asList("EUR", "PLN", "USD");
        String request = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?&json";
        JSONArray jsonArray = apiRequest(request);

        Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy").create();
        List<FXrates> fXratesList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            fXratesList.add(gson.fromJson(jsonArray.get(i).toString(), FXrates.class));
        }
        fXratesList.stream().filter(c -> currency.contains(c.getCurrency())).forEach(System.out::println);
    }

}