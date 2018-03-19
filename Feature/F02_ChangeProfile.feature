Feature: Test the ChangeProfile Feature of the application
	Background:
		Given I am on the osCommerce homepage
	Scenario: Change Profile scenario using the last name
		When I click on the "My Account" link
		When I am logged in using username "user@user.com" and password "USER123"
		When I click on the Sign in button
		Then I should see "Log Off" link on page
		When I click on "View or change my account information." link
		When I type in "Fernandes" in the lastname textbox
		When I click on the Continue button
		Then I should see " Your account has been successfully updated." on the screen
		When I will click on the "Log Off" link
		When I will click on the "Continue" button
		Then I should see "Welcome to 5ElementsLearning" text on page. 
		Then I should close the browser
		
	Scenario: Change Profile scenario using the first name
		When I click on the "My Account" link
		When I am logged in using username "user@user.com" and password "USER123"
		When I click on the Sign in button
		Then I should see "Log Off" link on page
		When I click on "View or change my account information." link
		When I type in "Thomas" in the firstname textbox
		When I click on the Continue button
		Then I should see " Your account has been successfully updated." on the screen
		When I will click on the "Log Off" link
		When I will click on the "Continue" button
		Then I should see "Welcome to 5ElementsLearning" text on page. 
		Then I should close the browser
 