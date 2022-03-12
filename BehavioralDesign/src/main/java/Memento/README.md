Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

Applicability
Use the Memento pattern when you want to produce snapshots of the object’s state to be able to restore a previous state of the object.
Use the pattern when direct access to the object’s fields/getters/setters violates its encapsulation.


Pros and Cons
You can produce snapshots of the object’s state without violating its encapsulation.
You can simplify the originator’s code by letting the caretaker maintain the history of the originator’s state.

The app might consume lots of RAM if clients create mementos too often.
Caretakers should track the originator’s lifecycle to be able to destroy obsolete mementos.
Most dynamic programming languages, such as PHP, Python and JavaScript, can’t guarantee that the state within the memento stays untouched.
