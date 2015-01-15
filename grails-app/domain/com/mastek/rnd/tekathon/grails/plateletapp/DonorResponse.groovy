package com.mastek.rnd.tekathon.grails.plateletapp

import grails.rest.*

@Resource(uri='/donorResponses')
class DonorResponse {

String donorName
String requestType
String bloodGroup
Boolean acceptFlag
Long requestId

    static constraints = {
        donorName(blank: false)
	requestType(blank: false)
	bloodGroup(blank: false)
	acceptFlag(blank: false)
	requestId(blank: false)
    }
}
