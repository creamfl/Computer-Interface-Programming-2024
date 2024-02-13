import java.io.File;

public class forth {
    public static void main(String[] args) {

        File directory = new File("C:\\Users\\Student\\IdeaProjects\\first\\src");


        if (directory.isDirectory()) {
            if (directory.list().length > 0) {
                System.out.println("The directory is not empty.");
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("This is not a directory.");
        }
    }
}
