package sk.tmconsulting.service;

import sk.tmconsulting.model.Zamestnanec;
import sk.tmconsulting.model.Zamestnavatel;
import java.util.ArrayList;

public class ZamestnanecService {

    private ArrayList<Zamestnavatel> zamestnavatelia = new ArrayList<>();

    public void pridajZamestnavatela(Zamestnavatel zamestnavatelP) {
        zamestnavatelia.add(zamestnavatelP);
    }

    public ArrayList<Zamestnavatel> vratZamestnavatelov() {
        return zamestnavatelia;
    }

}
