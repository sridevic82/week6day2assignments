Feature: Create Lead Functionality 


	
@functional	
Scenario Outline: TC003_createlead
    When click on login button button
	And Click the Crmsfa link 
	And Click leads button 
	And Click Createlead 
	And enter the company name as <cname> 
	And Enter the first name as <fname> 
	And Enter the last name as <lname> 
	And Click Create lead 
	Then Create lead is created 
	
	Examples: 
|cname  |fname  |lname  |
|'HCL'  |'Ramya'|'Raj'  |
|'Wipro'|'Guna' |'Sekar'|
		
		
		
