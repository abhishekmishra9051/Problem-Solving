import java.util.Scanner;


public class Pattern {
/*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
*/
    static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
/*
        *
        * *
        * * *
        * * * *
        * * * * *
*/
    static void print1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
/*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

 */
    static void print2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
/*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
*/
    static void print3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
/*
         * * * * *
         * * * *
         * * *
         * *
         *
 */
    static void print4(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
/*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
*/
    static void print5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
/*
             *
            ***
           *****
          *******
         *********
*/
    static void print6(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++)
                System.out.print(" ");
            //star
            for(int j=0; j<2*i+1; j++)
                System.out.print("*");
            //space
            for(int j=0; j<n-i-1; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
/*
             *********
              *******
               *****
                ***
                 *
 */
    static void print7(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<i; j++)
                System.out.print(" ");
            //star (2*5-(2*0+1) => (10-1) => 9, 7, 5, 3, 1
            for(int j=0; j<2*n-(2*i+1); j++)
                System.out.print("*");
            //space
            for(int j=0; j<i; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
/*
             *
             **
             ***
             ****
             *****
             ****
             ***
             **
             *
*/
    static void print8(int n){
        for(int i=1; i<=2*n-1; i++){
            int star = i;
            if(i>n) star = 2*n-i;
            for(int j=1; j<=star; j++)
                System.out.print("*");
            System.out.println();
        }
    }
/*
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
 */
    static void print9(int n){
        int stars = 1;
        for(int i=0; i<n; i++){
            if(i%2 == 0) stars = 1;
            else stars = 0;
            for(int j=0; j<=i; j++){
                System.out.print(stars+" ");
                stars = 1 - stars;
            }
            System.out.println();
        }
    }
/*
            1        1
            12      21
            123    321
            1234  4321
            1234554321
*/
    static void print10(int n){
        int space = 2*(n-1);
        for(int i=1; i<=n; i++){
            // Number
            for(int j=1; j<=i; j++)
                System.out.print(j);
            //Space
            for(int j=1; j<=space; j++)
                System.out.print(" ");
            //Number
            for(int j =i; j>=1; j--)
                System.out.print(j);
            System.out.println();
            space -= 2;
        }
    }
/*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
*/
    static void print11(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
/*
            A
            A B
            A B C
            A B C D
            A B C D E
*/
    static  void print12(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<= 'A'+i; ch++)
                System.out.print(ch+" ");
            System.out.println();
        }
    }
/*
            A B C D E
            A B C D
            A B C
            A B
            A
*/
    static  void print13(int n){
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<= 'A'+(n-i-1); ch++)
                System.out.print(ch+" ");
            System.out.println();
        }
    }
/*
            A
            B B
            C C C
            D D D D
            E E E E E
*/
    static void print14(int n){
        for(int i=0; i<n; i++){
            char ch = (char) ('A' + i);
            for(int j=0; j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
/*
                A
               ABA
              ABCBA
             ABCDCBA
            ABCDEDCBA
*/
    static void print15(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<n-i-1; j++)
                System.out.print(" ");
            //star
            char ch ='A';
            int breakPoint = (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++) {
                System.out.print(ch);
                if(j <= breakPoint) ch++;
                else ch--;
            }
            //space
            for(int j=0; j<n-i-1; j++)
                System.out.print(" ");
            System.out.println();
        }
    }
/*
            E
            DE
            CDE
            BCDE
            ABCDE
*/
    static void print16(int n){
        for(int i=0; i<n; i++){
            for(char ch = (char) ('E'-i); ch<='E'; ch++)
                System.out.print(ch);
            System.out.println();
        }
    }
/*
             **********
             ****  ****
             ***    ***
             **      **
             *        *
             *        *
             **      **
             ***    ***
             ****  ****
             **********
*/
    static void print17(int n){
        int space = 0;
        for(int i=0; i<n; i++){
            //  stars
            for(int j=1; j<=n-i; j++)
                System.out.print("*");
            // spaces
            for(int j=0; j<space; j++)
                System.out.print(" ");
            // stars
            for(int j=1; j<=n-i; j++)
                System.out.print("*");
            space += 2;
            System.out.println();
        }
         space = 2*n-2;
        for(int i=1; i<=n; i++){
            //  stars
            for(int j=1; j<=i; j++)
                System.out.print("*");
            // spaces
            for(int j=0; j<space; j++)
                System.out.print(" ");
            // stars
            for(int j=1; j<=i; j++)
                System.out.print("*");
            space -= 2;
            System.out.println();
        }
    }
/*
                 *        *
                 **      **
                 ***    ***
                 ****  ****
                 **********
                 ****  ****
                 ***    ***
                 **      **
                 *        *
 */
    static void print18(int n){
        int space = 2*n-2;
        for(int i=1; i<=2*n-1; i++){
            int star = i;
            if(i > n) star = 2*n-i;
            //star
            for(int j=1; j<=star; j++)
                System.out.print("*");
            //Space
            for(int j=1; j<=space; j++)
                System.out.print(" ");
            //star
            for(int j=1; j<=star; j++)
                System.out.print("*");
            System.out.println();
            if(i<n) space -=2;
            else space +=2;
        }
    }
/*
             *****
             *   *
             *   *
             *   *
             *****
 */
    static void print19(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
/*
            555555555
            544444445
            543333345
            543222345
            543212345
            543222345
            543333345
            544444445
            555555555
*/
    static void print20(int n){
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int down  = (2*n-2) -i;
                System.out.print(n-Math.min(Math.min(top,down) , Math.min(left,right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=0; i<testCase; i++){
            int n = sc.nextInt();
            print20(n);
        }
    }
}
