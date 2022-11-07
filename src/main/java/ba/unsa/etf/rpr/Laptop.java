package ba.unsa.etf.rpr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Laptop implements Serializable {
    private String brend;
    private String model;
    private String procesor;

    public Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", procesor='" + procesor + '\'' +
                ", grafickaKartica='" + grafickaKartica + '\'' +
                ", cijena=" + cijena +
                ", velicinaEkrana=" + velicinaEkrana +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", ssd=" + ssd +
                '}';
    }

    private String grafickaKartica;
    private double cijena;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.cijena, cijena) == 0 && Double.compare(laptop.velicinaEkrana, velicinaEkrana) == 0 && ram == laptop.ram && hdd == laptop.hdd && ssd == laptop.ssd && Objects.equals(brend, laptop.brend) && Objects.equals(model, laptop.model) && Objects.equals(procesor, laptop.procesor) && Objects.equals(grafickaKartica, laptop.grafickaKartica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brend, model, procesor, grafickaKartica, cijena, velicinaEkrana, ram, hdd, ssd);
    }

    private double velicinaEkrana;
    private int ram, hdd, ssd;

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getGrafickaKartica() {
        return grafickaKartica;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

}
