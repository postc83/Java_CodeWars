public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    double total = 0;
    
    for (int i : classPoints){
      total += i;
    }
    total = total / classPoints.length;
    
    return yourPoints > total;
    
  }
}