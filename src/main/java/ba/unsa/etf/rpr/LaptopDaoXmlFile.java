package ba.unsa.etf.rpr;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoXmlFile implements LaptopDao{
    private ArrayList<Laptop> laptopi;
    private File file;

    LaptopDaoXmlFile(){
        file = new File("mojfile.xml");
        laptopi = new ArrayList<Laptop>();
    }
    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) throws IOException {
        XmlMapper maper = new XmlMapper();
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
        return null;
    }
}
