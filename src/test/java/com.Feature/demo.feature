Feature: To Launch the Website

  Scenario Outline: To verify Sales & Puchases
    Given User Validates the Login Page
    And User clicks on the Login
    Then User validates the HomePage
    And User clicks on the Sales & Puchases

  Scenario Outline: To Create Return Order
    Given User clicks on Retun Orders
    Then User Validates the Return Orders Page
    And User Clicks on Create Return Order
    Then User Validates the Create Return Order Page
    And User clicks on the Accounts
    Then User validates Accounts
    And User cliks on Name

  Scenario Outline:
    Given User clicks on the Status
    Then User clicks on Completed
    And User CLicks on Sales Order
    Then User Validates the Sales Order
    And User clicks on Create
    Then User Validates the Create Sales Order
    And User clicks on Account
    And User Clicks on the Name
    And user clicks on Oppurtunity
    And User clicks on the laptop
    And User clicks on Save
    And User Clicks on Delivery Calender
    And User clicks on the DeliveryDate

  Scenario Outline: To verify Billing Address Working Succesfully
    Given User Enters the Street name "<Street11>"
    And User Enters the City name "<city1>"
    And User Enters the Country name "<Country2>"
    And User Enters the Postal Code "<Postal3>"
    And User clicks on the Warhouses
    Then User Validates the Warhouses
    And User Clicks on MainWarehouse

    Examples:
      | Street11 | city1              | Country2 | Postal3 |
      | nadk     | Vivekanandar theru | Dubai    | 00125   |

  Scenario Outline: To verify Ship From Address Working Succesfully
    Given User Enters the Ship Street name "<Street1>"
    And User Enters the Ship City name "<city2>"
    And User Enters the Ship Country name "<Country3>"
    And User Enters the Ship Postal Code "<Postal4>"

    Examples:
      | Street1           | city2 | Country3 | Postal4 |
      | vivekandhar theru | utah  | america  | 000126  |

  Scenario Outline: User Verify the DropDowns
    Given User clicks on the Billig contact
    Then User Validates the Contact
    And User clicks on Frederick
    And User clicks on the Shipping Contact
    And User clicks on Stanley
    And User clicks on the Tax
    Then User Validates the Tax
    And User clicks on the Standard
    And User clicks on Shipping Provider
    Then User Validates the Shipping Providers
    And User clicks on the Speedy
    And User clisk on Tax Checkbox
    And User enters Charges "101"
    And User click on the Assigned User
    Then User Validates the User
    And User clicks on Jack
    And User clicks on Teams
    Then User Validates the Teams
    And User clicks on Sales
    And User clicks on SaveButton
    And User clicks on Create Receipt
    Then User Validates the Create Receipt
    And User  clicks on Warhouse2
    Then User validates the Warhouse2
    And User clicks on the Repair Center
    And User clicks on CreateOption
    Then User Validates the SRO
