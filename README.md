# Spring boot app test

---------------

###Using:

 * Spring Boot
 * Sprint Data, JPA2.1 and Hibernate
 * Spring Security
 * Angular.js

We will be using java 1.8 for the sake of learning it.

This will be used as a base for a project and it's just a test of the stack.

Currently using Bower and Maven.

###To run:

Download vagrant and follow http://www.pgdevbox.com/ to get postgre running.

Or just install vagrant, cd to the root of this project and ```vagrant up``` to start a new VM with postgre on it

**then run**

```mvn spring-boot:run``` or simply run the main method on ```AppStart``` class

It will be available on localhost:8888

###TODO:

* ~~Create folder structure~~
* ~~Create pom.xml~~
* ~~Make Spring boot work~~
* ~~Add Bower and Angular~~
* ~~Configure JPA~~
* Configure basic Spring Security
* Create simple Angular site
* Add a development profile
* Add a in memory(h2) development database
* Integrate bower as part of maven build process

Cheers
