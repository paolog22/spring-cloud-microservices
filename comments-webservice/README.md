#Overview

This application provides the **comments** related functionality and serves as one component. It defines the REST endpoints that are used to provide comment functionality.

Note that this component is only used internally by the "task" microservice and is NOT actually exposed at the API gateway level.

##Pre-requisites

### Projects that need to be started before
* [config server](/../../blob/master/config-server/README.md) - For pulling the configuration information
* [webserver-registry](/../../blob/master/eureka-server/README.md) - For starting the Eureka server since the authorization server also is a micro-service that needs to be registered with Eureka server.    

### Running the application
* Build the application by running the `./gradlew clean build` gradle command at the "comments-webservice" project root folder	on the terminal.
* If you want to run the application as jar file, then run `java -jar build/libs/comments-webservice-0.1.0-SNAPSHOT.jar` command at the terminal.

## External Configuration
Please refer to [user webservice](/../../blob/master/user-webservice/README.md) for details on how the external configuration works. Note that there is separate configuration file for each Spring application; the application should refer to it's own .yml file for configuration.