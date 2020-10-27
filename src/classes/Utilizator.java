package classes;

import java.util.ArrayList;

public class Utilizator {
    private String name;
    private ArrayList<Controller.Carte> carti;
    private int varsta;
    public Utilizator(String nm, ArrayList<Controller.Carte> car, int years) {
        this.name = nm;
        this.carti = car;
        this.varsta = years;
    }
}

