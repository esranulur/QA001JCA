package day25_Konu;

import java.util.PriorityQueue;

public class Queue02 {
    public static void main(String[] args) {
//-------------------------
// PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
// öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
// Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.


//Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
// sayılar kendi doğal sıralamalarına göre önceliklendirilir.

        //Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
// priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
// Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.


        PriorityQueue<String> acilSirasi=new PriorityQueue<>();
        acilSirasi.add("Mehmet");
        acilSirasi.add("Mahmutt");
        acilSirasi.add("Ekrem");
        acilSirasi.add("oya");
        acilSirasi.add("Tansu");
        System.out.println(acilSirasi);



    }}
