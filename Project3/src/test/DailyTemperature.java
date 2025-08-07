package test;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static int[] dailyTemperatures(int[] temperatures){

        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length;
        int [] result = new int[n];

        for( int i=n-1; i>=0; i--){

            while( !stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }

            if( !stack.isEmpty()){
                result[i] = stack.peek() -i;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};

        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

}
