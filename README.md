# Bank-Account-Application

## Scenario: You are a back-end developer and need to create an application to handle new customer bank account requests.

1. The application should do the following:

2. Read a .csv file of names, social security numbers, account type, and initial deposit

3. Use a proper data structure to hold all these accounts

4. Both savings and checking accounts share the following properties:

     1. deposit()
   
     2. withdraw()
   
     3. transfer()
   
     4. showInfo()

     5. 11-digit Account Number (generated with the following process:1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number, and random 3-digit number)<br>


6. Savings Account holders are given a Safety Deposit Box, identified by 3-digit number and accessed with a 4-digit code.

7. Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN 

8. Both account will use an interface that determines the base interest rate.

9. Savings accounts will use .25 points less than the base rate

10. Checking accounts will use 13% of the base rate

11. The showInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account.

## What I learned from this project:
1. Learn to develop a robust application architecture

2. Use when to use abstract classes and abstract methods

3. Use an interface API to receive information from a developer’s application

4. Explore constructors deeper and use the super() keyword

5. Explore access modifiers and when to use public, private, or protected

6. Read data from a file and store in an appropriate data structure

7. Generate random numbers and work with String API
