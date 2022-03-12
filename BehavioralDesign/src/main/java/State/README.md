State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

Applicability
Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.
Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state machine.


Pros and Cons
Single Responsibility Principle. Organize the code related to particular states into separate classes.
Open/Closed Principle. Introduce new states without changing existing state classes or the context.
Simplify the code of the context by eliminating bulky state machine conditionals.

Applying the pattern can be overkill if a state machine has only a few states or rarely changes.