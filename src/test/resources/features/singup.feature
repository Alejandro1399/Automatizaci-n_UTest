#Author: Nicolas Restrepo

@stories
Feature: Utest singup
  As a user, I want to automate the registration process of a user in screenplay pattern at  Utest
  @scenario1
  Scenario: complete registration form
    Given given than Alejandro wants register new user at utest
    When he fill the fields
      | strFirst_name | strLast_name | strEmail_address    | strMonth | strDay | strYear | strLanguages | strCity | strPostal_Code | strCountry | strDevice | strModel   | strSystem  | strPassword           | strConfirmPassword    |
      | Nicolas       | Restrepo     | alejoft14@gmail.com | October  | 13     | 1999    | Spanish      | Pasto   | 520006         | Colombia   | Motorola  | One Fusion | Android 10 | NicolasAlejandro1999@ | NicolasAlejandro1999@ |
    Then then he create a new user and redirects to home page
      | strFinalText   |
      | Complete Setup |