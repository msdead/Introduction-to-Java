
import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
//     public static void main(String[] args) throws IOException {
    
//         Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
//         //ConsoleHandler ch = new ConsoleHandler();
//         FileHandler fh = new FileHandler("log.txt");
//         //logger.addHandler(ch);
//         logger.addHandler(fh);
        
//         SimpleFormatter sFormat = new SimpleFormatter();
//         //XMLFormatter xml = new XMLFormatter();
//         fh.setFormatter(sFormat);
//         //fh.setFormatter(xml);
        
//         //logger.setLevel(Level.INFO);
//         logger.log(Level.WARNING, "Тестовое логирование 1");
//         logger.info("Тестовое логирование 2");

//     }
// }




// public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder("I Java!");

//     sb.insert(2, "like ");
//     System.out.println(sb);
// }
// }


// public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder("This is a test.");

//     sb.delete(4, 7);
//     System.out.println("После delete: " + sb);

//     sb.deleteCharAt(0);
//     System.out.println("После deleteCharAt: " + sb);
// }
// }

// public static void main(String[] args) {
//     StringBuilder stringBuilder = new StringBuilder("Hello");

//     System.out.println("string = " + stringBuilder);
//     System.out.println("length = " + stringBuilder.length());
//     System.out.println("capacity = " + stringBuilder.capacity());
// }

public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder("Этo простой тест.");
    stringBuilder.replace(4, 11, "был");
    System.out.println("После замены: " + stringBuilder);
}

}