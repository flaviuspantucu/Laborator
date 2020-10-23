package classes;

import java.util.ArrayList;

public class Utilizator {
    private String name;
    private ArrayList<Controller.Carte> carti;

    public Utilizator(String name, ArrayList<Controller.Carte> carti) {
        this.name = name;
        this.carti = carti;
    }
}

