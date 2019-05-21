import java.lang.Object;

public class JenkinsTest {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        System.out.println("Table of 2 : ");
        for(int num: arr){
            System.out.println(2 + " * " + num + " = " + (2*num));
        }
    }

}