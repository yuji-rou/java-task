import java.util.logging.*;

public class TryCatchFinallySample2 {
    public static void main (String[] args){
        Logger logger = Logger.getLogger(TryCatchFinallySample2.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        try {
            logger.warning("try");
            Integer.parseInt(args[0]);
        } catch (Exception e) {
            logger.severe("catch");
        } finally {
            logger.info("finally");
        }
    }
}