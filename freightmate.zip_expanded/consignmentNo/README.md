### Consignment Note Number Generator
Within the freight industry every shipment of items has a Consignment Note Number (Connote Number). 
When we create a new consignment, we must generate an industry-wide unique ID. For example a shipment sent with Freightmate Couriers Co may be: `FMCC123ABC00000196051` This ID is made up of multiple parts. 
A Carrier prefix, an account number, a consignment index within an allowed range, digits and a checksum. 
A con note number is calculated by concatenating these parts together in the correct order. 
As a part of this process the consignment index must be incremented from last used index 

#How to run the application
- Right click on the project(consignmentNo), select 'Run As' and click on "Spring Boot App"
- Open the browser and enter the URL "http://localhost:8080/connotenumber"
- Enter the values in textbox and click on submit.

#How to run the test case
- Right click on the file ConsignmentNoGeneratorServiceTest.java(src/test/java/com.example.freightmate.consignmentNo.Service), select 'Run As' and click on "JUnit Test"

#Assumption
- Letters 'F','M', 'C', 'C' are uppercase in the carrier name FreighMateCourierCo.