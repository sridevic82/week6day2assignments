Feature: Edit Lead Functionality 


	
Scenario Outline: TC004_editlead 
	When click on login button button
	And Click the Crmsfa link
	And Click leads button
	And Click Findleads
	And Click on phone
	And enter the pnum as <pnum>
	And Click findleads
	And select firstlead
	And Click duplicatelead
	And Click on submit
	Then Duplicate Lead is performed
	
	Examples: 
|pnum|
|'5' |