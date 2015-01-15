package com.mastek.rnd.tekathon.grails.plateletapp

import grails.rest.*

@Resource(uri='/donationRequests')
class DonationRequest {

String requestorName;
String requestType;
Date requiredInDays;
String bloodGroup;
String pincode;

    static constraints = {

    requestorName blank: false
    requestType blank: false
    bloodGroup blank: false
    pincode blank: false


    }
}
