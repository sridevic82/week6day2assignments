Feature: Edit Lead Functionality 


	
	
	
Scenario Outline: TC004_deletelead 

	When click on login button button
	And Click the Crmsfa link
	And Click leads button
	And Click Findleads
	And Click on phone
	And enter the pnum as <pnum>
	And Click findleads
	And select firstlead
	And Click delete
	Then Delete Lead is performed
	
	Examples: 
|pnum|
|'5' |