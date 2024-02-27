import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.net.URI;


public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hostname: ");
        String url = scanner.nextLine();
        String htmlFile = "htmlDownload";
        String summaryRepor = "SummaryReport";

        try{
            download(url, htmlFile);
            generate(htmlFile, summaryRepor, url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void download(String url, String htmlFile) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFile))){
            InetAddress address = InetAddress.getByName(url);
            System.out.println("IP Address: " + address.getHostAddress());
            String line;
            while((line = writer.in()) != null){
    //the functionality is missing i am not sure how it worked..
            }

        }
    }

    private static void generate(String htmlFile, String summaryRepor, String url) throws IOException {

        try(BufferedReader reader = new BufferedReader(new FileReader(htmlFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(summaryRepor))
            ) {
            InetAddress address = InetAddress.getByName(url);
            writer.write("the ip address of the website is: " + address);
            writer.write("the url of the website is " + url );
            desktop.browse(url);
    // here also the logic i dont know to do it
        }
    }
    //honest work, nothing copied, no ai. I only have reviewed the exercises at home once
}
