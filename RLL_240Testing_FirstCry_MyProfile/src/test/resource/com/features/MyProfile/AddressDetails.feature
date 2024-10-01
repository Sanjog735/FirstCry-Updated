Feature: Perform edit operation on My Address Book of firstcry application

  Scenario Outline: Adding Address details Successfully with valid credentials
    Given The user is in the firstcry home page3
    When The user clicks on login3
    And The user enter the mobile num3
    Then click on continue3
    And click on submit link3
    Then click on My Account3
    And click on My Profile3
    Then click on my address book
    And user enter <name> in address field
    And user enter <houseNumber> in house number
    And user enter <streetAddress> in street address
    And user enter <landMark> in landmark
    And user enter <pincode> in pincode
    And user enter <mobileNumber> in mobile number
    And user enter <telRegion> in telephone region
    And user enter <telNumber> in telephone number
    When user click on save button
    Then users address  details successfully saved

    Examples: 
      | name   | houseNumber                        | streetAddress     | landMark                                  | pincode | mobileNumber | telRegion | telNumber  |
      | Raghav | PK458 ,Kharadi , Pune , Maharastra | Pune , Maharastra | kharadi, pune ,near ola electric showroom |  411014 |   8745874584 |        11 | 8569585896 |
