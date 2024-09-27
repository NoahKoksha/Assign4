package test;

import koksha.BigNumber;

public class tester {

    public static void main(String[] args) {

        BigNumber num1 = new BigNumber("123456789");
        BigNumber num2 = new BigNumber("987654321");
        BigNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum.getStr()); 

        BigNumber num3 = new BigNumber("100");
        BigNumber num4 = new BigNumber("30");
        BigNumber res1 = num3.mod(num4);
        System.out.println("Mod: " + res1.getStr()); 

        BigNumber num5 = new BigNumber("-100");
        BigNumber num6 = new BigNumber("30");
        BigNumber res2 = num5.mod(num6);
        System.out.println("Neg: " + res2.getStr());

    }
}
