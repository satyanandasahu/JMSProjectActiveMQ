JMS Project Active MQ
------------------------
1. This project has two eclipse maven projects
  i. JMS Message Sender: Uses Spring JMS Template to send message to Active MQ.
  ii. JMS Message Receiver: Uses Spring Framework, Message Listener to read message from the Active MQ.
      This also has a REST Client to invoke Create Person Rest API of the Personal Information REST API to create a person after reading the message from Apache Active MQ.
2. Prerequistes to run this project
  i. You need to have apache-activemq. I used apache-activemq version 6.1.6. You can use Apache artemis accoedingly you need to change the configuration and dependency.
  ii. You need to have MySql DB

Note: This project uses the code of previous project (SpringAnnotationRESTAPIupdate) to show case the application of JMS & Active MQ 6.1.6
