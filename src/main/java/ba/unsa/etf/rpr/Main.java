package ba.unsa.etf.rpr;

import java.io.IOException;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        LaptopDao l = new LaptopDaoSerializableFile();
        Laptop l1 = new Laptop();
        l1.setProcesor("Intel");
        l1.setCijena(2000);
        try {
            l.dodajLaptopUFile(l1);
            System.out.println(l.getLaptop("Intel"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
