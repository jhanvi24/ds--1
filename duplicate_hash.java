import java.util.HashSet;
import java.util.Set;
 
public class duplicate_hash
{
    public static void main(String[] args) 
    {
        int[] array = {1,1,2,3,4,5,6,7,8,8};
         
    HashSet<Integer> hset = new HashSet<Integer>();
         
        for(int i = 0; i < array.length ; i++) 
        {
            if(set.add(array[i]) == false) 
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
   
