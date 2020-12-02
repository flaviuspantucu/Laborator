package classes;

import java.util.ArrayList;

public class Utilizator {
    private String name;
    private ArrayList<Controller.Carte> carti;
    private int varsta;
	private String email;
    public Utilizator(String nm, ArrayList<Controller.Carte> car, int years, String email2) {
        this.name = nm;
        this.carti = car;
        this.varsta = years;
		this.email = email2;
    }
}

