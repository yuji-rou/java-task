import java.io.BufferedReader;//pushの為のコメント
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    public enum Mark {START, END};

    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        List <Integer> valueList = new ObjectList<>();

        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)){
            String line = null;
            while ((line = br.readLine()) != null) {
                valueList.add(Integer.parseInt(line)); 
            }
            for (int value : valueList) {
                System.out.println(value);
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String... args) {
        logger.info(Mark.START.name());
        new TextReader(args[0]).execute();
        logger.info(Mark.END.name());
    }
}