package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GetprofileController {
	
	@RequestMapping("/v2/kvn/users")
	public String getprofile() {
		
			
		return "{\r\n" + 
				" \"type\": \"userWsDTO\",\r\n" + 
				" \"name\": \"firstName lastName\",\r\n" + 
				" \"uid\": \"elab2test02@yopmail.com\",\r\n" + 
				" \"currency\": {\r\n" + 
				" \"active\": true,\r\n" + 
				" \"isocode\": \"EUR\",\r\n" + 
				" \"name\": \"Euro\",\r\n" + 
				" \"symbol\": \"€\"\r\n" + 
				" },\r\n" + 
				" \"customerId\": \"0f2bdbdf-3a1b-4989-8361-4cb303a2e3ea\",\r\n" + 
				" \"defaultAddress\": {\r\n" + 
				" \"billingAddress\": false,\r\n" + 
				" \"companyName\": \"WWT\",\r\n" + 
				" \"contactAddress\": false,\r\n" + 
				" \"country\": {\r\n" + 
				" \"isocode\": \"NL\",\r\n" + 
				" \"name\": \"Netherlands\"\r\n" + 
				" },\r\n" + 
				" \"defaultAddress\": false,\r\n" + 
				" \"email\": \"eLab2test02@yopmail.com\",\r\n" + 
				" \"firstName\": \"firstName\",\r\n" + 
				" \"formattedAddress\": \"line1 & streetname, 0, Town, postalCode\",\r\n" + 
				" \"gender\": \"FEMALE\",\r\n" + 
				" \"id\": \"8796388589591\",\r\n" + 
				" \"lastName\": \"lastName\",\r\n" + 
				" \"line1\": \"line1 & streetname\",\r\n" + 
				" \"line2\": \"0\",\r\n" + 
				" \"middleName\": \"middleName\",\r\n" + 
				" \"mobileNumber\": \"1234567890\",\r\n" + 
				" \"phone\": \"1234567890\",\r\n" + 
				" \"pobox\": \"100012\",\r\n" + 
				" \"postalCode\": \"postalCode\",\r\n" + 
				" \"shippingAddress\": false,\r\n" + 
				" \"title\": \"Dr.\",\r\n" + 
				" \"titleCode\": \"dr\",\r\n" + 
				" \"town\": \"Town\",\r\n" + 
				" \"visibleInAddressBook\": true\r\n" + 
				" },\r\n" + 
				" \"displayUid\": \"elab2test02@yopmail.com\",\r\n" + 
				" \"firstName\": \"firstName\",\r\n" + 
				" \"language\": {\r\n" + 
				" \"active\": true,\r\n" + 
				" \"isocode\": \"nl\",\r\n" + 
				" \"name\": \"Nederlands\",\r\n" + 
				" \"nativeName\": \"Nederlands\"\r\n" + 
				" },\r\n" + 
				" \"lastName\": \"lastName\",\r\n" + 
				" \"loyaltyInformation\": {\r\n" + 
				" \"cardNumber\": \"2625000000010\"\r\n" + 
				" },\r\n" + 
				" \"personalInformation\": {\r\n" + 
				" \"children\": [\r\n" + 
				" {\r\n" + 
				" \"dateOfBirth\": \"2015-10-23\",\r\n" + 
				" \"firstName\": \"Elly\",\r\n" + 
				" \"gender\": \"MALE\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"dateOfBirth\": \"2015-10-23\",\r\n" + 
				" \"firstName\": \"Staurd\",\r\n" + 
				" \"gender\": \"MALE\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"dateOfBirth\": \"2015-10-23\",\r\n" + 
				" \"firstName\": \"Steve\",\r\n" + 
				" \"gender\": \"FEMALE\"\r\n" + 
				" },\r\n" + 
				" {\r\n" + 
				" \"dateOfBirth\": \"2015-10-23\",\r\n" + 
				" \"firstName\": \"Shally\",\r\n" + 
				" \"gender\": \"FEMALE\"\r\n" + 
				" }\r\n" + 
				" ],\r\n" + 
				" \"dateOfBirth\": \"1980-10-23\",\r\n" + 
				" \"maritalStatus\": \"MARRIED\",\r\n" + 
				" \"pregnancyDueDate\": \"2015-10-23\",\r\n" + 
				" \"pregnant\": false\r\n" + 
				" },\r\n" + 
				" \"preferencesInformation\": {\r\n" + 
				" \"newsletter\": false,\r\n" + 
				" \"receiveOffers\": \"DAILY\"\r\n" + 
				" },\r\n" + 
				" \"title\": \"Ms.\",\r\n" + 
				" \"titleCode\": \"ms\"\r\n" + 
				"}";
	}
}
