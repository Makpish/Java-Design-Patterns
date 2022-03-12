Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

Applicability
Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients (either for convenience or security reasons).
Use the pattern to reduce duplication of the traversal code across your app.
Use the Iterator when you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.


Pros and Cons
Single Responsibility Principle. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes.
Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything.
You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
For the same reason, you can delay an iteration and continue it when needed.

Applying the pattern can be an overkill if your app only works with simple collections.
Using an iterator may be less efficient than going through elements of some specialized collections directly.
