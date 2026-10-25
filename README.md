# Smart Parking System — Strategy Pattern

**Student:** Assylzhan Abishev  
**Group:** SE-2512

## 1. Project Description

Smart Parking System is a Java application that helps drivers choose the best parking spot based on different criteria.

The project uses the Strategy Design Pattern to switch between different parking selection algorithms at runtime.

The system also handles empty parking lists and displays a message when no parking spots are available.

## 2. Strategy Pattern Implementation

The system includes three strategies:

1. **NearestSpotStrategy** — finds the nearest parking spot by comparing distances.
2. **CheapestSpotStrategy** — finds the cheapest parking spot by comparing prices.
3. **LargestSpotStrategy** — finds the largest parking spot by comparing sizes.

### Main Components

- **ParkingStrategy** — interface that defines the `findSpot()` method.
- **Concrete Strategies** — three classes that implement different parking selection algorithms.
- **ParkingContext** — stores the selected strategy and allows changing it at runtime.
- **Main** — creates parking spots and demonstrates strategy switching and empty list handling.
- **ParkingSpot** — stores information about each parking spot and displays its details.

## 3. Clean Code Principles

### 1. Single Responsibility Principle

Each strategy class performs only one algorithm. For example, NearestSpotStrategy finds the nearest parking spot.

### 2. Meaningful Names

Classes and methods have clear names, such as `findSpot()`, `getPrice()`, and `setStrategy()`.

### 3. Polymorphism Instead of Conditional Logic

The Context uses the ParkingStrategy interface instead of `if` or `switch` statements to select algorithms.

### 4. Open/Closed Principle

New strategies can be added without modifying the existing Context or other strategy classes.

### 5. Encapsulation

ParkingSpot uses private fields and public getter methods to control access to its data.

### 6. Defensive Programming

ParkingContext checks whether the parking list is null or empty before executing a strategy.

This prevents errors when no parking spots are available.

## 4. Project Structure

```text
Asik5SDP/
├── src/
│   ├── Main.java
│   ├── ParkingSpot.java
│   ├── ParkingStrategy.java
│   ├── ParkingContext.java
│   ├── NearestSpotStrategy.java
│   ├── CheapestSpotStrategy.java
│   └── LargestSpotStrategy.java
└── README.md
```

## 5. Example Output

```text
Nearest spot: Parking Spot: A2, Distance: 50m, Price: 300.0 KZT, Size: 20 m2
Cheapest spot: Parking Spot: A3, Distance: 200m, Price: 200.0 KZT, Size: 25 m2
Largest spot: Parking Spot: A3, Distance: 200m, Price: 200.0 KZT, Size: 25 m2

Testing empty parking list:
No parking spots available.
Result: null
```

## 6. Conclusion

This project demonstrates the Strategy Design Pattern in Java. It allows users to change parking selection algorithms at runtime without modifying the Context class.

The application also handles empty parking lists and provides detailed information about selected parking spots.

The Strategy Pattern makes the code flexible, readable, and easy to extend.
