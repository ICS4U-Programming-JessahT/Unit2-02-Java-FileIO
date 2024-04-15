import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program that reads files.
 *
 * @author Jessah
 * @version 1.0 @2024-03-27
 */

public final class FileIO {

  /** Private constructor to prevent instantiation of this utility class. */
  private FileIO() {
    // whitespace
  }

  /**
   * Main program.
   *
   * @param args Command-line arguments (not used in program).
   * @throws IOException
   */

  // Main program.
  public static void main(final String[] args) throws IOException {
    // Initialize sum.
    int sum = 0;
    // Get File.
    final File file = new File("Unit2/Unit2-02/Unit2-02-Java-FileIO/input.txt");
    // Scanner file objects.
    final Scanner scanner = new Scanner(file);

    // repeat when there is a next line of code.
    while (scanner.hasNext()) {
      final String line = scanner.nextLine();
      final String[] arrayStrings = line.split(" ");
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
    final FileWriter fileWriter = new FileWriter("output.txt", true);

    fileWriter.write(Integer.toString(sum));
    fileWriter.close();

    // Display when sum is written to txt.
    System.out.println("finish");
    scanner.close();
  }
}
