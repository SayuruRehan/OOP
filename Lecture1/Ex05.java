/*P rogram using nested for loops to print 
 1
 1, 2
 1, 2, 3
 1, 2, 3, 4
 */

class Ex05 {
    public static void main(String[] args) {

        int rows = 4;
        
        //outer loop
        for (int i = 1; i <= rows; ++i) {

            //inner loop
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + ", ");
            }
            System.out.println("");
        }
    }
}
