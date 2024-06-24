package day27_Maps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Maps02 {
    public static void main(String[] args) {


        /*
1) Treemap'ler entry'leri natural order'a gore siraya koyar, bu yuzden yavastirlar
2) Treemap'ler thread-safe ve synchronized degildir.
3) Treemap'lerin key'lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
ama value kisimlarinda istediginiz kadar kullanabilirsiniz
4) Treemapler key'e bakarak siralama yapar
 */

        TreeMap<String,Integer>countryPopulation=new TreeMap<>();
        countryPopulation.put("Germany",830000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",830000000);
       //countryPopulation.put(null.18000000);
        countryPopulation.put("Italy",null);
        countryPopulation.put("France",null);
        System.out.println(countryPopulation);
        System.out.println("-------------------------");


/*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.

**ornegin,bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir.
yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
restoranın sipariş hazırlama sırasını belirler.

Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
benzeri senaryolarda da kullanılabilir.
Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.*/


        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("Ali",25);
        lhm.put("Can",18);
        lhm.put("Mehmet",30);

       //LinkedHashMap'i dolasma (ekleme sirasina gore)

        for (Map.Entry<String,Integer>entry: lhm.entrySet()){
            System.out.println(entry);
        }






    }}
