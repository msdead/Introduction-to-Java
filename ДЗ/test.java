package ДЗ;

// import java.util.logging.ConsoleHandler;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;
// import java.util.logging.XMLFormatter;

// import javax.imageio.stream.FileCacheImageInputStream;

import java.io.File;
// import java.io.IOException;
// import java.lang.System.Logger.Level;

public class test {
    // public static void main(String[] args) throws SecurityException, IOException {
    //     Logger logger = Logger.getLogger(DZ2_2.class.getName());
    //     FileHandler fh = new FileHandler("log.txt");
    //     logger.addHandler(fh);
    //     SimpleFormatter sFormat = new SimpleFormatter ();
    //     fh.setFormatter(sFormat);
    //     logger.info("Тестовое логирование" );


        // sb.toString
        
    // }

         // BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
        // String str;     
        // while ((str = br.readLine()) != null) {
        //     System.out.printf("%s\n", str);
        // }
        // br.close();
       
    public static void main() {
        
    
        StringBuilder sb = new StringBuilder();

        File f1 = new File("Text.txt");
    

        System.out.println(f1.getAbsolutePath());

        String command = "Студент" + " " + "получил" + " " + "по предмету" + " ";
        sb.replace(3, 5, "ABCDE");

    }

}