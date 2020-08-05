import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Main {
  public static void main(String[] args) throws FileNotFoundException {

        File file = new File("plik.txt");
        Scanner read = new Scanner(file);
        System.out.print("wczytuje linie");
        String text = read.nextLine();
        read.close();
        //System.out.print(text);

        PrintWriter write = new PrintWriter("plik.txt");
        write.println("tekst");
        write.close();

        Scanner in = new Scanner(System.in);
    
        System.out.print("Jak sie nazywasz? " + text);
        String name = in.nextLine();
    
        System.out.print("Ile masz lat? ");
        int age = in.nextInt();
        in.close();
    
        System.out.printf("Witaj, %s. W przyszlym roku bedziesz miec %d lat.", name, age+1);
    }
}