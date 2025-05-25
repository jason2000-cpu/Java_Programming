

// public class main
// {
//     public static void main(String a[]) 
//     {
//         // int nums[] = {3, 7, 2, 4};
//         int nums[] = new int[4];

//         nums[0] = 3;
//         nums[1] = 4;
//         nums[2] = 5;
//         nums[3] = 6;

//         for (int i = 0; i < nums.length; i++) 
//         {
//             System.out.println(nums[i]);
//         }

        
//     }
// }


// Multi-dimensional array

// public class main {
//     public static void main(String a[])
//     {
//         int nums[][] = new int[3][4];

//         // Generating random values and assingning them to the 2D Array

//         for (int i = 0; i < nums.length; i++) {
//             for(int j = 0; j < nums[i].length; j++) 
//             {
//                 nums[i][j] = (int)(Math.random() * 10);
//             }
//         }

//         // for (int i = 0; i < nums.length; i++)
//         // {
//         //     for (int j = 0; j < nums[i].length; j++)
//         //     {
//         //         System.out.print(nums[i][j]  + " ");
//         //     }
//         //     System.out.println();
//         // }


//         // Enhanced for loop

//         for (int n[] : nums) 
//         {
//             for (int m: n) 
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();

//         }
//     }
// }


/**
 * Jagged Arrays - multidimensional arrays that have dynamic
 *  number of internal arrays
 */

public class main {
    public static void main(String a[])
    {
        int nums[][] = new int[3][]; //jagged array

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];


        for(int i=0; i < nums.length; i++) {
            for(int j=0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int n[] : nums) {
            for(int m: n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}