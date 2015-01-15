package com.mastek.rnd.tekathon.grails.plateletapp

import grails.rest.*

@Resource(uri='/donors')
class Donor {

String donorName
String bloodGroup
Integer age
Integer weight
String address
String pincode
Integer donationFrequency
Date lastDonationDate
Boolean deferral
String mobile
String email

    static constraints = {
        donorName(blank: false)
	bloodGroup(blank: false)
	age(blank: false)
	weight(blank: false)
	address(blank: false)
	pincode(blank: false)
	donationFrequency(blank: false)
	deferral(blank: false)
	mobile(blank: false)
        email(blank: false)



    }
}
