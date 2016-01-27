package JavaWeb.javanp;

import java.io.*;
import java.net.URL;

/**
 * Created by Administrator on 2016/1/25.
 */
public class Demo {
    //    DataOutputStream
    public static void generateCharacter(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;

        int start = firstPrintableCharacter;
        while (true) {
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                out.write(((i - firstPrintableCharacter) % numberOfPrintableCharacters) + firstPrintableCharacter);
            }
            out.write('\r');
            out.write('\n');
            start = ((start + 1) - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter;
        }
    }

    public static void generateCharacters(OutputStream out)throws IOException{
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;

        int start = firstPrintableCharacter;
        byte[] line = new byte[numberOfCharactersPerLine + 2];
        while (true){
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                line[i-start] = (byte)((i - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter);
            }
            line[72] = (byte)'\r';
            line[73] = (byte)'\n';
            out.write(line);
            start = ((start + 1) - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter;

        }

    }




    public static void main(String[] args) throws Exception{
//        InputStream in = new FileInputStream("C:/Users/Admin/Desktop/seting.xml");
//        System.out.println(in.markSupported());
//        try (OutputStream out = new FileOutputStream(new File("C:/Users/Admin/Desktop/data.txt"))){
//            generateCharacters(out);
//        }catch (IOException ex){
//            System.err.println(ex.getMessage());
//        }
        URL url = new URL("http://www.rsvptech.cn");
        InputStreamReader irs = new InputStreamReader(url.openConnection().getInputStream());
        BufferedReader br = new BufferedReader(irs);
        System.out.println(br.readLine());
//        BufferedWriter br = new FileWriter(new File(""));
    }
}


