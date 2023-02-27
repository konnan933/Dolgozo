package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Modell {

    public List<String> beolvas() throws IOException {
        String fajlNev = "emberek.txt";
        List<String> sorok = Files.readAllLines(Path.of(fajlNev));
        sorok.remove(0);
        return sorok;
    }

    public ArrayList<Ember> EmberGeneralas() throws IOException {
        List<String> sorok = beolvas();
        ArrayList<Ember> emberek = new ArrayList<>();
        
        for (String sor : sorok) {
            emberek.add(new Ember(sor, ";"));
        }
        
        return emberek;
    }

}
