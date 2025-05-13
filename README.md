# AssetManager

The `AssetManager` project is a Java-based application designed to manage and calculate the value of various assets, such as houses and vehicles. It provides a framework for defining assets, calculating their current value based on specific criteria, and displaying detailed information about each asset.

## Features

- **Asset Management**: The application supports managing different types of assets, such as houses and vehicles.
- **Value Calculation**: Each asset type has its own logic for calculating its current value based on specific attributes.
- **Extensibility**: The project is designed to be extensible, allowing new asset types to be added easily by extending the `Asset` class.

---

## Asset Class

The `Asset` class is the base class for all assets in the application. It includes common properties such as:

- `description`: A brief description of the asset.
- `dateAcquired`: The date the asset was acquired.
- `originalCost`: The original cost of the asset.

Each subclass of `Asset` must implement the `getValue()` method to calculate the current value of the asset.
- `description`: A brief description of the asset.
- `dateAcquired`: The date the asset was acquired.
- `originalCost`: The original cost of the asset.


---

### Vehicle Class

The `Vehicle` class is a subclass of `Asset` that represents vehicles such as cars and motorcycles. It includes additional properties specific to vehicles:

- `makeModel`: The make and model of the vehicle (e.g., "Honda Civic").
- `year`: The year the vehicle was manufactured.
- `odometer`: The mileage of the vehicle in miles.

### Value Calculation for Vehicles

The value of a vehicle is calculated based on the following rules:

1. **Age-Based Depreciation**:
   - 0-3 years old: 3% reduction in value per year.
   - 4-6 years old: 6% reduction in value per year.
   - 7-10 years old: 8% reduction in value per year.
   - Over 10 years old: Fixed value of $1,000.

2. **Mileage Adjustment**:
   - If the odometer reading exceeds 100,000 miles, the value is reduced by 25%.
   - Exception: Vehicles with "Honda" or "Toyota" in the `makeModel` are not subject to the mileage adjustment.

---
---

### House Class

The `House` class is a subclass of `Asset` that represents houses such as family homes and cabins. It includes 
additional properties specific to houses:

- `address`: Address of house
- `condition`: Condition of house
- `squareFoot`: Square footage of house
- `lotSize`: Lot size of house

### Value Calculation for Vehicles

The value of a vehicle is calculated based on the following rules:

1. **Condition**:
    - A house's value is determined as
    - $180.00 per square foot (excellent)
    - $130.00 per square foot (good)
    - $90.00 per square foot (fair)
    - $80.00 per square foot (poor)
    - PLUS 25 cents per square foot of lot size

2. **Square Footage**:
    - multiplier by condition to determine initial value

3. **Lot size**:
    - .25c for additional lot size

---

## How to Run

1. Clone the repository to your local machine.
2. Build the project using Maven:
   ```bash
   mvn clean install