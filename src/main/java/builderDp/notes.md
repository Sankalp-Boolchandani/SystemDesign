# Builder Design Pattern    
- builder design pattern includes creating a builder class inside or not inside the main class.
- Used to overcome factory design pattern limitation when a class has many variables. 
- Builder DP includes having a subclass or another class which has a build method, that calls the constructor of the main class.
- All the setters of the subclass return the object of a subclass itself method chaining to work and builder is implemented. 
- Inside the constructor of the main class, the variables are given the values coming from builder class object.