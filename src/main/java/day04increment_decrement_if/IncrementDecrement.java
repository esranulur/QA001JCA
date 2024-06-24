package day04increment_decrement_if;

public class IncrementDecrement {

    public static void main(String[] args) {
        //------------Increment
        int a = 5;
        a = a+2;//a iki defa yazilmistir ve bir tekrar soz konusu
        System.out.println(a);//7
        a += 2;// a = a+2;
        System.out.println(a);//9
//------------Decrement
        int c = 10;
        c = c-3;
        System.out.println(c);//7
        c -= 4;//c = c-4;
        System.out.println(c);//3
//------------Carpma
        int d = 7;
        d = d*2;
        System.out.println( d);//14
        d *= 2;//d=d*2
        System.out.println(d);//28
//------------Bolme
        int e = 24;
        e = e/2;
        System.out.println(e);//12
        e/=2;//e=e/2
        System.out.println(e);
//----------------------------1 ile increment cok kullanılır
        int f= 13;
        f=f+1;
        System.out.println(f);
        f+=1;
        System.out.println(f);
        f++;//1 ile arttırma işlemi yapılıyor ise burasi kullanılır
        System.out.println(f);
//---------------- 1 ile decrement ise
        int h = 19;
        h=h-1;
        System.out.println(h);
        h-=1;
        System.out.println(h);
        h--;//1 ile azaltma islemi uygulanıyor ise burasi kullanılır
        System.out.println(h);//16
//post-increment(i++), pre-increment(++i)
        int i = 10;
        int k = i++;
        System.out.println(k);//neden 10 olarak cıktı post increment artirilmadan once konuldu
        System.out.println(i);

        int m= 20;
        int n= ++m;//n=21 oldu pre increment once artıp sonra deger atamasi yapıldı
        System.out.println(n);
        System.out.println(m);

//post-decrement(i--),pre-decrement(--i)
        int p=17;
        int r=p--;
        System.out.println(r);//17
        System.out.println(p);//16

        int s=20;
        int t=--s;
        System.out.println(t);//19
        System.out.println(s);//19
    }
}
