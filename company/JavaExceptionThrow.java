package com.company;

/**
 * Created by con-ccrnyc1lzb on 6/4/2015.
 */
class JavaExceptionThrow {

    public static void main(String[] args) {
        try {
            //throw new MyCustException(2);
            MyCustException obj = new MyCustException(2);
            obj.toString();
            throw obj;
            //throw is used to create a new exception and throw it.
            //still don't know what that means*/
        } catch (obj val) {
            //System.out.println(val);
        }
    }

    static class MyCustException extends Exception {
        int a;

        MyCustException(int val2) {
            a = val2;
        }

        public String toString() {
            return ("Exception Number Thanos =" + a);
        }
    }
}