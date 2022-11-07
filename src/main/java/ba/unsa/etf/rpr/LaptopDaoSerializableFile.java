package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao{
    private ArrayList<Laptop> laptopi;
    private File file;
    LaptopDaoSerializableFile(){
        file = new File("mojfile.txt");
        laptopi = new ArrayList<>();
    }
    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        laptopi.add(laptop);
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(laptopi);
        f.close();
        o.close();
    }

    @Override
    public Laptop getLaptop(String procesor) {
        for(Laptop l:laptopi){
            if(l.getProcesor().equals(procesor)) return l;
        }
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException{
        ArrayList<Laptop> l = new ArrayList<>();
        FileInputStream f = new FileInputStream(file);
        ObjectInputStream o = new ObjectInputStream(f);
        try {
            l = (ArrayList<Laptop>) o.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return l;
    }
}
