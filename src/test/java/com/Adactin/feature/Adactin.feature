Feature: Hotel booking In Adactin Application

@SmokeTest
Scenario Outline:Login
Given user Launch The Application
When user Enter The "<Username>"  In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button And It Navigate To Search Hotel

Examples:
|Username|Password|
|Jessica|123456|
|Rani|98765g|
|Monicarexxavier|Je$$ica03|
@SanityTest
Scenario:
When user Select The Location of The Hotel In Location Field
And user Select The Hotel Name In Hotels Field
And user Select The Room Type In Room Type Field
And user Select The Number Of Rooms In Number of Room Field
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Check Out Date Field
And user Select The Adults Per Room In Adults Per Room Field
And user Select The Childrens Per Room In Children Per Room Field
Then user Click On The Search Button And It Navigate To select Hotel

@SanityTest
Scenario:
When user Press The Radio button In The Field Select To Select Hotel
Then user Click On Continue Button And It Navigate To Book A Hotel

@SanityTest
Scenario:
When user Enter Their Firstname In First Name Field
And user Enter Their Lastname In Last Name Field
And user Give The Address In Billing Address Field
And user Enter Credit Card Number In Credit Card No. Field
And user Select The Credit Card Type In Credit Card Type Field
And user Select The Month In Expiry Month Field
And user Select The Year In Expiry Year Field
And user Enter CVV Number In CVV Number Field
Then user Click On Book Now Button And It Navigate To Booking Confirmation

@SanityTest
Scenario:
Then user Click On My Itinerary Button And It Navigate To Booked Itinerary

@SanityTest
Scenario:
When user Click On Booked Itinerary Check Box
Then user Click On Logout Button And It Navigate To HomePage
