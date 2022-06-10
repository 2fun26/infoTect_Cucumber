Feature: Ebayde Urun Arama
  Scenario: NL06_Kullanici Ebayde Urun Arar
    Given kullanici ebay sayifasina gider
    And   kullanici cerezleri kabul eder
    And   kullanici arama kutusuna mug yazar
    Then  kullanici arama sonucunu yazdirir