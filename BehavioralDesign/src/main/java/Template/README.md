Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

Applicability
Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.
Use the pattern when you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.


Pros and Cons
You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.
You can pull the duplicate code into a superclass.

Some clients may be limited by the provided skeleton of an algorithm.
You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass.
Template methods tend to be harder to maintain the more steps they have.