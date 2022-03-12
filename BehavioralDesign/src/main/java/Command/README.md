Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

Applicability
Use the Command pattern when you want to parametrize objects with operations.
Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
Use the Command pattern when you want to implement reversible operations.


Pros and Cons
Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
You can implement undo/redo.
You can implement deferred execution of operations.
You can assemble a set of simple commands into a complex one.

The code may become more complicated since you’re introducing a whole new layer between senders and receivers.