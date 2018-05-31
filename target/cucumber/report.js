$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "As a user I want to be able to perform a custom search, so I can find what I\u0027m looking for",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Perform a Search based on custom keywords",
  "description": "",
  "id": "search;perform-a-search-based-on-custom-keywords",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am in the WestMarine homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type \"boat shoes\" in the search field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see results for the item searched",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmInTheWestMarineHomepage()"
});
formatter.result({
  "duration": 15420444029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "boat shoes",
      "offset": 8
    }
  ],
  "location": "MyStepdefs.iTypeInTheSearchField(String)"
});
formatter.result({
  "duration": 1452213013,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnTheSearchButton()"
});
formatter.result({
  "duration": 5055816546,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeResultsForSearchedItem()"
});
formatter.result({
  "duration": 68856557,
  "status": "passed"
});
});