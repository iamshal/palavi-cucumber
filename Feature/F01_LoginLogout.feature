Feature: Test the LoginLogout Feature of the application
	Background:
		Given I am on the osCommerce homepage
	@login
	Scenario Outline: Valid login logout scenario
		When I click on the "My Account" link
		When I am logged in using username <user> and password <passwd>
		When I click on the Sign in button
		Then I should see "Log Off" link on page
		When I will click on the "Log Off" link
		When I will click on the "Continue" button
		Then I should see "Welcome to 5ElementsLearning" text on page. 
		#Then I should close the browser
	Examples:
	|user|passwd|
	|"def@xyz.com"|"USER123"|
	|"abc@def.com"|"USER123"|
	
	Scenario: Invalid login logout scenario
		When I click on the "My Account" link
		When I am logged in using username "user@user.com" and password "USER123"
		When I click on the Sign in button
		Then I should not see "My Account Information" on page 
		#Then I should close the browser

 