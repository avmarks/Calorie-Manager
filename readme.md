***Calorie Manager Project***

### Problem Statement
Tracking calories could be a complicated task, especially if the food is cooked at home.
After a few years of experience with tracking calories, I realize that it would be beneficial to 
have my own database with foods and recipes. This application would assist in storing and
retrieving calculated  data, which would save time and make it a perfect app for the tablet in the kitchen.
 
### Project Technologies/Techniques 

* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * User role: create food entry, create recipe entry, edit data have been entered previously
  * Exclusive: only user with password can view this information (login)
* Database
  * MySQL
  * Store foods, recipes and calories
* ORM Framework
  * Hibernate ??
* Dependency Management
  * Maven
* CSS 
  * Bootstrap and jQuery
* Data Validation
  * Bootstrap Validator for front end
* Logging
  * Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage 
* IDE: IntelliJ IDEA


### Design

* [Screen Design](DesignDocuments/Screens.md)

### [Project Plan](ProjectPlan.md)

### [Development Time Log](TimeLog.md)
