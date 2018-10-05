package edu.cnm.deepdive;

public class ChickNuggNumCalc {

  public static final int NUM_NUGG1 = 6;
  public static final int NUM_NUGG2 = 9;
  public static final int NUM_NUGG3 = 20;
  public static final int AM_I_NUM_NUGG = 43;

  public static void main(String[] args) {
    int iX = AM_I_NUM_NUGG/NUM_NUGG3;
    int jX = AM_I_NUM_NUGG/NUM_NUGG2;
    int kX = AM_I_NUM_NUGG/NUM_NUGG1;
    nonRecursive(iX, jX, kX);
//    System.out.println(cheapRecursion(1, kX+1, 0, jX+1, 0, iX+1));
  }

  static boolean nonRecursive(int iX, int jX, int kX){
    for (int i = 0; i <= iX; i++) {
      for (int j = 0; j <= jX; j++) {
        for (int k = 0; k <= kX; k++) {
          if(i==0 && j==0 && k==0){
            continue;
          }
          if(AM_I_NUM_NUGG%(NUM_NUGG3*i + NUM_NUGG2*j + NUM_NUGG1*k)==0){
            System.out.println("true");
            return true;
          }
        }

      }

    }
    System.out.println("false");
    return false;
  }

  static boolean cheapRecursion(int startingI, int highestI, int startingJ, int highestJ, int startingK, int highestK ){
    if(AM_I_NUM_NUGG==(startingI*NUM_NUGG1 + startingJ*NUM_NUGG2 + startingK*NUM_NUGG3)){
      return true;
    }
    if(startingI ==0 && startingJ ==0 && startingK==0){
      return false;
    }
    if(startingI == highestI){
      startingI = 0;
      startingJ++;
    }
    if(startingJ == highestJ){
      startingJ = 0;
      startingK++;
    }
    if(startingK == highestK){
      startingK = 0;
    }

    cheapRecursion(startingI, highestI, startingJ, highestJ, startingK, highestK);
    return false;
  }

}
