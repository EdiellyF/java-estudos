import java.io.File;
import java.util.Scanner;

public class ManipuladoPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);


        File[] folders = path.listFiles(File::isDirectory);

        for (File folder : folders) {
            if (folder.isDirectory()) {
                System.out.println("Folder: " + folder.getName());
            }
        }

        System.out.println("PATHS:");
        File[] files = path.listFiles(File::isFile);
        for (File file: files){
            if(file.isFile()){
                System.out.println(file);
            }
        }


        boolean sucess = new File(strPath + "\\subdirEdielly").mkdir();
        if (sucess){
            System.out.println("Pasta criada com sucesso");
        }
    }
}
