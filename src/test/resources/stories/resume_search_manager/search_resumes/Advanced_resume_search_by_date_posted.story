Meta:
@tag component:Advanced resume search

Narrative:
Both candidate resume profiles and attached files are keyword-searchable.
Boolean logic is AND – all keywords are compulsory.
Job board owner can configure the software to have specific fields and attached resume files keyword-searchable via job board software admin.
Employer can also select resumes by industry category, job type, location or status.

Scenario: Advanced resume search only by date posted
Given I login as Employer
And I am on the Advanced resume search page
When I select date posted 6 Months or less
And I press the Search button
Then Should see 1 found resumes
