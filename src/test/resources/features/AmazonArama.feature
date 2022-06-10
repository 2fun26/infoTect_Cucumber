Feature: Amazon Arama

  Background: oncesinde calistirmak istedigimiz metodlari buraya yaziyoruz
    Given kullanici amazon sayfasina gider

  @amazonArama
  Scenario: Nl02_Kullanici amazon sayfasinda arama yapar
   # Given kullanici amazon sayfasina gider
    And   kullanici s22 telefon aramasi yapar
    Then  kullanici sonucu ekrana yazdirir

    #Birden fazla senaryo ekleyebilirsiniz

  @amazonCameraArama
  Scenario: Nl03_kullanici amazonda arama ypar
    #Given kullanici amazon sayfasina gider
    And   kullanici camera aramasi yapar
    Then  kullanici sonucu ekrana yazdirir