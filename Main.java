import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Auth steve = new Auth();
    Crypt jobs = new Crypt();
    FileManager finder = new FileManager();
    Scanner input = new Scanner(System.in);
    int pin = 0;

    System.out.println(" ________      ___      ________      ___  __\n"+      
"|\\   __  \\    |\\  \\    |\\   ____\\    |\\  \\|\\  \\\n"+     
"\\ \\  \\|\\  \\   \\ \\  \\   \\ \\  \\___|    \\ \\  \\/  /|_\n"+   
" \\ \\   _  _\\   \\ \\  \\   \\ \\  \\        \\ \\   ___  \\\n"+  
"  \\ \\  \\\\  \\|   \\ \\  \\   \\ \\  \\____    \\ \\  \\\\ \\  \\\n"+ 
"   \\ \\__\\\\ _\\    \\ \\__\\   \\ \\_______\\   \\ \\__\\\\ \\__\\\n"+
"    \\|__|\\|__|    \\|__|    \\|_______|    \\|__| \\|__|\n");

    if(finder.lines("user.txt").equals(new ArrayList<String>())){  //create a user
      while(true){
        System.out.println("Enter the new password for the vault. Please use a 4 digit pin without 0's");
        System.out.print("> ");
        pin = input.nextInt();
        if(pin>=1111){
          steve.newPass(pin);
          System.out.println("Pin accepted");
          break;
        } else{
          System.out.println("Wrong pin size.");
        }
      }
    }
    int failCount = 0;
    while(true){  //validate password
      System.out.print("Enter the password> ");
      pin = input.nextInt();
      if(steve.verify(pin)){
        break;
      } else{
        System.out.println("Wrong password. Try again");
        failCount++;
        System.out.println(failCount+" out of 4 fails");
        if(failCount>=4){//have a nuke that deletes the db after 4 fails
          finder.clear();
          System.out.println("Database wiped.");
        }
      } 
    }
    System.out.println("Keychain unlocked");
    input.nextLine();
    ArrayList<String> all = jobs.zip(jobs.openKeychain(pin));
    boolean sent = true;
    String key = "";
    while(sent){
      System.out.println("\nWhat do you want to do?");
      System.out.println("1) Read my saved passwords");
      System.out.println("2) Add a password");
      System.out.println("3) Remove a password");
      System.out.println("4) Clear all files");
      System.out.println("99) Exit");
      System.out.print("> ");
      switch(input.nextLine()){
        case "1":
          finder.showLines(all);
          break;
        case "2":
          System.out.print("Enter password name > ");
          key = input.nextLine();
          System.out.print("Enter pin for "+key+" > ");
          key = key+":"+input.nextLine();
          all.add(key);
          break;
        case "3":
          System.out.print("Enter the password name > ");
          key = input.nextLine();
          finder.delete(key, all);
          break;
        case "4":
          System.out.println("Are you sure? (y/n)");
          if(input.nextLine().equalsIgnoreCase("y")){
            finder.clear();
            System.out.println("Files cleared");
            all = new ArrayList<String>();
            sent = false;
          }
          break;
        case "99":
          sent = false;
          break;
        default:
          System.out.println("Unknown command");
      }
    }
    all = jobs.zip(jobs.lockKeychain(pin, all));
    String buf = "";
    for(String ln : all){
      buf = buf+ln+"\n";
    }
    finder.write("shadow.txt",buf);
    System.out.println("*Encrypted passwords written to the database*");
  }
}