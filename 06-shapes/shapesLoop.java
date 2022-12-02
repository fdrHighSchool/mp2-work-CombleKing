package ClassProjects;

public class shapesLoop {
    
    public static void main(String[] args) {
        square(9);
        System.out.println();
        rectangle(4, 18);
        System.out.println();
        rightTriangle(9);
        System.out.println();
        triangle(5);

    }


    public static void square (int size) {

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rectangle(int width, int length) {

        for (int row = 0; row < width; row++) {
            for (int col = 0; col < length; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
    public static void rightTriangle(int height) {

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void triangle(int size) {
         
        for(int i=0; i<=size; i++) {
        	for(int j=i; j<=size; j++) {
              System.out.print(" ");
        	} for(int j=1;j<=i;j++) {
              System.out.print("* ");
        		}
        		System.out.println("");
    		}	
	}
    }



// rectangle, 2 outputs (col and row)

// right triangle, one output, 
// size 3 triangle :
// *
// * * 
// * * *

//triangle, one output
//       *
//     *   *
//   *   *   *