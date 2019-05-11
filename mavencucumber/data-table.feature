Feature: facebooklogin
Scenario: facebook login
Given i am on login page
When i enter username
| abhijeet |
And i enter "p012bk1" and click login
Then i can enter user account
