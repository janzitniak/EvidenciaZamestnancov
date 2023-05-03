package sk.tmconsulting.model;

import sk.tmconsulting.service.ZamestnanecService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private int rokNarodenia;
    private Zamestnavatel zamestnavatelP; // Vytvorenie premennej s nazvom zamestnavatelP, ktory reprezentuje triedu Zamestnavatel
    private ZamestnanecService zamestnanecServiceP; // Vytvorenie premennej s nazvom zamestnanecService, ktory reprezentuje triedu ZamestnanecService

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getRokNarodenia() {
        return rokNarodenia;
    }

    public void setRokNarodenia(int rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }

    public Zamestnavatel getZamestnavatelP() {
        return zamestnavatelP;
    }

    public void setZamestnavatelP(Zamestnavatel zamestnavatelP) {
        this.zamestnavatelP = zamestnavatelP;
    }

    public ZamestnanecService getZamestnanecServiceP() {
        return zamestnanecServiceP;
    }

    public void setZamestnanecServiceP(ZamestnanecService zamestnanecServiceP) {
        this.zamestnanecServiceP = zamestnanecServiceP;
    }
}
