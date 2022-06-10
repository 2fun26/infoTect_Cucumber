Feature: Google Arama
  @GoogledaInfo
  Scenario: Nl01_Kullanici googleda arama yapar
    Given kullanici google sayfasina gider
    And   kullanici guvenlik duvarini gecer
    And   kullanici infotech aramasini yapar
    Then  kullanici sayfa basligini kontrol eder


    #Given, When,And,But,Then kullanilabilir, senaryomuzun adimlari
    # genellikle Given ile baslar Then ile biter

  @GoogleArmutArama
  Scenario: omer
    Given kullanici google sayfasina gider
    And kullanici guvenlik duvarini gecer
    And kullanici googleda armut aratir
    Then kullanici sayfa basligini kontrol eder