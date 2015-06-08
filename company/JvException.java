package com.company;

/**
 * Created by con-ccrnyc1lzb on 6/3/2015.
 */
public class JvException{

    public static void main(String []args){
        int d = 0;
        int n = 20;
        int fraction;

        try{
            fraction = n/d;
            System.out.println("Did you see me :text");
        }
        catch(ArithmeticException e){
            System.out.println("In the catch block due to Exception "+e+" um yea");
            //shit();
        }
    }

    public void shit(){
        System.out.println("why not try agaim yea");
    }
}