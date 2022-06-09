$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AmazonArama.feature");
formatter.feature({
  "name": "Amazon Arama",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Nl02_Kullanici amazon sayfasinda arama yapar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazonArama"
    }
  ]
});
formatter.step({
  "name": "kullniciamazon sayfasina gider",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullanici s22 telefon aramasi yapar",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "kullanici sonucu ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});