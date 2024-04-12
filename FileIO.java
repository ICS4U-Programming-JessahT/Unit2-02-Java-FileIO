/**
 * program that reads files.
 *
 * @author Jessah
 * @version 1.0 @2024-03-27
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class FileIO {

  /** Private constructor to prevent instantiation of this utility class. */
  private FileIO() {
    // whitespace
  }

  /**
   * Main program.
   *
   * @param args Command-line arguments (not used in program).
   * @param scanner
   * @param arrOfStr
   * @param split
   * @throws IOException
   */

  // Main program.
  public static void main(final String[] args) throws IOException {
    // Initialize sum.
    int sum = 0;
    // Get File.
    File file = new File("Unit2/Unit2-02/Unit2-02-Java-FileIO/input.txt");
    // Scanner file objects.
    Scanner scanner = new Scanner(file);

    // repeat when there is a next line of code.
    while (scanner.hasNext()) {
      String line = scanner.nextLine();
      String[] arrayStrings = line.split(" ");
      // For each character on line.
      for (String element : arrayStrings) {
        try {
          final int arrayInt = Integer.parseInt(element);
          // Add int to sum.
          sum += arrayInt;
        } catch (NumberFormatException error) {
          System.out.println("Invalid integer found: " + element);
        }
      }
    }
    // Write sum to output.
    FileWriter fileWriter = new FileWriter("output.txt");
    fileWriter.write(sum);
    fileWriter.close();

    // Display when sum is written to txt.
    System.out.println("finish");
    scanner.close();
  }
}
