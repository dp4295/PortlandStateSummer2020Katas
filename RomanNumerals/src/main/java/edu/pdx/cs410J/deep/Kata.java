package edu.pdx.cs410J.deep;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static void main(String[] args) {

  //  System.err.println("Missing command line arguments");

    System.out.println(romanNumeral(20));

    System.exit(1);
  }

  public static String romanNumeral(int i) {
    String res = new String();
    if(i >= 5000){
      return "V";
    }
    int M_num = i % 1000;
    if(M_num != 0 ) {
      i = i - 1000*M_num;
      for(int x = 0; x < M_num; x++){
        res+="M";
      }
      if(i > 900){
        res+="CM";
        i -= 900;
      }
      else{
        int D_num = i % 500;
        if(D_num != 0) {
          i = i - 500*D_num;
          for(int x = 0; x < D_num; x++){
            res+="D";
          }
        }
        int C_num = i % 100;
        if(C_num != 0) {
          i = i - 100* C_num;
          if(C_num == 4){
            res+= "CD";
          }else{

          }
        }
      }
    }


    int L_num = i % 50;
    if(L_num != 0) i = i - 50*L_num;

    int X_num = i % 10;
    if(X_num != 0) i = i - 10*X_num;

    int V_num = i % 5;
    if(V_num != 0) i = i - 5*V_num;

//    if(i == 0){
//      return
//    }
   return res;
  }




}