# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)

45-60 hours

mobile based

web based 

stand alone aplictins


core java
Datatypes
Encapsulation
variables
variable types
Methos
Different yps of methods
class
object
data binding
opertors
contro statments
ex eption handling


Advance Java concepts
frameworks
Rest APi
Spring Boot(spring)

ORM
hibernate
jpa
data jpa

servers:
tomcat(apache)

boiler plate code




example:

5 steps
1. decale class that can connect or make sure (class.forname()")
2.establisibg
3.stanebts(queies)
4.execute
5.resulut


JDBC



Real time tools:
maven/ant
IDE(eclipse/intellij/sublime)
Vsose(front /ui)
jira
vsts(tracking the tickets)
jenkins
CICD pipelines
gitlab
github


Devops
piplines
build
deploye
test(junits)

job(build(from some gitlab repo+Deploed(soe tomcat)+test(pyraft)))--pipline



Data types:
----------
int,float,long,double,char,string,short,boolean

12(int/long/short)
default valye 0
12.0(float/double)
0.0
'A'/'1'(char)
''
"kdksf"(String)
 
boolean (true/false)
false

varibale:
----------
name=Anthony sampath

data-type variablenae;
String name;


variable declaration
-------------------
String name;

name="jdqdqjdqwjw";



variable initilazation:
-------------------------
String name="Abc Def";





types of variables:
-------------------
local variable
global /public variables
final variables
static variabkles









public class Demo{


 static sting name ="sdwf";//static variable
 sting name ="sdwf";//non static static variable/instance variabe/global varibales
 
 final sting name ="sdwf";//non static static variable/instance variabe/global varibales




main(){

 sting name ="sdwf";//local variables
Sysout(name)

}

}

accessing the variables
-----------------------

public class Demo{


 static sting name ="sdwf";//static variable
 sting name1 ="sdwf";//non static static variable/instance variabe/global varibales
 
 final sting query ="sdwf";//non static static variable/instance variabe/global varibales




main(){

 sting name ="sdwf";//local variables
Sysout(name)
Sysout(classname.name)

Sysout(name1)




}

public class Demo1{


 



main(){

 sting name ="sdwf";//local variables
//Sysout(name)
Sysout(classname.name)


}


}

object:
-------

Demo demo = new Demo();



public class Demo1{


 



main(){

 sting name ="sdwf";//local variables
//Sysout(name)
Sysout(classname.name)

Demo demo = new Demo();
Sysout(demo.name1)


}


}

---------------------


methods:
--------
class Demo{

line1
line2


Access specfier   access modifier     return-type      method-name          inputs/arguments for the method
public           static              void               main               (String args){

//method body/method implemetation


}

Access specfier:<optional>
---------------
public 
private
protected



access modifier:<optional>
--------------
static
final


return-type:<mandatory>
----------
it can be any datatype
void


public void m1{


}

public int m1{

return 1;
}


method-name:<mndatory>
-----------
user definded meds/custom methods
public int m2{

return 1;
}
pre defineded method
Access specfier   access modifier     return-type      method-name          inputs/arguments for the method
public           static              void               main               (String args){

//method body/method implemetation


}

inputs/arguments for the method:<optional>
--------------------------------

 int addition(int a,int b){

return a+b;
}

 void  addition(){
int a,int b;
return a+b;
}








}






types ofmethods
-----------------
static methds
non static nethods
final methods



abstact methods:
------------------

void  addition();
void  addition(int a,int b);


calss demo1{

@oerride
void  addition(){

fw2e2ee2e
23
2
233
2
}
}



concrete methods:




Inheritance:
------------
members of class(Properties/variables and methods)

Parent 
some property


Child
same property can be acess by the child


extends

Class A{

int age=10;

public void peintWelcomeMessage(){

Sysout("Hello");
}


}


Class B extends A{

int age1=10;

public void peintWelcomeMessage1(){

Sysout("Hello");
}



public void peintWelcomeMessage(){

Sysout("Welcome");
}


}

Class Test{

main(){

m1();

}


m1(){



A a = new A();



B b = new B();

super
}




}

overiding:
-----------


Interfaces:
-----------

keywor:implements

class A{

}

Clase B which can implement A {

}


Clase C which can implement A{

}

Clase D which can implement A{

}

-----------------------------

Clase B which can implement A{

}


Clase C which can implement A{

}

Clase D which can implement A{

}

interfaces contain only abstract methods


inteface BankingApp{

public abstract  vioid m1();
public  abstract vioid m2();

}

helper classes (implementation)

public class SBI implements BankingApp{

public abstract  vioid m1(){

}

public  abstract vioid m2(){


}

}




RBI:

minBalance
typeOfAccounts
NuberofDigitsInAccountNumber



class SBI implemets RBI{

minBalance{

}
typeOfAccounts{

}
NuberofDigitsInAccountNumber{

}

minBalancefq(){



}
typeOfAccounts(){


}
NuberofDigitsInAccountNumberas(){

}


}



class HDFC implemets RBI{

minBalance{

}
typeOfAccounts{

}
NuberofDigitsInAccountNumber{

}

minBalancefq(){



}
typeOfAccounts(){


}
NuberofDigitsInAccountNumberas(){

}


test(){

//RBI rbi = new RBI();

RBI rbi = new HDFC();
rbi.

}


}


interface A{


m1();
m2();
default m3(){


}

}


class 


Access Specifiers:
-----------------
public
private
protected
default

public --this can be access anywhere

private ---this can be access within the class
protected-- can be accessed by its self as well as all the extended clasess(sub classes)
deafult--can b eaccess thorough the package

Access Modifiers:
-----------------
static
final

public  static final void main(){

}



-----------------

operators:
-----------
depend on operands(variables)


add 2 numbers

int a;
int b;
int c;

Sysout("C:"+(a+b));
Arthimetmatic
+ - / * %

assignment(=)

logical(&&  || )--in order to build complex conditon

TT && True<false>
FF || False<true>

relatinal(<, >,<=,>=,==,=!)

1,2,3,4,5,6


age = 20;
>=18

amazon
10000 get 1000 
20000 get 20




ternary oprator

x?true:false


calculator

which number is greator(logical operators)

incerment ++
decrement --


------------------------------------


iterative staments
------------------
for
for each
while
do while

control statments:
----------------
if else
nested else
switch

polymorsphism:
-----------

method oveloading
meth overiding

-----------------------------------------

aws(s3)

----------------

Advance java 

appplication servers
some build(maven)
frameworks


----------------------------

Basic life cycle for the web based application.

some layers(packages)

bootstrap / class with starting point

controller(Controller classles)
http://facebook.com/friends
http://facebook.com/addAfriend
http://facebook.com/deleteFriend


http://facebook.com/friends
method(){

internlly connect to db ge the detais from db//dao class
process the details//business logic///use the service layaer classess 
render the details to the cotroller back

}


DAO(Data Access object)
-----------------------
Freinds
Address
Cities

Service layer/ manager layer
--------------------------

util(utlities)

security(authentication)

pogos

models

Bo

VO







basic crud operations

,M   C V (jsp/servlets/javasript) --(angular/react/spa) 

collections

LIST
SET
MAP

Frind

public List<Friends> getFriends(){

List<Friends> friends = get  friends from oher layer.
return friends;
}


public class Friends{


private String name;
private String fid;


getters and setters



}




application--->contoller------>servie layer/ manager layer----->DAO layer----->configs/databases
application<---contoller<------servie layer/ manager layer<-----DAO layer<-----configs/databases




coming to conftoller
------------------
URLS/apis/rest apis/services/endpoint

https://teams.microsoft.com/_#/pre-join-calling/19:meeting_YjY0MGI5Y2YtYTIzOC00YzhmLWI0N2EtNzliMGYxMDA0MTMz@thread.v2
https://teams.microsoft.com/_#/pre-join-calling/19:meeting_YjY0MGI5Y2YtYTIzOC00YzhmLWI0N2EtNzliMGYxMDA0MTMz@thread.v1

CRUD operations:
----------------


annotations?

inheritance


Restfull framework:

@POST--create
@PUT--update
@GET---Read
@DELETE--delete


Spring bootst
----------
@POSTMapping--create--create
@PUTMapping--update
@GETMapping---Read
@DELETEMapping--delete


--------------------------------

data formats:
-----------

input payload--request
out payload---response
text
html
json format
xml

json format
{"name":"PrivacyConcern","time":"2022-01-07T02:47:42.729Z","ver":"4.0","iKey":"o:bc3902d8132f43e3ae086a009979fa88","ext":{"metadata":{"privTags":33554432,"privLevel":110},"sdk":{"ver":"1DS-Web-JS-3.1.4","seq":1062,"epoch":"3844628845"},"app":{"sesId":"f347f838-e4bf-3402-eb81-e52d510b428f"},"user":{"locale":"en-IN"},"web":{"domain":"teams.microsoft.com","browser":"Chrome","browserVer":"96.0.4664.110","screenRes":"0X0","userConsent":false},"os":{"name":"Windows","ver":"10"},"intweb":{},"utc":{"popSample":100},"loc":{"tz":"+05:30"}},"data":{"baseData":{"properties":{"version":"PostChannel=3.1.4;OverridePropertiesPlugin=3.1.4;SystemPropertiesCollector=3.1.4;PrivacyGuardPlugin=3.1.4"}},"PG_EventName":"trouter_js_client_response","PG_FieldName":"url.value","PG_TypeAsText":"Url","PG_BaseType":"custom"}}



Friends{
name,
address

}

model:
{
"name":"",
"address":""
}

-------------------------------

Friends{
name;
address;
private Address address;
private List<Address> address1;

}


Address{
name,
address

}

<address>

<name>knwkef</name>
<address>knwkef</address>
</address>


model:
{
"name":"",
"address":"",
"address":{

"name":"",
"address":""

},
"address1":[{

"name":"",
"address":""



},
{

"name":"",
"address":""



},
{

"name":"",
"address":""



}


]


request
response

@Path("/https://teams.microsoft.com/_#/pre-join-calling/19:meeting_YjY0MGI5Y2YtYTIzOC00YzhmLWI0N2EtNzliMGYxMDA0MTMz@thread.v2")
@POST
@Consumes(Application/json)
@Produces(Application/json)
public void m1(){


}

@PostMapping(path="/msbjasds",method="post",consues="jon",produce"json")
public void m1(){


}



Group(group id)-com.example
Artifact-demo
Name-demo
Description-Demo project for Spring Boot
Package name-com.example.demo

maven project:
----------
pom.xml

packing---jar/war

dependencies--
jdbc
conn = class.forName("com.jdbc.driver.MYsqlDriver");
conn = class.forName("com.jdbc.driver.orcalseDriver");
conn.

build path

myql db


<dependencies>
<dependency>
</dependency>

<dependency>
</dependency>
</dependencies>

<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			
		</dependency>
</dependencies>


plugins

properties

<spring-boot-starter-web.version>2.34.</version>
java version


spring-boot-starter-web
@post
@


git;


2 commands

clean--removing all the .class files
install


.java-----.class file-----run
project--n java files--->maven install


maven clean



https://mvnrepository.com/


repo
braches

features(
release
master


feature/name-of-the-functionaly

pr/mr

sevlet
------

Heloo

profiles

local---->sit---->dev----->qa--->uat---->prod


<repository>
			<id>central</id>
			<name>Central Repository</name>
			<url>https://repo.maven.apache.org/maven2</url>
			<layout>default</layout>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>






































