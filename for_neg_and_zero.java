
}import java.util.HashSet;
import java.util.Set;
 
 public class for_neg_and_zero 
{
    public static void main(String[] args) 
    {
        int[] array = {0,1,0,-1,4,-1,6,7,8,8};
         
        Set<Integer> set = new HashSet<Integer>();
         
        for(int i = 0; i < array.length ; i++) 
        {
            //If same integer is already present then add method will return FALSE 
            if(set.add(array[i]) == false) 
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
    }
}