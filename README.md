# Spring Boot Bean Scope with examples
This project contains the bean scope with practical examples. singleton, prototype, request, session, global-session are the various bean scope.

## Roadmap
- The project illustrates various examples that implements bean scope.
- The various bean scope examples are explained in detail.

## Screenshots

#### Scenario 1 - Singleton scope
![App Screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/singleton-example-screenshot.JPG)

#### Scenario 2 - Prototype scope
![App Screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/prototype-example-screenshot.JPG)

#### Scenario 3 - Request scope
1. calling `/request/value` API and below response is received.
   
![App Screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/request-example-ss-1.JPG)
2. calling `/request/updated-value` API and below response is received.

![App screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/request-example-ss-2.JPG)
3. If again `/request/value` API and below response is received (old data is received).

![App Screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/request-example-ss-1.JPG)

#### Scenario 4 - Session scope
1. calling `/session/value` API and below response is received.

![App Screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/session-example-ss-1.JPG)
2. calling `/session/updated-value` API and below response is received.

![App screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/session-example-ss-updated-1.JPG)
3. If again `/session/value` API and below response is received (updated data is received).

![App Screenshot](https://github.com/CHANDRASEKAR98/spring-boot-bean-scope-examples/blob/main/images/session-example-ss-3-after-updated.JPG)

## Installation

Download and install Java 8 JDK on your system if not already done.
You can download Java 8 from the official [Oracle Website](https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html) 

Once downloaded, Install and setup your environemntal variables for Java 8 properly. If you don't know how to setup your environmental variables, kindly follow the steps given in this [link](https://www.javatpoint.com/how-to-set-path-in-java).

To check the version of Java installed in your system, kindly execute the following command on your CMD.

```bash
  java -version
```
The output will be displayed like the following.

```bash
  java version "1.8.0_101"
  Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
  Java HotSpot(TM) 64-Bit Server VM (build 25.101-b13, mixed mode)
```

## Spring Boot Project Creation
Go on to the [Spring Initializr](https://start.spring.io/)  website. Choose Maven project type, language as Java and give in the project meta data and generate the project. The project is hence downloaded in zip format.

Now, import the project on to the IDE.

## Bean Scope explanation
### 1. Singleton
By default, the scope is **singleton** even if not specified. If the scope of the class is said to be **singleton**, then only one instance of bean is created on spring container.
```
@Scope(value = "singleton")
```
### 2. Prototype
If the scope of the class is said to be **prototype**, then new instance of bean is created on spring container every time the bean is requested.
```
@Scope(value = "prototype")
```
### 3. Request
If the scope of the class is said to be **request**, then new instance of bean is created on spring container on every HTTP request. It is usually used in web application.
```
@Scope(value = "request")
```
If the data in this scope is updated and if the update API `(/request/update-value)` is called, the updated value is returned.

But if the Http request `(/request/value)` is called, the old data is returned.
### 4. Session
If the scope of the class is said to be **session**, then new instance of bean is created on spring container on every HTTP session. It is usually used in web application.
```
@Scope(value = "session") 
```
If the data in this scope is updated and if the update API `(/session/update-value)` is called, the updated value is returned.

But if the Http request `(/session/value)` is called, the updated data is returned.
### 5. Global Session
The global session scope is similar to the Session scope and really only makes sense in the context of portlet-based web applications. The portlet specification defines the notion of a global Session that is shared among all of the various portlets that make up a single portlet web application. Beans defined at the global session scope are bound to the lifetime of the global portlet Session.
