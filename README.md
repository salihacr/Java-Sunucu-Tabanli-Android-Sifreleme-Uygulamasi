<h1 align="center">
  Java Basit Sunucu Tabanlı Soket Programlama ile Şifreleme Uygulaması
</h1>

Java Socket Programlamaya geçmeden önce socket kavramına değinecek olursam; Socket dendiği  zaman  birçok kişinin zihninde bilgisayarlarımızın üzerinde bulunan somut bir donanımsal parça canlanıyor. Aslında socket; Bilgisayarların ağ üzerinden haberleşmesini sağlayan yapılardır. Tabi bunun için bazı adresler kullanmak zorundayız. Bunlardan ilki bilgisayarın IP adresi. IP adresi yardımıyla hangi cihazla haberleşeceğimizi belirleriz. Haberleşilecek cihaza ulaşıldığı zaman, bu bilgisayar üzerinde hangi programla iletişime geçeceğimizi belirtmemiz gerekiyor . İşte burada bilgisayarlarımızın portları devreye giriyor. Yani iki bilgisayar birbiriyle bu iki yapı vasıtasıyla haberleşir (IP adresi ve Port Numarası).   Yani socket bilindiğinin aksine donanımsal bir parça değil IP adresi ve port numarasından oluşan bir yapıdır. 

Geliştirilen projede android mobil istemci cihaz üzerinden gönderilen verinin, yerel sunucuda şifrelenip tekrardan istemciye gönderilme işlemi gerçekleştirilmiştir.


<h2 align="center">
  Yazılım Çerçevesi
</h2>
<b>Program Amacı</b>
  <p>Mobil Cihaz üzerinden gönderilen verinin sunucu üzerinde şifrelenip mobil cihaza şifrelenmiş veriyi aktarılması</p>
<b>Programlama Dili</b>
  <p>Java SE</p>
<b>Sunucu Platformu</b>
  <p>Java SE tabanlı Netbeans IDE üzerinden Socket Kütüphanesi ile oluşturulan Yerel bir Sunucu</p>
<b>İstemci Platformu</b>
  <p> Android Studio üzerinden sanal mobil cihaz yani istemci ile yine Socket Kütüphanesi üzerinden sunucuya erişim</p>

<h2 align="center">
  UYGULAMA GÖRSELLERİ
</h2>

<p align="center">
  <h3>Java Sunucu Yazılımı</h3>
  <img src="https://github.com/salihacr/Java-Sunucu-Tabanli-Android-Sifreleme-Uygulamasi/blob/master/Client-Server/java.PNG">
</p>

<p align="center">
  <h3>Android İstemci Yazılımı</h3>
  <img src="https://github.com/salihacr/Java-Sunucu-Tabanli-Android-Sifreleme-Uygulamasi/blob/master/Client-Server/android.PNG">
</p>


<p align="center">
  <h3>Veri İletişimi ile Giden Verinin Gerçek Zamanlı Olarak Şifrelenmesi</h3>
  <img src="https://github.com/salihacr/Java-Sunucu-Tabanli-Android-Sifreleme-Uygulamasi/blob/master/Client-Server/TAMAMI.PNG">
</p>
