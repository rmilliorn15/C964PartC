package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvReader {


    /**
     * reads Csv file and creates new videogame objects before adding to Observable array.
     * @throws IOException
     */
    public static void readCsvFile() throws IOException {
        String file = "imdb-videogamesupdated.csv";
        String line = null;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null){
            String[] temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String title = temp[1];
            String year = temp[2];
            String description = temp[3];
            boolean action = Boolean.parseBoolean(temp[4]);
            boolean adventure = Boolean.parseBoolean(temp[5]);
            boolean comedy = Boolean.parseBoolean(temp[6]);
            boolean crime = Boolean.parseBoolean(temp[7]);
            boolean family = Boolean.parseBoolean(temp[8]);
            boolean fantasy = Boolean.parseBoolean(temp[9]);
            boolean mystery = Boolean.parseBoolean(temp[10]);
            boolean sciFi = Boolean.parseBoolean(temp[11]);
            boolean thriller = Boolean.parseBoolean(temp[12]);

            VideoGame addGame = new VideoGame(id,title,year,description,action,
                    adventure,comedy,crime,family, fantasy,mystery,sciFi,thriller);

            VideoGame.addVideoGame(addGame);
        }

    }


}
