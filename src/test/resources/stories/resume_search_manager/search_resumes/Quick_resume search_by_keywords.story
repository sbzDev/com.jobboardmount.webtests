Meta:
@tag component: Quick resume search

Narrative:
In order to find resumes more easily
As a employer
I want to be able to perform quick search by keywords

Scenario: Quick resume search by one keywords
Given I login as Employer
And I am on the Quick resume search page
When I enter keywords My resume
And I press the Search button
Then I should see the resume list:
|Job title|Job headline|
|Fin Director|My resume headlines Advertising Banking & Finance|
