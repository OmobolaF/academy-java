/**
TYPES OF METHOD REFERENCES
**************************

There are four type method references that are as follows:

1. Static Method Reference.
2. Instance Method Reference of a particular object.
3. Instance Method Reference of an arbitrary object of a particular type.
4. Constructor Reference.

To look into all these types we will consider a common example of sorting with a comparator which is as follows:

TYPE 1: REFERENCE TO A STATIC METHOD
************************************

If a Lambda expression is like:

// If a lambda expression just call a static method of a class 
(args) -> Class.staticMethod(args)  

Then method reference is like:

// Shorthand if a lambda expression just call a static method of a class 
Class::staticMethod  


TYPE 2: REFERENCE TO AN INSTANCE METHOD OF A PARTICULAR OBJECT
**************************************************************

If a Lambda expression is like:

// If a lambda expression just call a default method of an object 
(args) -> obj.instanceMethod(args) 

Then method reference is like:

// Shorthand if a lambda expression just call a default method of an object 
obj::instanceMethod


TYPE 3: REFERENCE TO AN INSTANCE METHOD OF AN ARBITRARY OBJECT OF A PARTICULAR TYPE
***********************************************************************************

If a Lambda expression is like:

// If a lambda expression just call an instance method of a  ObjectType 
(obj, args) -> obj.instanceMethod(args) 
          p -> p.getPrice()

Then method reference is like:

// Shorthand if a lambda expression just call an instance method of a ObjectType 
ObjectType::instanceMethod 
Product::getPrice

TYPE 4: CONSTRUCTOR METHOD REFERENCE
************************************

If a Lambda expression is like: 

// If a lambda expression just create an object 
(args) -> new ClassName(args) 

Then method reference is like: 

// Shorthand if a lambda expression just create an object 
ClassName::new 


REFERENCES
**********

https://www.geeksforgeeks.org/method-references-in-java-with-examples/
 * 
 */
package com.bptn.course._27_method_reference;

/**
 * 
 */
public class MethodReferenceTypes {

}
