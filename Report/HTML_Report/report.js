$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\"  In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigate To Search Hotel",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login;;1"
    },
    {
      "cells": [
        "Jessica",
        "123456"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login;;2"
    },
    {
      "cells": [
        "Rani",
        "98765g"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login;;3"
    },
    {
      "cells": [
        "Monicarexxavier",
        "Je$$ica03"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Jessica\"  In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123456\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigate To Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 2235415700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jessica",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 161117500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 108009300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel()"
});
formatter.result({
  "duration": 3290889500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Rani\"  In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"98765g\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigate To Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 169132200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rani",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 75239000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "98765g",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 75059200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel()"
});
formatter.result({
  "duration": 3242919400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Monicarexxavier\"  In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Je$$ica03\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigate To Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 186614500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Monicarexxavier",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 116120200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Je$$ica03",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 77087600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel()"
});
formatter.result({
  "duration": 3531184900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The Location of The Hotel In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel Name In Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Room Type In Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number Of Rooms In Number of Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Adults Per Room In Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Childrens Per Room In Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click On The Search Button And It Navigate To select Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Location_of_The_Hotel_In_Location_Field()"
});
formatter.result({
  "duration": 119003100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Hotel_Name_In_Hotels_Field()"
});
formatter.result({
  "duration": 122444700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Room_Type_In_Room_Type_Field()"
});
formatter.result({
  "duration": 122526400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Number_Of_Rooms_In_Number_of_Room_Field()"
});
formatter.result({
  "duration": 123421200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 13300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 105376400,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Childrens_Per_Room_In_Children_Per_Room_Field()"
});
formatter.result({
  "duration": 124658200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_The_Search_Button_And_It_Navigate_To_select_Hotel()"
});
formatter.result({
  "duration": 361587700,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Press The Radio button In The Field Select To Select Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click On Continue Button And It Navigate To Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Press_The_Radio_button_In_The_Field_Select_To_Select_Hotel()"
});
formatter.result({
  "duration": 67016000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_Continue_Button_And_It_Navigate_To_Book_A_Hotel()"
});
formatter.result({
  "duration": 359777500,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user Enter Their Firstname In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Enter Their Lastname In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Give The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter Credit Card Number In Credit Card No. Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Month In Expiry Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Year In Expiry Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click On Book Now Button And It Navigate To Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Enter_Their_Firstname_In_First_Name_Field()"
});
formatter.result({
  "duration": 88125600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_Their_Lastname_In_Last_Name_Field()"
});
formatter.result({
  "duration": 61775900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Give_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 79840200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_Credit_Card_Number_In_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 2086042500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 121263200,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Month_In_Expiry_Month_Field()"
});
formatter.result({
  "duration": 105217600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Select_The_Year_In_Expiry_Year_Field()"
});
formatter.result({
  "duration": 2110575700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Enter_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 70717100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation()"
});
formatter.result({
  "duration": 2049948100,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "user Click On My Itinerary Button And It Navigate To Booked Itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary()"
});
formatter.result({
  "duration": 6282427000,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "user Click On Booked Itinerary Check Box",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user Click On Logout Button And It Navigate To HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_Booked_Itinerary_Check_Box()"
});
formatter.result({
  "duration": 55186900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Click_On_Logout_Button_And_It_Navigate_To_HomePage()"
});
formatter.result({
  "duration": 540767100,
  "status": "passed"
});
});