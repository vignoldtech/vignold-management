# Hello 👋 from VIGNOLD TECH

This is an assignment we present to you just to know your skills a little bit more ! <br/>
We know that it is a little bit detailed with the bonus tasks. But even though you will not be able to commit all the tasks, please send your changes as much as you can complete so far. <br/>
Let us know you better !
<br/><br/>


## Pre-Definition

You should be able to start the example application by executing de.vignold.VignoldManagementApplication, which starts a webserver on port 8080 (http://localhost:8080) and serves SwaggerUI where can inspect and try existing endpoints.<br/>

The project is based on a small web service which uses the following technologies: Java14, Spring Boot, H2(In Memory), Maven<br/>
<br/><br/>
You should be aware of the following conventions while you are working on this exercise:<br/>
&nbsp; :bulb: All new entities should have an ID with type of Long and a date_created with type of ZonedDateTime.<br/>
&nbsp; :bulb: The architecture of the web service is built with the following components:<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :100: DataTransferObjects (dto): Objects which are used for outside communication via the API<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :100: Controller: Implements the processing logic of the web service, parsing of parameters and validation of in- and outputs.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :100: Service: Implements the business logic and handles the access to the DataAccessObjects.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :100: DataAccessObjects (dao): Interface for the database. Inserts, updates, deletes and reads objects from the database.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :100: Entity: Functional Objects which might be persisted in the database.<br/>
&nbsp; :bulb: TestDrivenDevelopment is a good choice, but it's up to you how you are testing your code.<br/>
&nbsp; :bulb: Feel free to use Kotlin as well as Java. <br/>
&nbsp; :bulb: We do provide code formatter for IntelliJ IDEA and Eclipse in the etc folder<br/>
&nbsp; :bulb: A proper logging mechanism makes difference. So please do not forget to handle logging.<br/>

You should commit into a local git repository and include the git repository (.git/) in the upload. <br/>
_NOTE: Please DO NOT publish the project, e.g. by uploading it to GitHub or the like!_


<br/><br/>


<br/><b>We love creative marketing designs ! </b><br/>
Boards, Cards, Video Contents.. All of them are different kind of products we present to our customers.<br/>
<br/><br/>
We demand a practical api that enables our customers to create their jobs including the definition of their orders. <br/>
And our designers will be able to create their designs by creating products related to these jobs.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :v: See our <a href="./etc/content/domain-flow.png">domain flow documentation</a>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: The initial state of job is READY on job creation.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: When a designer creates a product, the job state will be RUNNING, the product state will be READY.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: When a product is started by our designer, the job state is still be RUNNING, the product state will be RUNNING.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: When a product is started by our designer, the job state is still be RUNNING, the product state will be RUNNING.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: When a product is finished by our designer, the product state will be FINISHED, if all of the related products are finished , then job state will be set to FINISHED.<br/>

<br/><br/>


## Task 1
&nbsp; :black_circle: Write a new Controller for maintaining job informations (CRUD).<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :heavy_check_mark: Decide on your own how the methods should look like.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :heavy_check_mark: Entity Job: This entity consists of the following fields : description, state, deleted, createddate,updateddate.<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :heavy_check_mark: Entity Product: This entity consists of the following fields : description, state, deleted, createddate,updateddate.<br/>
&nbsp; :black_circle: Extend the JobController to enable api users to select another product to relate.<br/>
&nbsp; :black_circle:  Extend the JobController to enable api users to remove one of its production's relation.<br/>
&nbsp; :black_circle: Extend the Job entity's relation to Product. A Job can be related to many products but a product is only related to a single job.<br/>
&nbsp; :black_circle: Add example data to resources/data.sql<br/>

<br/><br/>

## Task 2
First come first serve: Once a product is selected by a desginer, it can not be selected by another designer unless the current designer releases it. <br/>
If a second designer tries to select an already selected product you should throw a ProductAlreadyInProgressException.<br/>
Implement and serve these logics on controller.
<br/><br/>


## Task 3 (Bonus - optional)
Imagine a job management frontend that is used internally by VIGNOLD employees to create and edit job related data. <br/>
For a new search functionality, we need an endpoint to search for jobs & products. It should be possible to search for jobs by their attributes.<br/><br/>
<br/><br/>


## Task 4 (Bonus - optional)
This task is _voluntarily_, if you can't get enough of hacking tech challenges, implement security.<br/>
Secure the API so that authentication is needed to access it. The details are up to you.<br/>
<br/><br/>
Please include instructions how to authenticate/login, so that we can test the endpoints you implemented!<br/>


## Task 5 (Bonus - optional)
Make your final code more proper with your tests.
<br/><br/><br/>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: Unit Testing
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: Integration Tests
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :point_right: Controller Tests 


<hr/> 
<br/><br/>
:boom: NOTE : Please make sure to not submit any personal data with your tests result. <br/>
Personal data is for example your name, your birth date, email address etc._



<br/><br/>
Good Luck!



<br/><br/><br/><br/>

<div>
<div>
<a href="https://www.linkedin.com/company/vignold/">
  <img src="./etc/content/icon-linkedin.svg"/></a>
</div>
<div>
<a href="https://github.com/vignoldtech">
  <img src="./etc/content/icon-git.svg"/></a>
</div>
<div>
<a href="https://vignold-tech.de/">
  <img src="https://vignold-group.com/wp-content/uploads/2021/07/V_MARKETING_Logo_07_05_Zeichenfla%CC%88che-1.png" width="150" height="60"/></a>
</div>
</div>

