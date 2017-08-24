Run single class file
Run single suite file
Run single test method
Run multiple test methods at once available on surefire 2.20
Run multiple suite files
Add multiple profiles and control via command line
Jacoco profilesRunning only integration or unit test - ?
Parallelism - TestNG/Plugin
Plugin execution - Goals/Phase understanding

git remote add origin https://github.com/tanzahmed/TestngMaven.git
git push -u origin master

mvn clean 	- cleans the target directory

mvn compile - compiles only the src

mvn test 	- compiles src & test, runs all test

mvn package - compiles, runs test and packages into jar/war

mvn install - compiles, runs test, packages jar, deploys to local .m2 if report not configured

mvn install with

-Dmaven.test.failure.ignore=true - Ignore failing test and continue packaging/install(Go to next phase)

-Dmaven.test.skip=true - Skip compiling test packages

-DskipTests - Skip running test 

mvn surefire:test - Skip compiling and directly run test

mvn surefire:test -Dtest=org.tanzeem.CalculatorAddTest - Running a specific test class

mvn surefire:test -Dtest=org.tanzeem.CalculatorAddTest#testAddition2Plus6Equals8 - Running a specific test

mvn test -Dtest=org.tanzeem.CalculatorAddTest#testAddition2Plus2Equals4+testAddition2Plus6Equals8 - Running muliple test methods

mvn test -Dsuite-file=add-suite.xml - Run a specific suite file, add sure-fire plugin with suiteXmlFile tag

mvn test -Dsuite-file=all-suite.xml - Run all suite files
<suite name="all_suite" verbose="1" >
    <suite-files>
        <suite-file path="src/test/resources/add-suite.xml"/>
        <suite-file path="src/test/resources/mul-suite.xml"/>
    </suite-files>
</suite>










