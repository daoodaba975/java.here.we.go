public class Class_13 {

    static void Triangle(int x, int y, int z) 
    { 

        if (x == y && y == z ) {
            System.out.println("Triangle equilateral");
        }
        else if (x == y || y == z || z == x ) { 
            System.out.println("Triangle isocele");
        }
        else if (x != y || y!= z || z != x) {
            System.out.println("Triangle scalene");
        }
        else if (x + y < z || x + z < y || y + z > x) {
            System.out.println("N'est pas un triangle");
        }
    } 

    public static void main(String[] args) {
        { 

            int x = 1, y = 1, z = 30; 

            Triangle(x, y, z); 
        } 
    } 
}