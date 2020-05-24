import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

class FileManager{

  public ArrayList<String> lines(String fileName){
    ArrayList<String> out = new ArrayList<String>();
    try{
      File f = new File(fileName);
      Scanner reader = new Scanner(f);

      while(reader.hasNextLine()){
        out.add(reader.nextLine());
      }
    }
    catch(FileNotFoundException error){
      System.out.println("Failed reading file "+fileName);
      error.printStackTrace();
    }
    return(out);
  }
  public void write(String fileName, String data){
    try{
      FileWriter user = new FileWriter(fileName);
      user.write(data);
      user.close();
    }
    catch(IOException error){
      System.out.println("Failed writing to "+fileName);
      error.printStackTrace();     
    }
  }
  public void addEntry(String text){
    ArrayList<String> lines = lines("shadow.txt");
    lines.add(text);
    String buf = "";
    for(String line : lines){
      buf = buf+line+"\n";
    }
    write("shadow.txt",buf);
  }
  public String[][] stripShadow(){
    ArrayList<String> all = lines("shadow.txt");
    String[][] p = new String[all.size()][2];
    for(int index=0; index<all.size(); index++){
      String line = all.get(index);
      int in = line.indexOf(":");
      String[] pair = {line.substring(0,in),line.substring(in+1)};
      p[index] = pair;
    }
    return(p);
  }

  public void showLines(ArrayList<String> lns){
    System.out.println("*Here is the vault*");
    for(String ln : lns){
      System.out.println(ln);
    }
    System.out.println("-----");
  }
  public void delete(String key, ArrayList<String> all){
    for(int index=0; index<all.size(); index++){
      String line = all.get(index);
      int sep = line.indexOf(":");
      if(line.substring(0,sep).equals(key)){
        all.remove(index);
      }
    }
  }
  public void clear(){
    write("shadow.txt","");
    write("user.txt","");
  }
}