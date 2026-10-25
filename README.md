# Smart Parking System — Strategy Pattern
**Student:** Assylzhan Abishev  
**Group:** SE-2512


## 1. Project Description

Smart Parking System is a Java application that helps drivers choose the best parking spot based on different criteria.

The project uses the Strategy Design Pattern to switch between different parking selection algorithms at runtime.

## 2. Strategy Pattern Implementation

The system includes three strategies:

1. **NearestSpotStrategy** — finds the nearest parking spot by comparing distances.
2. **CheapestSpotStrategy** — finds the cheapest parking spot by comparing prices.
3. **LargestSpotStrategy** — finds the largest parking spot by comparing sizes.

### Main Components

- **ParkingStrategy** — interface that defines the `findSpot()` method.
- **Concrete Strategies** — three classes that implement different parking selection algorithms.
- **ParkingContext** — stores the selected strategy and allows changing it at runtime.
- **Main** — creates parking spots and demonstrates strategy switching.
- **ParkingSpot** — stores information about each parking spot.

## 3. Clean Code Principles

### 1. Single Responsibility Principle

Each strategy class has only one responsibility. For example, NearestSpotStrategy only finds the nearest parking spot.

### 2. Polymorphism Instead of Conditional Logic

The Context uses the Strategy interface instead of `if` or `switch` statements to select algorithms.

## 3. Project Structure

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

## 4. Example Output

```text
Nearest spot: A2
Cheapest spot: A3
Largest spot: A3
```


## 5. Conclusion

This project demonstrates the Strategy Design Pattern in Java. It allows users to change parking selection algorithms without modifying the Context class.

The Strategy Pattern makes the application flexible, readable, and easy to extend.