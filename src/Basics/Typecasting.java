package Basics;

public class Typecasting {
    public static void main(String[] args) {
        //Lets see about Type casting
        System.out.println("The below output is example of Type casting from 10.8f into int");
        // int a = 10.8f; -> Its gives the error
        int a= (int)(10.8f); // Here, it wont gives error  Bcoz, we are typecasting it into int
        System.out.println(a); // It compress the 10.8f into 10 as output

        // Automatic type Convertion
        System.out.println("Lets see Automatic type Convertion");
        System.out.println("I have given as int i = 'a' and The Output is");
        int a1 = 'a';
        System.out.println("The output of int i='a' is "+a1);

        // We can also print other languages too
        System.out.println("வணக்கம்");
        System.out.println("امام جعفر");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
            // float + int -double =double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
