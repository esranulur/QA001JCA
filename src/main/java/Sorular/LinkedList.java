package Sorular;

import day24_collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {


        /*
           /*
kullanıcıdan istedigi kadar deger girmesini isteyiniz ve en son girdigi degerleri bir array'e atayınız
 */

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        String input;

        System.out.println("Değer girmeyi bitirmek için 'c' tuşuna basınız.");

        while (true) {
            System.out.print("Lutfen bir String değer giriniz: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;

            }inputs.add(input);
            }
String arr []=inputs.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        }}