# GameAuth: Platform Expansion Prototype

Hello there! I'm excited to share with you my experience working on the Draw It or Lose It game application project for The Gaming Room. As part of this project, I was tasked with creating a simulated environment that demonstrates prototypes to present multiple platform options to the client. The client already had a game application for Android systems, but they wanted to expand it to other operating platforms.

To achieve this goal, I worked on developing components of the application so that it could be deployed on various operating platforms using the client-server architectural pattern. One of the most critical aspects of this project was creating an effective interface and security features for the client. To do this, I used Basic Authentication to build a username and password login interface by modifying the provided tutorial code.

Working primarily on the server-side component of the application, I gained experience with developing using a REST Application Programming Interface (API). While Basic Authentication is not the most robust and secure mechanism, I ensured that the application was protected against unauthorized access. Later, the specific authentication mechanism can be replaced with a more robust version as per the client's needs.

To complete the project successfully, I reviewed the Dropwizard BasicAuth Security Example and the Dropwizard Jersey/HTTP Configuration and Examples page. These examples build on the beginner “Hello World” example by showing how to add basic authentication to the RESTful API.

After completing the necessary preparations, I started working on the user interface, the client, authentication and authorization, and user protection and security. I made sure to complete all assigned tasks outlined in the various Java files based on the FIXME comments. I also tested the code by running the application in Eclipse and adding the values “server config.yml” as Program Arguments on the Arguments tab of the Run Configuration.

test your code by running the application in Eclipse and visiting the URL http://localhost:8080/gameusers to see the list of game players returned as a JSON string.
