public class WriteData {
    public static void main(String [] args) throws java.io.IOException {
        java.io.File file = new java.io.File("scores1.txt");
        if (file.exists()){
            System.out.println("File exists already!");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        //write input to the file
        output.print("John Russell ");
        output.println(89);
        output.print("Joe Smith ");
        output.println(109);
        output.close();

    }
}
