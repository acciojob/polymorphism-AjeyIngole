package com.driver;


public class Main {

    public static void main(String[] args) {
        Product p = new Product();
         int ans =p.product(13,70);

         int ans1 = p.product(5,7,11);

         double ans2 = p.product(17.0,28.0);

         System.out.println(ans +" "+ans1+" "+ans2);
    }

    public static class Product {

        public int product(int x,int y)
        {
            return x*y;
        }

        public int product(int x,int y,int z)
        {
            return x*y*z;
        }

        public double product(double x,double y)
        {
            return x*y;
        }

    }
}

