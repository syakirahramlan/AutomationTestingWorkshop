package JavaProgram;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readDataTextFile {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\User\\Downloads\\example\\data.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line from the file and display it on the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

}





        
