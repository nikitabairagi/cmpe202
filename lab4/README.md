Design Pattern Used :

Chain of Responsibility , Singleton

Classes Participating:

TableManager
Table
CutomerManager
Cutomer

Description:

TableManager is a singleton class which maintains all the tables in a list. Also whenever a table is released it updates the table. TableManager will be instantiated from main class and same instance will to returned to CustomerManager class.

CutomerManager maintains a queue of customers. And each customer in the queue has link to next customer. 

On registration of new customer, the new customer is added at the end of queue.

Whenever a table is released the table is made available to the first customer in the queue. If the customer party-size can fit in this table, the table is allocated to the customer and customer is removed from the queue. If customer party-size cannot fit in this table then this customer calls the successor in the customer queue.

Whenever a table is allocated to a customer, a message is sent to the customer asking for confirmation. If confirmed the table is reserved for the customer or else the seat method is called for the next customer in queue, and this customer is removed from queue.

If customer doesn't respond to the confirmation of reservation in 20 mins, the seat method is called for next customer. And customer is removed from queue.


