# Software Implementation class 2023
POV: They force you to use java

![](https://i.giphy.com/media/RE4MAgUZYyGcwSQlhF/giphy.webp) 

## Temporal docs:

- Create user: curl -X POST localhost:8080/employees -H "Content-Type: application/json" -d '{"name": {"title": "Mr", "firstName": "Bob", "surname": "Deez"}, "phoneNumber": "1276", "dateOfBirth": {"day": 12, "month": 2, "year": 2004}, "startDate": {"day": 1, "month": 12, "year": 2022}, "salary": 100000}'

- Delete all users: curl -X DELETE localhost:8080/employees

