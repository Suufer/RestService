// ru/netology/services/RestServiceTest.java
package ru.netology.services;

public class RestServiceTest {
    public static void main(String[] args) {
        RestService restService = new RestService();

        int result1 = restService.calculate(10000, 3000, 20000);
        System.out.println("Expected result for example 1: 3");
        System.out.println("Actual result: " + result1);
        System.out.println();

        int result2 = restService.calculate(100000, 60000, 150000);
        System.out.println("Expected result for example 2: 2");
        System.out.println("Actual result: " + result2);
    }
}
