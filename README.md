# RestAssuredMasterFramework


In this framework I intend to make a generic framework with below capabilities :
- Creation of reusable framework.
- Test intention be separated from Test implementation
- Clean design and readable code.
- Test should run and pass everytime.
- Platform independence - It should run on Windows, Mac or Linux
- A clean commit history to see how to approach the task.
- Readable Assertions
- Usage design patterns

###Instructions 
Instructions on how to use the framework and execute it : 

- Install Java 8+ and Maven 3.8.4.
- Set Environment variable JAVA_HOME & MAVEN_HOME paths
- Install an IDE like - IntelliJ Idea
- Clone the repository from GitHub to your workspace.
- Running the test: Run the testng.xml file to run all the tests. Individual tests can be run at class level too.


### Tasks

1. To create dummy users by making post call to https://reqres.in/api/users


2. Drive test with a json file for API request body.


3. To have only one test which will run two times with two different set of data sets
        given below:
       
        [
         {
           "name": "admin",
           "job": "admin"
         },
         {
           "name": "ronaldo",
           "job": "player"
         }
        ]
        
4. Assert the following components from Post request -
- Response code
- Response schema
- Response time is within 2 seconds
- Response header has “Content-Type” with value containing “application/json”
- Response can be deserialized to POJO
