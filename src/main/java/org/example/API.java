package org.example;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class API {
    static JSONArray apiRequest(String urlStr) throws IOException {
        InputStream is = new URL(urlStr).openStream();
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            int cp;
            while ((cp = br.read()) != -1) {
                sb.append((char) cp);
            }
        } finally {
            is.close();
        }
        return new JSONArray(sb.toString());
    }
}
