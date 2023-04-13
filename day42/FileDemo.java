import java.io.FileOutputStream;
import java.io.FileWriter;

class FileDemo {
  public static void main(String args[]) {
    try{
    FileWriter fw=new FileWriter("abc.txt");
    fw.write("Namaste 🙏 Wecome to file handling");
    fw.close();
    }
    catch(Exception e){
    System.out.println(e);
    }
    try {
      FileOutputStream fw = new FileOutputStream("xyz.txt");
      String str = "Hello welcome ";
      byte bytes[] = str.getBytes();

      fw.write(bytes);
      fw.close();
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}