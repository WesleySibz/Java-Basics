public class Main {

    //The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
    public static void main(String[] args) {
        int x=5,y=10;
        double j= 64,k = 120;
        //The Math.max(x,y) method can be used to find the highest value of x and y:
        //The Math.min(x,y) method can be used to find the lowest value of x and y:
        //The Math.sqrt(j) method returns the square root of x:
        //The Math.abs(x) method returns the absolute (positive) value of x:
        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(j));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        /**To get more control over the random number,
         * for example,
         * if you only want a random number between 0 and 100,
         * you can use the following formula:*/
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

    }
}