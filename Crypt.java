import java.util.ArrayList;

class Crypt{
  final int[] i = {0, 31, 0, 11, 0, 0, 15, 1, 0, 15, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 31, 0, 77, 656, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 32, 0, 12, 0, 0, 16, 1, 0, 16, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 32, 0, 77, 657, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 33, 0, 13, 0, 0, 17, 1, 0, 17, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 33, 0, 77, 658, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 34, 0, 14, 0, 0, 18, 1, 0, 18, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 34, 0, 77, 659, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 0, 0, 27, 0, 0};
  final int[] j = {0, 31, 0, 11, 0, 0, 15, 1, 0, 15, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 31, 0, 75, 656, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 32, 0, 12, 0, 0, 16, 1, 0, 16, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 32, 0, 75, 657, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 33, 0, 13, 0, 0, 17, 1, 0, 17, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 33, 0, 75, 658, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 34, 0, 14, 0, 0, 18, 1, 0, 18, 0, 0, 0, 21, 0, 21, 0, 0, 0, 11, 0, 27, 0, 0, 0, 331, 636, 27, 0, 0, 1, 331, 626, 27, 0, 0, 0, 21, 0, 331, 636, 0, 0, 21, 0, 21, 0, 646, 0, 21, 0, 21, 0, 1, 0, 21, 0, 21, 0, 4, 0, 21, 0, 21, 0, 0, 0, 1, 0, 75, 626, 0, 0, 34, 0, 75, 659, 0, 0, 21, 0, 21, 0, -12, 0, 21, 0, 21, 0, 0, 0, 0, 0, 27, 0, 0};

  private int[] idigit(int num){
    int[] out = new int[4];
    for(int i=3; i>=0; i--){
      out[i] = num%10;
      num /= 10;
    }
    return(out);
  }
  private int icompress(int[] num){
    int out = 0;
    for(int index=3; index>=0; index--){
      out += num[3-index]*(int)Math.pow(10,index);
    }
    return(out);
  }
  private String[][] parseAll(ArrayList<String> all){
    String[][] out = new String[all.size()][2];
    for(int index=0; index<all.size(); index++){
      String line = all.get(index);
      int sep = line.indexOf(":");
      out[index][0] = line.substring(0,sep);
      out[index][1] = line.substring(sep+1);
    }
    return(out);
  }

  public int[] encry(int[] pass, int[] message){
    Mvm iOS = new Mvm(i);
    
    iOS.edit(11,message[0]);
    iOS.edit(12,message[1]);
    iOS.edit(13,message[2]);
    iOS.edit(14,message[3]);
    iOS.edit(15,pass[0]);
    iOS.edit(16,pass[1]);
    iOS.edit(17,pass[2]);
    iOS.edit(18,pass[3]);

    iOS.run();
    int[] results = iOS.getMem();
    int[] out = {results[31],results[32],results[33],results[34]};
    return(out);
  }
  public int[] encry(int pass, int message){
    return(encry(idigit(pass),idigit(message)));
  }
  public int[] decry(int[] pass, int[] message){
    Mvm iOS = new Mvm(j);
    
    iOS.edit(11,message[0]);
    iOS.edit(12,message[1]);
    iOS.edit(13,message[2]);
    iOS.edit(14,message[3]);
    iOS.edit(15,pass[0]);
    iOS.edit(16,pass[1]);
    iOS.edit(17,pass[2]);
    iOS.edit(18,pass[3]);

    iOS.run();
    int[] results = iOS.getMem();
    int[] out = {results[31],results[32],results[33],results[34]};
    return(out);
  }
  public int[] decry(int pass, int message){
    return(decry(idigit(pass),idigit(message)));
  }

  public String[][] lockKeychain(int pass){
    FileManager finder = new FileManager();
    String[][] elCapitan = finder.stripShadow();
    String[][] mavericks = new String[elCapitan.length][2];
    for(int index=0; index<elCapitan.length; index++){
      mavericks[index][0] = elCapitan[index][0];
      int[] tmp = encry(pass,Integer.parseInt(elCapitan[index][1]));
      mavericks[index][1] = Integer.toString(icompress(tmp));
    }
    return(mavericks);
  }
  public String[][] lockKeychain(int pass, ArrayList<String> all){
    String[][] elCapitan = parseAll(all);
    String[][] mavericks = new String[elCapitan.length][2];
    for(int index=0; index<elCapitan.length; index++){
      mavericks[index][0] = elCapitan[index][0];
      int[] tmp = encry(pass,Integer.parseInt(elCapitan[index][1]));
      mavericks[index][1] = Integer.toString(icompress(tmp));
    }
    return(mavericks);
  }
  public String[][] openKeychain(int pass){
    FileManager finder = new FileManager();
    String[][] elCapitan = finder.stripShadow();
    String[][] mavericks = new String[elCapitan.length][2];
    for(int index=0; index<elCapitan.length; index++){
      mavericks[index][0] = elCapitan[index][0];
      int[] tmp = decry(pass,Integer.parseInt(elCapitan[index][1]));
      mavericks[index][1] = Integer.toString(icompress(tmp));
    }
    return(mavericks);
  }
  public String[][] openKeychain(int pass, ArrayList<String> all){
    String[][] elCapitan = parseAll(all);
    String[][] mavericks = new String[elCapitan.length][2];
    for(int index=0; index<elCapitan.length; index++){
      mavericks[index][0] = elCapitan[index][0];
      int[] tmp = decry(pass,Integer.parseInt(elCapitan[index][1]));
      mavericks[index][1] = Integer.toString(icompress(tmp));
    }
    return(mavericks);
  }

  public ArrayList<String> zip(String[][] keychain){
    ArrayList<String> all = new ArrayList<String>();
    for(int index=0; index<keychain.length; index++){
      all.add(keychain[index][0]+":"+keychain[index][1]);
    }
    return(all);
  }

}