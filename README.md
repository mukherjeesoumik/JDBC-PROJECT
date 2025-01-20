# JDBC Interview Questions
```cs
1. What is JDBC?
Answer: JDBC (Java Database Connectivity) is a Java API that enables Java applications to interact with 
relational databases. It provides a standard interface for connecting to a database, executing SQL queries, 
and processing the results. 
JDBC is platform-independent and is an essential component of Java for database-driven applications.


2. What is the difference between Statement and PreparedStatement?
Answer:
Statement: Used for executing simple SQL queries. It's not optimized and does not prevent SQL injection attacks.

PreparedStatement: Precompiles the SQL query, improving performance and security. It is used to execute 
parameterized queries, which prevents SQL injection.


3. What is a ResultSet?
Answer: A ResultSet is an object that holds the data retrieved from a database after executing a query. It represents 
the result of a query and allows you to iterate through the rows and columns returned by the query.


4. What is the difference between executeQuery() and executeUpdate()?
Answer:
executeQuery(): Used for executing SELECT queries and returns a ResultSet.
executeUpdate(): Used for executing INSERT, UPDATE, DELETE queries, and returns the number of rows affected by the query.

5. What is the use of Connection interface in JDBC?
Answer: The Connection interface represents a connection to the database. It is used to create Statement and 
PreparedStatement objects, manage transaction control (commit/rollback), and retrieve metadata about the database.


6. What is the role of the DriverManager class in JDBC?
Answer: DriverManager is used to manage a list of database drivers. It is responsible for establishing a connection to 
the database by selecting an appropriate driver based on the provided database URL.


7. What is SQLException in JDBC? 
Answer: SQLException is a standard exception in JDBC that handles database-related errors. It provides information about 
the database interaction error, such as error code, SQL state, and the exception message.


8. What is the use of close() method in JDBC?
Answer:
close(): Closes the database connection, releasing the resources used.



9. Explain the concept of Batch Processing in JDBC.
Answer: Batch processing allows you to execute multiple SQL queries in one go, which improves performance by 
reducing the number of round trips to the database. You can add multiple statements to a batch using addBatch() and 
execute them using executeBatch().


10. What is ResultSetMetaData?
Answer: ResultSetMetaData provides information about the columns of a ResultSet, such as the number of columns, the 
column names, and their types. It is used to get metadata about the result set.



11. What is the difference between execute() and executeQuery() in JDBC?
Answer:
execute(): It can execute any type of SQL statement (e.g., SELECT, INSERT, UPDATE, DELETE, or DDL statements like CREATE,
DROP). It returns a boolean value to indicate if the result is a ResultSet or an update count.
executeQuery(): Specifically used for SELECT queries, it returns a ResultSet containing the result set.


12. Can we use JDBC to interact with NoSQL databases?
Answer: No, JDBC is designed to interact with relational databases (SQL-based databases). NoSQL databases use different 
mechanisms and APIs to interact with data. For example, MongoDB has its own Java driver for interaction.



13. What are the common exceptions in JDBC?
Answer: Common exceptions in JDBC include:
SQLException: General SQL-related exceptions.
Class not found exception



14. How do you handle errors in JDBC?
Answer: Errors in JDBC are handled using try-catch blocks. You can catch SQLException and use its methods 
(getMessage(), getErrorCode(), getSQLState()) to retrieve information about the error. Proper exception handling 
ensures that resources (e.g., Connection, Statement, ResultSet) are closed in the finally block.

```
