package com.example.finnkinoproject;


import java.util.ArrayList;

public class TheatreStorage {
    private ArrayList<Theatre> theatre_array;

    private static TheatreStorage theatreStorage = new TheatreStorage();

    public static TheatreStorage getInstance() {
        return theatreStorage;
    }
    private TheatreStorage() {
        theatre_array = new ArrayList<Theatre>();
        String n, m;
        n = "Espoo omena";
        theatre_array.add(new Theatre(n));
        m = "Espoo sello";
        theatre_array.add(new Theatre(m));

        /*theatre_array.add(new TheatreStorage("Espoo omena"));
        theatre_array.add(new TheatreStorage("Espoo sello"));
        theatre_array.add(new TheatreStorage("Helsinki itis"));
        theatre_array.add(new TheatreStorage("Helsinki kinopalatsi"));
        theatre_array.add(new TheatreStorage("Helsinki maxim"));
        theatre_array.add(new TheatreStorage("Helsinki tennispalatsi"));
        theatre_array.add(new TheatreStorage("Jyväskylä fantasia"));
        theatre_array.add(new TheatreStorage("Kuopio scala"));
        theatre_array.add(new TheatreStorage("Lahti kuvapalatsi"));
        theatre_array.add(new TheatreStorage("Lappeenranta strand"));
        theatre_array.add(new TheatreStorage("Oulu plaza"));
        theatre_array.add(new TheatreStorage("Pori promenadi"));
        theatre_array.add(new TheatreStorage("Tampere cine atlas"));
        theatre_array.add(new TheatreStorage("Tampere plevna"));
        theatre_array.add(new TheatreStorage("Turku kinopalatsi"));
        theatre_array.add(new TheatreStorage("Vantaa flamingo"));    */
    }
}
