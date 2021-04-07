import java.io.IOException;
import java.util.logging.*;

public class LogTest {

    public static void main(String args[]) {
        final Logger myLogger = Logger.getLogger("mylooger");
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);

        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //��Ӵ�����
        myLogger.addHandler(fileHandler);
        myLogger.addHandler(handler);

        myLogger.setLevel(Level.FINEST);
        myLogger.info("INFO");
        myLogger.warning("WARNING");
        myLogger.fine("FINE");
        myLogger.finest("FINEST");


        myLogger.logp(Level.INFO, "LogTest", "main", "method record");

    }

}