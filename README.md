# NeoCafe 
![photo5364332806479657303](https://user-images.githubusercontent.com/89988823/147777839-514baca2-6dd5-428a-85fc-de5f29647ca4.jpg)

### This Application for clients in cafe
[Code of the project](https://github.com/neocafe5/Android/tree/chip-groups) in GitHub

[Open](https://schedulecs.herokuapp.com/) the site on Heroku

![photo5364332806479657302](https://user-images.githubusercontent.com/89988823/147777860-a6cc86e8-b66e-4417-a6f5-681bddbe4434.jpg)
![photo5364332806479657301](https://user-images.githubusercontent.com/89988823/147777938-9d3fa161-0027-47ff-be80-41d4c1162ddd.jpg)
![photo5364332806479657300](https://user-images.githubusercontent.com/89988823/147777942-6fee32e7-7667-4e06-a211-c594b127bf6c.jpg)
![photo5364332806479657297](https://user-images.githubusercontent.com/89988823/147777956-198c4902-be93-48f0-ada9-ad954dc0de1c.jpg)
![photo5364332806479657298](https://user-images.githubusercontent.com/89988823/147777958-54ede8cc-fd87-41d3-b4bb-4d30abb78a43.jpg)
![photo5364332806479657299](https://user-images.githubusercontent.com/89988823/147777960-f3659f81-689f-4223-aa66-b01966b9da70.jpg)
![photo5364332806479657295](https://user-images.githubusercontent.com/89988823/147777968-96388b01-de82-4b35-8e0c-bddd8b968f76.jpg)
![photo5364332806479657296](https://user-images.githubusercontent.com/89988823/147777972-c625fe1f-8b42-4e48-9028-f70b0fb385a7.jpg)



## API Description:

* To view schedule: **/**
* To view all data from database: **/all**
* To view only professors from database: **/professors**
* To view only subjects from database: **/subjects**
* To view only groups from database: **/groups**
* To view one data with more information: for professors -> **/subjects/{id}** for subjects -> **/subjects/{id}** for groups -> **/groups/{id}**
* To add new data using **POST** request: for professors -> **/professors-add** for subjects -> **/subjects-add** for groups -> **/groups-add**
* To **edit** one separated data by using POST request: 
      for professors -> **/professors/{id}/edit** for subjects -> **subjects/{id}/edit** for groups -> **/groups/{id}/edit**
* To **delete** one separated data by using POST request:
      for professors -> **/professors/{id}/edit** for subjects -> **/subjects/{id}/edit** for groups -> **/groups/{id}/edit**

Now, you can just add and see data, but soon it will be available to autogenerate the schedule for universities:)
