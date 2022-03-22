package MarsMission;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {
    List<File> loadItems(List<File>llis1 ,List<File>llist2) throws FileNotFoundException {
        List<File> fileList1 = new ArrayList<>();
        File file1 = new File("/home/khagenbaro/Downloads/phase-1.txt");
        Scanner sc = new Scanner(file1);
        while (sc.hasNextLine()) {
            String newLine = sc.nextLine();
            fileList1.add(new File(newLine));
        }
        List<File> fileList2 = new ArrayList<>();
        File file2 = new File("/home/khagenbaro/Downloads/phase-2.txt");
        Scanner sc2 = new Scanner(file2);
        while (sc2.hasNextLine()) {
            String newLine = sc2.nextLine();
            fileList2.add(new File(newLine));
        }
        return fileList1;


    }

    void loadU1() {


    }

//    public static void main(String[] args) throws FileNotFoundException {
//        Simulation simulation = new Simulation();
//        simulation.loadItems();
//
//    }
}
