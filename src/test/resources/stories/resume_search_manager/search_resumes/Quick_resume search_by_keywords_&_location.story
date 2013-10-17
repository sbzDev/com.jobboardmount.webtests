Meta:
@tag component:Quick resume search

Narrative:
In order to find resumes more easily
As a employer
I want to be able to perform quick search by both keywords and location

Scenario: Quick resume search by keywords and location
Given I login as Employer
And I am on the Quick resume search page
When I enter keywords My resume
And I enter location United States
And I press the Search button
Then Should see message No resumes found

Scenario: Quick resume search by default keywords & location (empties)
Given I login as Employer
And I am on the Quick resume search page
When I press the Search button
Then I should see the resume list:
|Job title|Job headline|
|Fin Director|My resume headlines Advertising Banking & Finance|
|Accountant|ACCA, CIMA New York Banking & Finance|

