Feature: To search product on the demosite
	Background:
		Given I am on the osCommerce homepage
	@search
	Scenario: To search an available product on the site
		When I type "Unreal123" in the search text box
		When I click on the search icon
		Then I should see "Unreal Tournament" link on the page
		Then I should close the browser
	
	Scenario: To search an unavailable product on the site
		When I type "xyz" in the search text box
		When I click on the search icon
		Then I should see "There is no product that matches the search criteria" text on the page
		Then I should close the browser
	