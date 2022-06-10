@amazon  #bu sayfadaki tum testleri calistirmak icin FEATURE' nin uzerine bir tag yazmak zorundayiz
  Feature: Amazon Urun Arama

    Background: kullanici bircok urun arar
      Given kullanici amazon sayfasina gider

      @AmazonBisiklet
    Scenario: NL04_kullanici amazon da urun aramasi yapar
      #Given kullanici amazon sayfasina gider
      And   kullanici arama kutusuna "bisiklet" yazar ve arar
      Then  kullanici sonucu ekrana yazdirir

        @AmazonDrone
    Scenario: NL04_kullanici amazon da urun aramasi yapar
      #Given kullanici amazon sayfasina gider
      And   kullanici arama kutusuna "drone" yazar ve arar
      Then  kullanici sonucu ekrana yazdirir