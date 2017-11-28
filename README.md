# shuffler
Exploring REST and Jersey

RESTful Shuffler

Setup:

1.  Download Jetty Server
2.  Add shuffler.war file to be deployed with Jetty server launch.
3.  Launch Jetty Server


Usage:
To test the resource, I used the Chrome plugin "Postman".  This allowed me to send GET, PUT, PUSH, and DELETE http requests to the resource

The Deck resource is located at http://localhost:8080/shuffler/webapi/decks

1. To get a list of all decks in the system, send a GET request at the URI listed above.
2. To view a deck by name, append "/{name}" to the URI in a GET request.  If the deck does not exist in the system, nothing is returned.
3. To create a new deck by name, append "/{name}" to the URI in a PUT request.  If the deck already exists, it will not be overwritten.  The deck is returned in the response.
4. To delete a deck by name, append "/{name}" to the URI in a DELETE request.  If the deck exists, it will be returned in the response.  If it is not found in the system, nothing is returned.
5. To shuffle a deck by name, append "/{name} to the URI in a POST request.  If the deck exists, it will be shuffled and returned in the response.
6. To modify the the shuffle algorithm for a deck and shuffle it, "append "/{name}/{algorithm}" to a POST request.  The two shuffling algorithms are "computer" "human"(default because it is more fun).  If the deck exists, it will be shuffled and returned in the response.  So to simulate a human shuffle for the deck bicycle, the URI would appear as:

http://localhost:8080/shuffler/webapi/decks/bicycle/human

***********************************************************************

Requirements:
•         Create a microservice that stores and shuffles card decks.
•         A card may be represented as a simple string such as “5-heart”, or “K-spade”.
•         A deck is an ordered list of 52 standard playing cards.
•         Expose a RESTful interface that allows a user to:
•         PUT an idempotent request for the creation of a new named deck.  New decks are created in some initial sorted order.
•         POST a request to shuffle an existing named deck.
•         GET a list of the current decks persisted in the service.
•         GET a named deck in its current sorted/shuffled order.
•         DELETE a named deck.
•         Design your own data and API structure(s) for the deck.
•         Persist the decks in-memory only, but stub the persistence layer such that it can be later upgraded to a durable datastore.
•         Implement a simple shuffling algorithm that simply randomizes the deck in-place.
•         Implement a more complex algorithm that simulates hand-shuffling, i.e. splitting the deck in half and interleaving the two halves, repeating the process multiple times.
•         Allow switching the algorithms at deploy-time only via configuration.
 Provide the source code and instructions for building/running/using the microservice.
We don't want you to spend more than 4-8 hours on this, so we are interested in seeing your decision making process regarding feature reduction to meet the deadline while creating a minimally viable product. Feel free to ad-lib requirements within the spirit of the exercise as you see fit, or to contact me with any questions about the project.

