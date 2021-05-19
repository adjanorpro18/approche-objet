package fichier;

import java.io.BufferedReader;
import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args)  {


        Path path = Paths.get("./recensement.csv");
        Path pathEcriture = Paths.get("./recensement2.csv");
        try {
            List <String> lines = Files.readAllLines(path);
            System.out.println(lines);
            ArrayList<String> newDatas = new ArrayList<>();
            Iterator<String> iterator = lines.iterator();
            iterator.next();
            while(iterator.hasNext()) {
                String[] columns = iterator.next().replace(" ", "").split(";");
                if(Integer.parseInt(columns[9]) < 25000 )
                {
                    iterator.remove();
                }
                else{
                    newDatas.add(columns[6] + ";" + columns[9]);
                }

                Files.write(pathEcriture, newDatas);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
