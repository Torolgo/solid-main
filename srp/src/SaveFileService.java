import java.io.FileWriter;
import java.io.IOException;

public class SaveFileService {
    public static void saveDocument(Document document){
        try (FileWriter writer = new FileWriter(document.documentName + ".txt", true)) {
            writer.write(document.documentContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
