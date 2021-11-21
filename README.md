# Quiz3_AnnaZakaidze
Build automation test in IntelliJ IDEA

 - Create test class in `src/test/java` named `SelenideBasics2Test.java` 
- Write a test that does the following: 

 - Open the chrome browser 
 - Navigate to the https://demoqa.com/books 
 - Using inner elements locators chain Find all books with publisher 'O'Reilly Media' containing title 'Javascript'
(Example : $(".container").$(".subarea").$(withText("ezburger")); , Slide N 14)
 - Check with selenide soft assertions that size of returned list equals to 10(failed case) 

Push the final version to a git repository and attach the link here.