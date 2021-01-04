# spring-on-heroku
<h1 align= "center">  Spring Boot Application Start On Heroku </h1>

1️⃣ Firstly create a spring-boot initialize

2️⃣ Go to the spring project folder and open terminal window then create heroku project:
```
heroku create
```
3️⃣ Heroku generate a random project name for you. If you change the project name :
```
heroku apps:rename --app <here is random project name of heroku > <write a project name here>
```
4️⃣ Create git repository and update:
```
git init
git add .
git commit -m 'initial commit'
```
You can using Git or gitHub repository:
* Using Git:
```
git remote add heroku https://git.heroku.com/tugrankenger-springboot.git
git push heroku master
```
* Using gitHub:
```
git remote add origin https://github.com/tugrankenger/spring-on-heroku.git
git push origin master --force
```
✅ Finally, if you used to gitHub repository, you have to go to heroku and connect your github repository and deploy  
