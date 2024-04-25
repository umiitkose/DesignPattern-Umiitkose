package com.umiitkose.structural.flyweight;

/*
 * Flyweight : Çok sayıda küçük nesneyi etkin bir şekilde sağlamak için paylaşmayı kullan..
 *
 * Bazen çözümlerimizde ufak tefek çok sayıda nesne kullanmak zorunda kalırız.
 * Örneğin bir kitabın modellenmesinde kullanılabilecek sayfa paragraf satır kelime ve harf nesneleri bu cinstendir.
 * Örneğin oyunlardaki karakterler gibi.
 *
 * Bu türden uygulmalarda nesnelerin sayısı, dikkatsiz kullanım durumunda aşırı bir şekilde artabilir.
 *
 * Çok Nesne, bellek ve CPU problemleri oluştur.
 *   Nesne oluşturmak ve sonrasında GC ile toplamak masraflıdır.
 *
 * Bu durumlarda nesne sayısındaki artışın önüne geçmek amacıyla nesnlerin tekrar kullanımlarını sağlamak gerekir.
 *  */
/*
 * Çözüm : Flyweight :)
 * Nesne farklı bağlamlar tarafından ortaklaşa kullanılır ama nesne her bağlamda bağımsız olarak davranır.
 *
 * Flyweight nesnenin durumu ile ilgili aşağıdaki ayrım yapılır :
 *  İçsel ya da asıl durum (intrinsic state) -> Bu obje ne objesi sorusuna cevap arar ?
 *  Dışsal ya da ikincil/arizi durum (extrincsic state)
 *
 *  İçsel Durum -> flyweight nesnenin temsil ettiği asıl durumdur.
 *  Dışsal Durum -> içinde bulunduğu bağlam tarafından belirlenen durumdur.
 *
 *  Dışsal durum ne kadar basit ise sinek siklet nesnenin kullanımı o kadar kolaylaşır..
 *
 *
 * Örneğin : oyun yazılımında askerin giysisi içsel durum iken, koordinatları yani bulunduğu yer dışsal durumdur.
 * kitap modellemesinde harflerin gösterdiği karakterler içsel durumu, harfin sayfa, satır ve sütun bilgisi
 * dışsal durumunu gösterir.
 *
 *  Aynı anda kaç flyweight nesnesinin kullanılacağı, yaratılacak nesne sayısını belirleyen faktördür.
 *  Ne kadar az nesne yaratılırsa o kadar az bellek kullanımı sağlanmış olur.
 * */
/* Sinek Siklet nesneler bir factory Method yardımıyla oluşturulur.
 *   oluşturulan sinek siklet nesneler bir nesne havuzuna konabilir.
 * Oluşturulan sınırlı sayıda nesnenin içsel durumu belirlenir
 * Sonrasında oluşturulan nesneler farklı bağlamlarda tekrar kullanılır.
 * Bu amaçla nesnelerin dışsal durumları bağlama göre değiştirilir.
 * */
/* String ile birlikte Integer, Double, Boolean gibi Wrapper olan sınıflar flyweight olarak tasarlanmıştır. int 128 ilk değer
 * flyweight tasarlanmıştır. Misal == ile 2 wrapper nesne oluşturulunca ve içerisine 128 değeri atılırsa true gelir çünkü
 * 128 'e kadar tasarlanmıştır fakat 129 'u tanımlarsanız false gelecektir. Çok iyi..
 *
 * https://www.evrenbal.com/flyweight-tasarim-deseni-nedir/
 * https://refactoring.guru/design-patterns/flyweight/java/example
 *
 * https://www.buraksenyurt.com/post/Tasarc4b1m-Desenleri-FlyWeight
 * https://howtodoinjava.com/design-patterns/structural/flyweight-design-pattern/
 *
 * */
public class Main {

    public static void main(String[] args) {

        Integer deger1 = 100;
        Integer deger2 = 100;
        System.out.println(deger1 == deger2);

        Integer deger3 = 129;
        Integer deger4 = 129;

        System.out.println(deger3 == deger4);

    }

}