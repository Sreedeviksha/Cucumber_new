Feature: Booking functionality of Adactin Application 

Background:
	Given User launches the adactin application
	When User log into the application

@SmokeTest 
Scenario Outline: Verify the user is able to login the application 
	Given User launches the application 
	When User enters the valid "<username>" in the username field 
	And User enters the valid "<password>" in the password field 
	And User clicks on the login button 
	Then User verifies whether HomePage navigates to Search Hotel Page 
	
	Examples: 
		|username|password|
		|AAA|111|
		|BBB|222|
		|SreeDeviRaman|BYNRML|
		
		
		Scenario: Verify user is in Search Hotel page 
			When User selects the location "Sydney" as "value" in the Select location field 
			And User selects the Hotel "Hotel Creek" as "visibletext" in Select Hotel field 
			And User selects the room type in Select Room type field 
			And User selects the number of rooms 
			And User selects the check in date 
			And User selects the check out date 
			And User selects the adults per Room 
			And User selects the children per Room 
			And User clicks on search button to search for the details 
			Then User verify the Search Hotel Page navigates to Select hotel page 
			
		Scenario: Verify user is in Select Hotel page 
			When User clicks on the selected radion button 
			And User clicks on the continue button 
			Then User verify the Select Hotel page navigates to Book a Hotel page 
			
		Scenario: Verify user is in Book a Hotel page 
			When User enters the  first name in FirstName field 
			When User enters the  last name in LastName field 
			When User enters the  billing Address in Billing Address field 
			When User enters the  Credit Card Number in Credit Card Number field 
			When User enters the  credit card type in Credit Card Type field 
			When User enters expiry month in Expiry Month field 
			When User enters expiry year in Expiry Year field 
			When User enters the cvv number in CVV field 
			When User clicks on the BookNow Button 
			Then User verify the Book a Hotel navigates to Booking Confirmation page 
		
		
		Scenario: Verify user is in Booking ConfirmationPage 
			When user clicks on book itinerary button 
			And User clicks on log out button to exit the page 
			Then User verify Book Itinerary page navigates to successfully logged out page 
			
			
			
 
