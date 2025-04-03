import java.io.File;
public class ReplaceText {
    public static void main (String[] args) throws Exception {
        if (args.length != 3){
            System.out.println(
                    "usage: java ReplaceText sourceFile targetFile oldStr newStr"
            );
            System.exit(1);
        }
        // Check for sourceFile
        File sourceFile = new File(args[0]);
        if(sourceFile.exists()){
            System.out.println("sourceFile doesn't exit");
        }
    }
}
