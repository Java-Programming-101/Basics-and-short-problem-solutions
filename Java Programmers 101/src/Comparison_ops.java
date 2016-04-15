

public class Comparison_ops {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)// comparison operator to evaluate if two values have the same value (note you should not/cannot use == to compare strings, you should use .equals())
            System.out.println("value1 == value2");
        if(value1 != value2)// comparison operator to evaluate if two values are NOT the same value.
            System.out.println("value1 != value2");
        if(value1 > value2)//comparison operator to evaluate if one value is greater than the other.
            System.out.println("value1 > value2");
        if(value1 < value2)//comparison operator to evaluate if one value is smaller than the other.
            System.out.println("value1 < value2");
        if(value1 <= value2)//comparison operator to evaluate if the first value is less than or equal to the 2nd value. 
            System.out.println("value1 <= value2");
        
    /*
     * Note that the above comparisons use if statements. The structure of an is statement is as follows
     * if (some condition is true){
     *      then run this block of statements. 
     * } 
     * 
     */
       

    }


}
