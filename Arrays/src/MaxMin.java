public class MaxMin {
  public static void main(String[] args) {
    int arr[] = {54, 24, 0, 2, 45,7};		 
    int max = arr[0];
    int min = arr[0];
    for(int i = 1; i < arr.length; i++){
      if(max < arr[i]){
        max = arr[i];
      }else if(min > arr[i]){
        min = arr[i];
      }		   		   
    }
    System.out.println("Maximum number = " 
         + max + " Minimum number = " + min);		
  }
}
