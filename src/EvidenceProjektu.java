import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class EvidenceProjektu {
    List<Projekt> seznam = new ArrayList<>();

    public List<Projekt> getSeznam() {
        return seznam;
    }

    String nazevSoboru = "vstup";

    public void pridejProjekt(){
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader(nazevSoboru)))){
            while(sc.hasNextLine()){
                String radek = sc.nextLine();
                String[] rozdelovac = radek.split("#");
                if(rozdelovac.length !=5){
                    throw new RuntimeException();
                }
                String nazev = rozdelovac[0].trim();
                Integer pocetResitelu = Integer.parseInt(rozdelovac[1].trim());
                Boolean dokonceno = Boolean.parseBoolean(rozdelovac[2].trim());
                LocalDate datumZahajeni = LocalDate.parse(rozdelovac[3].trim());
                Integer hodnoceni = Integer.parseInt(rozdelovac[4].trim());
                Projekt projekt = new Projekt(nazev,pocetResitelu,dokonceno,datumZahajeni,hodnoceni);
                Projekt projekt1 = new Projekt("Scanner",2,true, LocalDate.of(2020,1,1),2);
                Projekt projekt2 = new Projekt("FileChooser",5,false, LocalDate.of(2016,4,1),3);
                Projekt projekt3 = new Projekt("Deskovky",8,true, LocalDate.of(2004,6,4),1);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Soubor:"+nazevSoboru+" nebyl nalezen."+e.getLocalizedMessage());
        }

    }
}