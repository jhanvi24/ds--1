public class array_left_rotation {
    
    public static int[] rotateArray(int[] arr, int m){
        int n = arr.length;
        int[] rotate = new int[n]; 
        System.arr_copy(arr, m, rotate, 0, n - m);
        System.arr_copy(arr, 0, rotate, n - m, m);
        return rotate;
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n];
        
        for(int i = 0; i < n; i++){
            num[i] = scanner.nextInt();
        }
        scanner.close();
        num = rotateArray(num, m);
        
        for(int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }      
}