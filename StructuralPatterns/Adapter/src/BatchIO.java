public class BatchIO {
    void dosyaOlusturma(String dosyaYolu){
        System.out.println("BatchIO dosya olusturuldu: "+ dosyaYolu);
    }

    void klasorOlusturma(String dosyaYolu){
        System.out.println("BatchIO klasor olusturuldu: "+ dosyaYolu);
    }

    void kopyala(String kaynak, String hedef){
        System.out.println(kaynak + " tan "+ hedef + " e kopyalandi.");
    }
}
