//May 10/2025
public class Average_of_arrays{

  public static void main (String[] args){

        int[] numbersArrays={1,2,3,4,5,6,7,8};
        int allsum=0;

        for(int y=0; y<numbersArrays.length;y++){
            int current= numbersArrays[y];
            allsum = allsum + current;
          }

        int result=allsum/numbersArrays.length;
        System.out.println(result);
  }
}

