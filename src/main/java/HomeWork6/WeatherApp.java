package main.java.HomeWork6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class WeatherApp {

    private static final String API_KEY = "bxcly4A1pgT8Wg2Tca7MAc0lU1kAFQrj";
    private static final String HOST = "dataservice.accuweather.com";
    private static final String LOCATION_KEY = "474212_PC";
    private static final String FORECAST = "forecasts";
    //    private static final String LANGUAGE = "ru-ru";
//    private static final String METRIC = "true";
//    private static final String DETAILS = "false";
    private static final String DAILY = "daily";
    private static final String DAYS = "5day";
    private static final String V = "v1";

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http").host(HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(V)
                .addPathSegment(DAILY)
                .addPathSegments(DAYS)
                .addPathSegment(LOCATION_KEY)
                .addQueryParameter("apikey",API_KEY)
                .addQueryParameter("language","ru-ru")
                .addQueryParameter("metric","true")
                .build();
        Request request = new Request.Builder()
                .addHeader("accept","Application/Json")
                .url(url)
                .build();
        String JsR = client.newCall(request).execute().body().string();
        System.out.println(JsR);


    }
}
