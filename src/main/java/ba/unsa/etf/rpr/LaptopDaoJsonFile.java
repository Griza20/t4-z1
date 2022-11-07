package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoJsonFile implements LaptopDao{
    private ArrayList<Laptop> laptopi;
    private File file;
    LaptopDaoJsonFile(){
        file = new File("mojfile.json");
        laptopi = new ArrayList<>();
    }
    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        JsonMapper maper = new JsonMapper();
        laptopi.add(laptop);
        FileOutputStream f = new FileOutputStream(file);
        String s = maper.writeValueAsString(laptopi);
        f.write(s.getBytes());
        f.close();
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
        this.laptopi=laptopi;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzDatoteke() throws IOException {
        JsonMapper j = new JsonMapper();
        ArrayList<Laptop> l = new ArrayList<Laptop>();
        l = j.readValue(file, new TypeReference<ArrayList<Laptop>>() {
        });
        return l;
    }
}
