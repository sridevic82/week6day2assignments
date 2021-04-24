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
	And Click edit
	And enter cname<cname> 
	And Click update
	Then Edit lead is performed
	
	Examples: 
|pnum|cname|	
|'5'|'TCS'|