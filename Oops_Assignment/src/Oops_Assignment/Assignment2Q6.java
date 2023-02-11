package Oops_Assignment;
import java.util.Scanner;

abstract class Persistence {
    abstract public void persist();
}

class FilePersistence extends Persistence {
    @Override
    public void persist() {
        System.out.println("Data persisted to file");
    }
}

class DatabasePersistence extends Persistence {
    @Override
    public void persist() {
        System.out.println("Data persisted to database");
    }
}


public class Assignment2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to persist data to file, 2 to persist data to database");
        int choice = sc.nextInt();
        Persistence persistence;
        if (choice == 1) {
            persistence = new FilePersistence();
        } else {
            persistence = new DatabasePersistence();
        }
        persistence.persist();
    }
}
