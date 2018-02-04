***Calorie Manager Project***

### Problem Statement
Tracking calories can be a complicated task, especially if the food is cooked at home.
Usually it requires looking up a food item, finding it's nutritional information for 1 gram (other units)
and multiplying that by the weight of the item. If there is a recipe to follow this process repeats itself multiple
times which becomes a bit tiresome. After a few years of experience in tracking calories, I realize that it would be
beneficial to have my own database with foods and recipes that I use on a regular basis. 
The goal of this application would be to assist in storing, adding and retrieving calculated food/recipe data,
which would save time and energy, in addition to making it a perfect app for a kitchen tablet.
 
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
  * Bootstrap Validator for front 
* Loggingend
  * Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting. 
* Unit Testing
  * JUnit
* IDE: IntelliJ IDEA


### Design

* [Screen Design](DesignDocuments/Screens.md)

### [Project Plan](ProjectPlan.md)

### [Development Time Log](TimeLog.md)
