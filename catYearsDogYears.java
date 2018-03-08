public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int catYears = 0, dogYears = 0;
    
    if (humanYears == 1){
      catYears = 15;
      dogYears = 15;
    }
    else if ( humanYears == 2){
      catYears = 24;
      dogYears = 24;
    }
    else{
      catYears = 24;
      dogYears = 24;
      for ( int i = 3; i <=humanYears; i++){
        catYears += 4;
        dogYears += 5;
      }
    }

    return new int[]{humanYears, catYears, dogYears};
    
  }

}