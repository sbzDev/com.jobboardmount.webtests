Meta:
@tag component:Quick resume search

Narrative:
In order to find resumes more easily
As a employer
I want to be able to perform quick search by location

Scenario: Quick resume search only by location
Given I login as Employer
And I am on the Quick resume search page
When I enter location United States
And I press the Search button
|Job title|Job headline|
|Accountant|ACCA, CIMA New York Banking & Finance|