JMS Project Active MQ
------------------------
1. This Git project has two eclipse maven sub projects
  i. JMS Message Sender: Uses Spring JMS Template to send message to Active MQ.
  ii. JMS Message Receiver: Uses Spring Framework, Message Listener to read message from the Active MQ.
      This also has a REST Client to invoke Create Person Rest API of the Personal Information REST API to create a person after reading the message from Apache Active MQ.
2. Prerequistes to run this project
  i. You need to have apache-activemq. I used apache-activemq version 6.1.6. You can use Apache artemis accoedingly you need to change the configuration and dependency.
  ii. You need to have MySql DB
3. To execute both the project follow the below steps
   i. Message Receiver 
      1. Create a Queue in Apache Active MQ. You can use the console to create the queue.
      2. Check & Change the configuration value for your Apache Active MQ if required based on your environment. Queue name change is must in the context xml life.
      3. Change the rest api URL & URI in the PIRestClient class of the message receiver project 
      4. Build Message Receiver.
      5. use command prompt and use the command to run java -jar jmsReceiver-0.0.1-SNAPSHOT.jar
   ii. Message Sender
      1. Create a Queue in Apache Active MQ. You can use the console to create the queue.
      2. Check & Change the configuration value for your Apache Active MQ if required based on your environment. Queue name change is must in the context xml life.
      3. Build Message Sender
      4. Run as java application in eclipse 

Note: This project uses the code of previous project (SpringAnnotationRESTAPIupdate) to show case the application of JMS & Active MQ 6.1.6
