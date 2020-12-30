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
        - Splash Screen

FEATURES:

   Splash Screen:
   
   ![SplashScreen](https://user-images.githubusercontent.com/65124142/103382297-d1f37f80-4aee-11eb-9ef1-fc06bf63732a.PNG) 

   First Screen:
            
        -> Login Page: On this page you can sign in or sign up to the application.
        
  ![Login](https://user-images.githubusercontent.com/65124142/103382331-f64f5c00-4aee-11eb-8b8a-bfd175785996.PNG)

                       If you try to connect with an inexistant user, a pop-up apperas to warn you.
                       
  ![Compte inconnu](https://user-images.githubusercontent.com/65124142/103382365-167f1b00-4aef-11eb-9f29-4e93acb8e97b.PNG)
                     
                       
                       If you successfully create a user, a pop-up appears to welcome you.
                       
   ![Bienvenue](https://user-images.githubusercontent.com/65124142/103382378-24cd3700-4aef-11eb-901f-905996e8f5c7.PNG)

                       
                       If you try to create a user that already exists, an error pop-up appears. 
                       
   ![existant](https://user-images.githubusercontent.com/65124142/103382391-2eef3580-4aef-11eb-8f8e-a45bb3e69bea.PNG)

                       
                           
               Finally, if you log in successfully, a new Activity starts.
        
   Second Screen: 
        
       ->  Contact List Page: On this page is displayed all the contacts from your Rest API. 
                              You can see the avatar of each contacts, their name and phone number.
                              
   
![Liste](https://user-images.githubusercontent.com/65124142/103382432-534b1200-4aef-11eb-9a0b-adcd40d1ca23.PNG)
                           
            
                       You can also click on one object to display its details in the Third Screen.
        
   Third Screen:
  
       -> Contact Detail: On this page, you can see the details of one contact. 
                          There is the avatar of the contact (the picture associated to the contact),
                          the name, the phone number, the mail address and the birthdate.
                          There are buttons to call, send message or mail as well.
                          
      

![detailContact](https://user-images.githubusercontent.com/65124142/103382445-5e9e3d80-4aef-11eb-83c9-15e313d990e2.PNG)
                    
                               
                               
POSSIBLE FEATURES TO ADD: 
            
        - Modify contact details in the third screen
        - A search bar in the Second Screen to search for a particular contact
        - Upgrade the design
                               
    
