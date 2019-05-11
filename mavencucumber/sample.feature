Feature: facebook login
Scenario Outline: facebook login scenario
Given i am on login page
When i enter "<username>"
And i enter "<password>" and click login
Then i can enter user account

Examples:
| username | password |
| abhi     | 6520     |
| abh      | 123      |