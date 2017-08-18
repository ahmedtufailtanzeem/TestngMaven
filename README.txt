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






