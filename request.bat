rem http://localhost:8080/PlateletRestApp/donors?format=json
rem http://localhost:8080/PlateletRestApp/donors
rem http://localhost:8080/PlateletRestApp/donationRequests
rem http://localhost:8080/PlateletRestApp/donorResponses

rem curl -i -X POST -H "Content-Type: application/json" -d @request.json http://localhost:8080/PlateletRestApp/donationRequests.json
curl -i -X POST -H "Content-Type: application/json" -H "Authorization: Bearer be8c2556e19149ad373d2afc07658f1a19781728cff3d1d99fb974c03c7dc832" -d @request.json https://23.20.110.79/PlateletRestApp/donationRequests.json