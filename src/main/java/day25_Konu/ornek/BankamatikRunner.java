package day25_Konu.ornek;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BankamatikRunner {
    public static void main(String[] args) {

Bankamatik b1=new Bankamatik("esra, 12345" +
        "ea");


Bankamatik b2=new Bankamatik("mira,1233," +
        "ss");

        Queue<Bankamatik> bankamatiks=new LinkedList<>();


        bankamatiks.add(b1);
        bankamatiks.add(b2);
        System.out.println(bankamatiks);

    }}
