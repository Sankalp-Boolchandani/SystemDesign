# Prototype Designer Pattern:
- Prototype DP is used when we want to create a new object of a class that contains complex logics
or big files that might take some time for loading. 
- Such objects would take overhead for creation, and it would be a bad practise to create such big objects again and again. 
- So using Prototype DP, we create the object of a complex class
only once and if its required to create a similar object again, we clone the object.
- Initially Prototype DP implements **SHALLOW COPYING** of the objects
- **What is Shallow copying??** --- shallow copying is when we copy an object, the nested objects inside it are not copied completely and only a reference of them is copied.
- Say suppose we create obj1 and clone obj2 from it, if we change the obj1 data, data in obj2 also changes and vice versa.
- to overcome this, we use **DEEP COPY**
- **what is Deep Copy??** --- deep copy is when we copy all the nested objects of the main object(obj1 here) and even if we change the contents of obj1, obj2 stays intact.
- Deep copying is achieved by overriding clone() method
- This is the complete working of Prototype DP.