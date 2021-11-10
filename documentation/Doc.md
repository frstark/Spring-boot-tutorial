# AUFGABE 3: SPRING BOOT FULLSTACK DEPARTMENT-MANAGEMENT


![](.Doc_images/new-project.png)

## Table of Contents
1. [Creating Simple API](#creating-simple-api)
2. [Creating Springboard Components](#creating-springboard-components)
3. [CRUD Operations](#crud_operations)
4. [Add Loggers](#add_loggers)
5. [Exception Handling](#exception_handling)
6. [Change to MySql](#change_database)
7. [TESTING](#testing)




## Creating Simple API <a name = "creating-simple-api"></a>

Ein simpler Controller wird erstellt.
![](.Doc_images/hellocontroller.png)

Port wird verändert.
![](.Doc_images/port.png)

Re-run:
![](.Doc_images/first-try.png)

Auto-Update:
![](.Doc_images/f989a7ee.png)
![](.Doc_images/5282b9b6.png)
![](.Doc_images/04b3f102.png)


## Creating Springboard Components <a name="creating-springboard"></a>

Add H2 and JPA Dependency
![](.Doc_images/777adae4.png)

![](.Doc_images/0e04b195.png)

![](.Doc_images/f447996c.png)

### Creating Components

Department Entity 
![](.Doc_images/creating-Department.png)

Department Controller 
![](.Doc_images/6575afec.png)
Department Service 
![](.Doc_images/d010115c.png)
Department Service-Implementation
![](.Doc_images/2a9cb645.png)
Department Repository
![](.Doc_images/a8f9c68c.png)

Resultat im Browser:
![](.Doc_images/fd5635fd.png)

![](.Doc_images/8ffd3786.png)

## CRUD Operations <a name="crud_operations"></a>

### GetMapping

Controller
![](.Doc_images/181028d2.png)
Service
![](.Doc_images/44582089.png)
Service Implementation
![](.Doc_images/506c6921.png)

### Fetching Data by ID

Controller:
![](.Doc_images/getbyID-Controller.png)
Service:
![](.Doc_images/servive-byID.png)
Service Implementation:
![](.Doc_images/5523ff01.png)

### Delete by ID:

Controller:
![](.Doc_images/0af950ae.png)
Service:
![](.Doc_images/d724dac2.png)
Service Implementation:
![](.Doc_images/a59c2509.png)

### Update:

Controller:
![](.Doc_images/8d5b1c60.png)
Service:
![](.Doc_images/c5548129.png)
Service Implementation:
![](.Doc_images/354b1c34.png)

## Add Loggers <a name="add_logger"></a>

![](.Doc_images/ad5f8129.png)
![](.Doc_images/10550e9f.png)
![](.Doc_images/8ef4b086.png)

## Exception Handling <a name="exception_handling"></a>

![](.Doc_images/dc93b0b4.png)

Service Implementation:
![](.Doc_images/0dc472b0.png)
Controller:
![](.Doc_images/0aee16a9.png)


![](.Doc_images/bd4b5e5b.png)
![](.Doc_images/5415d304.png)


## Change to MySql <a name="change_database"></a>

![](.Doc_images/c99c1b01.png)
![](.Doc_images/4d85a4f7.png)
![](.Doc_images/c1cb6322.png)

## TESTING <a name="testing"></a>

### Service Layer Testing

![](.Doc_images/02100f9e.png)
![](.Doc_images/179ad59d.png)
![](.Doc_images/bb50d942.png)

![](.Doc_images/ca91f810.png)
![](.Doc_images/86bf352b.png)
![](.Doc_images/74bfcf61.png)
![](.Doc_images/699fddcf.png)

### Repository Layer 
Data will be flushed out.
![](.Doc_images/860aa6e7.png)

![](.Doc_images/ee34dc68.png)

No new Data created:
![](.Doc_images/00a7e488.png)

### Controller Layer 
Mock =  in der Softwareentwicklung ein Programmteil, der zur Durchführung von Modultests als Platzhalter für echte Objekte verwendet wird.
![](.Doc_images/f02b6f3a.png)

save method:
![](.Doc_images/726206a4.png)

fetchById:
![](.Doc_images/01ffdf74.png)




