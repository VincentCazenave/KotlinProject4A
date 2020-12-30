// TODO{
    - UnitTest
    - Add call/msg/mail buttons in contact detail page
    - Search Bar
    - Design
    - Image list + details
}









# KotlinProject4A

APPLICATION : Contacts

        For this school project, we had to implement an application using kotlin on android studio. 
        We could choose the application of our choice using MVVM Architecture as well as Clean Architecture. 

INSTRUCTIONS RESPECTED: 

        - Use RecyclerView to display a list of object
        - Use a Rest API to get the data to display
        - Use Room in order to implement a login (allowing to access the app or create an account)
        - MVVM Architecture
        - Clean Architecture    
        - Design
        - Display an object details from the RecyclerView
        - Search Barre ?

FEATURES:

    First Screen:
            
        -> Login Page: On this page you can sign in or sign up to the application.
                       If you try to connect with an inexistant user, a pop-up apperas to warn you.
                       If you successfully create a user, a pop-up appears to welcome you.
                       If you try to create a user that already exists, an error pop-up appears. (checker peut être seulement le pseudo?)
                           
               Finally, if you log in successfully, a new Activity starts.
        
   Second Screen: 
        
       ->  Contact List Page: On this page is displayed all the contacts from your Rest API. 
                              You can see the avatar of each contacts, their name and phone number.
            
                       You can also click on one object to display its details in the Third Screen.
        
   Third Screen:
  
       -> Contact Detail: On this page, you can see the details of one contact. 
                          There is the avatar of the contact (the picture associated to the contact),
                          the name, the phone number, the mail address and the birthdate.
                          There are buttons to call, send message or mail as well.
                               
                               
POSSIBLE FEATURES TO ADD: 
            
        - Modify contact details in the third screen
        - A search bar in the Second Screen
        - A better desgin
                               
    
