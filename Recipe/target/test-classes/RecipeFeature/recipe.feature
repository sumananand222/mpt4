Feature: Recipe

Scenario: Title Validation
Given User is on enquiry form page
When The page opens 
Then Title should be "Online Cooking Class Enquiry Form"

Scenario: Text Validation
Given User is on enquiry form page
When The page opens 
Then it should check whether a text "Online Cooking School" is present or not

Scenario: Hyperlink Validation
Given User is on enquiry form page
When User clicks on hyperlink "Download our Recipe class Brochure"
Then New Window should appear with another html page

Scenario: Text in msg file validation
Given User is on msg page
When Message page opens
Then it should check whether a text2 "Recipe class Brochure is sent to your registered mail id" is present or not

Scenario: Hyperlink Validation in msg
Given User is on msg page
When User clicks on hyperlink2 "Go Back to Registration"
Then the enquiry page should come again

Scenario: First Name Validation
Given User is on enquiry form page
When User enters invalid first name 
Then Ask the user to enter valid first name

Scenario: Last Name Validation
Given User is on enquiry form page
When User enters invalid last name
Then Ask the user to enter valid last name

Scenario: Email Validation
Given User is on enquiry form page
When User enters invalid email
Then Ask the user to enter valid email

Scenario: Mobile Validation
Given User is on enquiry form page
When User enters characters
Then Display message to enter numerics

Scenario: Mobile Validation2
Given User is on enquiry form page
When User enters invalid mobile
Then Display message to enter 10 digit mobile

Scenario: Enquiry Validation
Given User is on enquiry form page
When User enters invalid enquiry
Then Display message enter valid enquiry

Scenario: Submit Validation
Given User is on enquiry form page
When User clicks on "enquire now button"
Then Message should come in alert box 
And Text should come in new window