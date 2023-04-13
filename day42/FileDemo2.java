import java.io.FileOutputStream;
import java.io.FileWriter;

class FileDemo2 {
  public static void main(String args[]) {
    try {
      FileReader fr = new FileReader("abc.txt");
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    // try{
    // FileOutputStream fw=new FileOutputStream("xyz.txt");
    // String str="hi hello how are you";
    // byte bytes[]=str.getBytes();

    // fw.write(bytes);
    // fw.close();
    // }
    // catch(Exception e){
    // System.out.println(e);
    // }

  }
}