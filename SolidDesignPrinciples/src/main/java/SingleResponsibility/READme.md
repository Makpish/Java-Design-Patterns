Let's begin with the single responsibility principle. As we might expect, this principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.

How does this principle help us to build better software? Let's see a few of its benefits:

Testing – A class with one responsibility will have far fewer test cases.
Lower coupling – Less functionality in a single class will have fewer dependencies.
Organization – Smaller, well-organized classes are easier to search than monolithic ones.

Benefits
3.1. Easy to understand and maintain
When the class only does “one thing”, its interface usually has smaller number of methods (and member variables) that are fairly self explanatory. It makes the code easier to read and understand.

When there is a need to change the application behavior, changes related to the class’s responsibility are fairly isolated. It reduces the chance of breaking other unrelated areas of the software. It makes the code easier to maintain.

3.2. Improved usability
If a class has multiple responsibilities and it is required to be used in other parts of the application for using a certain responsibility, it may adversely expose other responsibilities which may not be desired. It can lead to undesired behavior in the application e.g. security and data privacy issues.

If the class follows the SRP principle strictly then unnecessary functionality will not be exposed and it makes the class to be more usable without fearing adverse effects.

