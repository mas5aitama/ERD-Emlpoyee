# -- ERD-Emlpoyee

# Spring Boot + Kotlin + Angular + MySql 

1. Open this project
2. open cmd in this project, 
3. write this --> mvn clean install -DskipTests. To download Maven.
5. open xampp and activated.
4. crate, database employee. And automatically in the employee database.
5. open http://localhost:5758/ --> to showing web and CRUD 

# REST CRUD
7. open http://localhost:5758/employee --> to showing rest
8. open http://localhost:5758/employee/1 --> to showing ID employee by rest
9. open Postman insert this http://localhost:5758/employee. Choose Mode POST, Select Body and raw, also JSO. Insert this data : 
   {   "id":100,
      "name":"pandhuta",
      "age":30,
      "dept":"Developer"
   }
   
 9.  open Postman insert this http://localhost:5758/employee. Choose Mode PUT, Select Body and raw, also JSO. Insert this data :
   {   "id":100,
      "name":"pandhuta bangkit",
      "age":30,
      "dept":"Developer"
   }
   
 10. open Postman choose delete this http://localhost:5758/employee/100 --> Delete by ID Employee


