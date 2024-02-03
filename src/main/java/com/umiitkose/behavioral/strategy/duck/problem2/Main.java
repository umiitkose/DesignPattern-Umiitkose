package com.umiitkose.behavioral.strategy.duck.problem2;

public class Main {

    /**  Buradaki problem şudur, alt sınıf sayısı arttıkça ve fly ya da quack metotlarında bir değişiklik yapılması
     *   istenirse o zaman problemin büyüklüğü ortaya çıkıyor..
     *
     *
     *   Değiştirmemiz gerektiğinde, mevcut kod üzerinde mümkün olan en az etkiyle bunu yapabilmemiz için bir yazılım geliştirmenin bir yolu olsaydı,
     *   rüya gibi olmaz mıydı ? Kodu yeniden çalışmak için daha az, programın daha havalı şeyler yapmasını sağlamak için daha fazla zaman harcayabiliriz.
     *
     *
     *  The one constant in software development !!! ---> CHANGE !!!
     *
     *  1. Design Prensibi : Identify the aspects of your application that vary and separate them from what stays the same.
     *  Uygulamanızın değişen yönlerini tanımlayın ve bunları aynı kalanlardan ayırın..
     *
     *  Take what varies and “encapsulate” it so it won’t affect the rest of your code. The result? Fewer unintended consequences from
     *  code changes and more f lexibility in your systems!
     *
     * In other words, if you’ve got some aspect of your code that is changing, say with every new requirement, then you know you’ve got a behavior that needs to be pulled out and separated from all the stuff that doesn’t change. Here’s another way to think about this principle: take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don’t. As simple as this concept is, it forms the basis for almost every design pattern. All patterns provide a way to let some part of a system vary independently of all other parts.
     * Başka bir deyişle, kodunuzun değişen bir yönü varsa, diyelim ki her yeni gereksinimle, o zaman çıkarılması ve değişmeyen tüm şeylerden ayrılması gereken bir davranışınız olduğunu bilirsiniz. . İşte bu ilke hakkında düşünmenin başka bir yolu: Değişen parçaları alın ve bunları içine alın, böylece daha sonra değişmeyenleri etkilemeden değişen parçaları değiştirebilir veya genişletebilirsiniz. Bu konsept ne kadar basit olursa olsun, hemen hemen her tasarım deseninin temelini oluşturur. Tüm desenler, bir sistemin bir bölümünün diğer tüm parçalardan bağımsız olarak değişmesine izin vermenin bir yolunu sağlar.
     *
     * 2. Design Principle : Program to an interface, not an implementation
     *
     *
     *
     *  */


}
