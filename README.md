# Buton-Kontrol-Paneli-Uygulamas-
İntellij İDİA ile geliştirilmiştir. Java dili kullanılmıştır.

Hazırladığım program, bir Swing kullanıcı arayüzü oluşturan bir uygulamayı temsil etmektedir. Uygulama, bir buton kontrol paneli içermektedir ve 
her bir butonun üzerine tıklanıldığında bir dizi işlem gerçekleştirmektedir. Bu işlemler butonların aktif/pasif durumu arasında geçiş yapma, belirli bir API uç noktasını temsil etme ve bu uç noktanın çalıştığını belirtme gibi özellikler bulunmaktadır. Ayrıca bir GraphQL API uç noktasının durumunu kontrol etmek için kullanılabilmektedir. Her bir buton, farklı bir API uç noktasını temsil eder ve tıklanıldığında durumu değiştirir. Eğer bir buton aktif hale getirilirse, uygulama bu uç noktanın çalıştığını ekrana yazdırır.( "Calisiyor ") Aynı zamanda, tıklanan butonun haricindeki diğer butonlar pasif duruma getirilir. Uygulamayı test etmek için aşağıdaki adımları izleyebiliriz;

1.) Kodu Derleme ve Çalıştırma:

Programınmızı bir Java derleyicisi kullanarak derlemeliyiz.
Oluşturulan ButonKontr.class (Sınıfını) çalıştırarak uygulamayı başlatıyoruz.

2.) Butonlara Tıklama:

Uygulama başladığında, bir pencere içinde 4x4 bir buton matrisi göreceksiniz.
Her bir buton, üzerine tıklanıldığında belirli bir API uç noktasını temsil etmektedir.

3.) Butonun Durumunu Değiştirme:

Butonlara tıkladığınızda, butonların durumu değişecektir. Aktif durumda olan bir buton, pasif hale getirilebilir ya da pasif durumdan aktif hale getirilebilir.

4.) API Uç Noktası Çalıştırma:

Aktif durumda olan bir butona tıkladığınızda, ekrana "Calisiyor: [API Uç Noktası]" yazısı çıkacaktır. Bu, ilgili API uç noktasının çalıştığını simgeler.

Uygulama, kullanıcı arayüzü üzerinden bir dizi buton aracılığıyla GraphQL API uç noktalarını kontrol etmek ve durumlarını görsel olarak yönetmek için kullanılabilir. Eğer bir GraphQL API'ye sahipseniz, bu uygulamayı API uç noktalarınızın durumunu kontrol etmek için kullanabilirsiniz.

GraphQL API Nedir ? 

GraphQL (Graph Query Language), 2012 yılında Facebook tarafından geliştirilen bir sorgu dilidir ve aynı zamanda bir veri sorgulama dilidir. GraphQL, özellikle modern web uygulamaları için geliştirilen bir API sorgu dilidir ve RESTful API'ların bazı sorunlarına çözüm sunar.

İşte GraphQL'in temel özellikleri ve avantajları:

+ Esnek Veri Sorgulama:

GraphQL, istemcilerin ihtiyaç duyduğu veriyi talep etmelerine izin verir. Bu, gereksiz veri transferini önler ve sadece istenen verinin alınmasını sağlar. Bu özellik, ağ trafiğini azaltır ve performansı artırır.

+ Tek Bir Endpoint:

GraphQL API'ları, tek bir endpoint sağlar. Bu, istemcilerin birden çok farklı endpoint'e gitmesine gerek kalmadan, tüm veriyi tek bir istekte alabilmelerini sağlar.
İstemci Tarafında Kontrol:

İstemciler, sadece ihtiyaç duydukları veriyi talep edebilirler. Bu, mobil cihazlar gibi kaynakları sınırlı olan istemciler için önemlidir ve gereksiz veri transferini önler.
Tip Sistem:

GraphQL, bir tip sistemi içerir. Bu, API'nin nasıl kullanılması gerektiği konusunda daha fazla belirginlik sağlar ve belirli veri türlerini tanımlar.

+ Gerçek Zamanlı Veri:

Abonelikler aracılığıyla, GraphQL API'ları gerçek zamanlı veri sağlama yeteneğine sahiptir. Bu özellik, canlı sohbet uygulamaları, anlık bildirimler ve diğer gerçek zamanlı uygulamalar için idealdir.

+ Geliştirici Dostu:

GraphQL, geliştiricilere geniş bir esneklik ve kontrol sağlar. Sorgu ve yanıt yapısı açık ve anlaşılırdır, bu da geliştirme sürecini kolaylaştırır.

+ Evrimci Geliştirme:

API'deki değişiklikler, geriye dönük uyumluluk sağlayarak ve sürümleme zorunluluğunu azaltarak daha kolay uygulanabilir. Yeni alanlar eklenebilir ve var olan alanlar kaldırılabilir, ancak istemciler sadece ihtiyaç duydukları veriyi almaya devam ederler.
GraphQL, özellikle büyük ve karmaşık uygulamalarda veri alışverişi ve yönetimi için etkili bir çözüm sunan modern bir teknolojidir. RESTful API'larla karşılaştırıldığında daha fazla esneklik ve verimlilik sağlamaktadır.

Ayrıca GitHub'a programın ekran çıktılarının yer aldığı bölümde eklenmiştir. ( Buton Uygulaması Çalıştırıkldığında.JPG ve Buton Aktifleştirildiğinde,JPG içerisinde)
