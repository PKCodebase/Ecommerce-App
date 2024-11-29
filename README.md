E-commerce Project
This is a Spring Boot-based e-commerce project that provides features for user authentication, product management, and order management. It integrates Swagger UI for API documentation, which makes testing and using the APIs easier. The project follows a RESTful approach to build the backend services.

Features:
User Authentication: Secure login and registration with password encryption.
Product Management: APIs for adding, updating, deleting, and listing products.
Order Management: APIs for creating and managing orders.
Swagger UI: Interactive API documentation and testing interface.
Role-Based Access: Users can have different roles (e.g., ROLE_USER).
JWT Authentication: Secures API access using JSON Web Tokens (JWT).

Prerequisites:
Java 17 or later
Maven (for building and running the project)
MySQL (or any relational database of your choice)
Postman (optional, for testing API endpoints)

API Documentation:

Swagger UI:
Once the application is running, you can access the Swagger UI to view and test the API endpoints:

Swagger UI URL: http://localhost:8080/swagger-ui/index.html
The Swagger UI provides an interactive interface to explore all available APIs in the project, such as:

Signup API: User registration and login.
Product API: CRUD operations for managing products.
Order API: Order creation, management, and status tracking.

1. Authentication Endpoints
User Registration (POST)
POST:/api/auth/signup
Description: Register a new user with username, email, and password.

User Login (POST)
POST: /api/auth/login
Description: Login a user with username and password, and get a JWT token.

The token can be used to authenticate requests for protected endpoints.

2. Product Endpoints
Get All Products (GET)
GET: /api/products
Description: Retrieve a list of all products.

Get Product By ID (GET)
GET: /api/products/{id}
Description: Get details of a single product by its ID.

Create a Product (POST)
POSt: /api/products
Description: Add a new product to the system.

Update Product (PUT)
PUT: /api/products/{id}
Description: Update an existing product's details.

Delete Product (DELETE)
DELETE: /api/products/{id}
Description: Delete an existing product by its ID.

3. Order Endpoints
Create an Order (POST)
POST: /api/orders
Description: Create an order for a logged-in user.

Get Orders By User (GET)
GET: /api/orders
Description: Get all orders for a logged-in user.

4. Swagger UI URL
URL: http://localhost:8080/swagger-ui/index.html
The Swagger UI provides an interactive interface to view and test all these endpoints.

5. Security
For endpoints that require authentication (e.g., creating orders, accessing user orders), you need to include the JWT token in the request header:

Authorization: Bearer <JWT_TOKEN>
These are the core endpoints for your Ecommerce Project. Each endpoint serves a different purpose based on user management, product operations, and order handling. Let me know if you need further adjustments or additional information!












