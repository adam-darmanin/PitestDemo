# Mutation Coverage

Using an empty test that only assumes no exception is thrown.

1. Default config: using DEFAULT mutators: https://pitest.org/quickstart/mutators/
* Conditionals Boundary
* Increments
* Invert Negatives
* Math
* Negate Conditionals
* Void Method Calls
* Empty returns
* False Returns
* True returns
* Null returns
* Primitive returns

profile `default` 20% coverage 3/15 @12.148s

2. Stronger
* all from Default config
* Remove Conditionals
* Experimental Switch

profile `stronger` 16% coverage 3/19 @12.285s


3. All mutators
* all from stronger config
* Inline Constant
* Constructor Calls
* Non Void Method Calls
* Remove Increments
* Experimental Argument Propagation
* Experimental Big Integer
* Experimental Member Variable
* Experimental Naked Receiver
* Negation
* Arithmetic Operator Replacement
* Arithmetic Operator Deletion
* Constant Replacement
* Bitwise Operator
* Relational Operator Replacement
* Unary Operator Insertion

profile `all` 16% coverage 29/179 @17.059s

# Google's mutators

From this [research](https://static.googleusercontent.com/media/research.google.com/en//pubs/archive/46584.pdf) 
google uses a standard of 4 mutators to verify a tests value. These are:
* AOR Arithmetic operator replacement
* LCR Logical connector replacement
* ROR Relational operator replacement
* UOI Unary operator insertion
* SBR Statement block removal stmt

12.868 s