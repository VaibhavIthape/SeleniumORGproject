Feature: Verify Adding new user into User management and verify

@Sanity
Scenario Outline: Verify Adding new User
Given User Enter Username and Password "<LoginUsername>" and "<LoginPassword>"
When Redirect to Add User page
Then Fill all mandatory fields "<User Role>" "<Employee name>" "<Status>" "<Username>" "<Password>" and "<ConPass>"



Examples:
|	User Role	| Employee name		|	Status	|	Username	|	Password	| ConPass		|  LoginUsername	| LoginPassword |
| Admin			|	Fach D Ram			|	Enabled	|	Dock20		|	Vayu@200	| Vayu@200	|		Admin					| admin123			|
