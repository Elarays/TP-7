import java.io.*;
import java.text.Normalizer;


public class Codeur {

    public static String normalize(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD)
                .replaceAll("[\u0300-\u036F]", "")
                .toUpperCase();
    }

    public static void main(String[] args) throws IOException {

        int cle = Integer.parseInt(args[0]);
        String type = args[1];
        Cesar cesar = new Cesar(cle);
        String line;

        BufferedReader lecteur = new BufferedReader(new FileReader(args[2]));

        FileWriter e = new FileWriter(args[3]);
        BufferedWriter ecriture = new BufferedWriter((e));


        if (args[1] == "code")
        {
            while ((line = lecteur.readLine()) != null)
            {
                ecriture.write(cesar.code(line));
                ecriture.write("\n");
            }
            ecriture.close();
            lecteur.close();
        }
        else
            {
                while ((line = lecteur.readLine()) != null)
                {
                ecriture.write(cesar.deCode(line));
                ecriture.write("\n");
                }
                ecriture.close();
                lecteur.close();
            }
    }
}






   /* public static void main(String[] args) throws IOException
    {
        File folder = new File("C://Users//saide//Desktop/dossier1/");
        File file =new File("C://Users//saide//Desktop/doc.txt");


        if (!folder.exists())
        {
            folder.mkdir();
        }



        if(!file.exists())
        {
            try{
                file.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();

            }
        }

        else
        {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter((writer));
            bw.write("salut tt le monde");
            bw.newLine();
            bw.write("ca va?");
            bw.newLine();
            bw.write("test!");
            bw.write("test termial");
            bw.close();
            writer.close();

        }
    }

    */

