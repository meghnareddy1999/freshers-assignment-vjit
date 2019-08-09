In order to start off the project in a systematic manner some part of the dev-ops features were used in the implementation of the project. I initially started off with planning on exploring the different technologies that I’d be working on as I was unaware of them. After a lot of research on how to go about I finally made a plan on the requirements as well as on how I’d be implementing them.
 According to the specifications mentioned about the technologies which are supposed to be used the project was purely implemented using Eclipse as an IDE platform with maven as a project file and Java in order to write the code. As there was no need to use any graphical user interface the code was written in java using command line arguments while the user is given the choice to enter his details and continue with selecting the type of waste he’d like to donate, brand etc.

Cleaniness is the cause of destruction of many things and approaching that problem technologically is making me feel better about 
the profession that I am going to be a part of.
As a part of the solution, I have followed the instructions given in the README file. Initially, a user is asked whether 
he's a new user or an existing file. In case he's a new user, his details are taken as the input and stored inside the XML 
file using the DOM Parser concepts and extremely handy classes like DocumentBuilder. I initially tried implementing it using J
SON objects by adding a couple of maven dependencies instead of downloading the required packages. It produced a couple of errors that 
were a little hard to comprehend. It's because of that - that I went ahead and implemented the DOM Parsers concept. In case the user is
old, I retrieved his credentials from the XML file and compared it with the input that the user gave. Post the verification/ registration, 
the user is asked about the catgory of waste that he'd like to report. Based on the category and the quantity entered by the user, the 
points will be generated and a random coupon code ( Using different string variables like numbers, alphabets, and special characters and concatenating them. They can be called by using the using the math.random() which generates random codes) that are displayed to the user along with the number of points that he’d earned.will be assigned to it and notified to the user. Inspired by the DevOps way of 
operating, I wrote little snippets of code and kept testing them (and deploying it on GitHub). 

I would like to propose to you an alternative solution that I would have approached if the requirements weren't specified.
1. Making use of a could provider like AWS or Azure in order to store the details of the user. Considering the fact that the amount of 
data that could be generated is unpredictable and depends on the success of the app, the scalability and pay as you go feature will help
in making sure that we invest just the right amount in deploying the app. We could host our website using an EC2 instance and attach it 
with either an EBS/NFS/S3 type of storage. SInce health checks are available, we will easily get notified if the application id down.
2. Implementing a couple of machine learning techniques that can help us do the following :
  1) Identify loyal users who use the app more frequently and give them extra rewards for loyalty.
  2) Identify the inactive users and send them notifications that can motivate them to use the app more, hence quicken the process of 
  cleaning the nation.
  3) Identify the users who registered but never used the app - and ask them to make their first ever step towards a cleaner planet.
  4) Analyse how much the app is being used in order to come up with new ideas to increase the usage.
3. Since the application is more likely to be deployed by the government, and presuming that most of the citizens have an aadhar card that 
has their thumb prints, we could give a sign in option as their finger print it self and match it with the one in the database. That way 
the user doesn't have to remember their password!
