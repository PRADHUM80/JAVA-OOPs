package MethodOverLoading;

// Same name of Method.
// Different number of Arguments..
// Same number of Arguments , but Different Data Types..
// Real Life :- Calculator
// add(int, int)
// add(int, int, int)
// add(double, double)



public class Main {
    
    // Method name Same = sum..
public static int sum(int a, int b){
    return a+b;
}

public static int sum(int a, int b, int c) {
    return a+b+c;
}

public static  String sum(String x, String y) {
    return x+y;
}

public static void main(String[] args) {
    System.out.println(sum(5,7));
    System.out.println(sum(5,6,7));
    System.out.println(sum("Ram","Kumar"));

}
}
