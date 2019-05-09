# SpringBootSetting

* This is about how to first setting for Spring Boot.
* I used on Visual Studio Code.
* Also used mybatis for convenience.
* Be careful with entering. I had several errors because I didn't use enter on mybatis-config.xml
* This setting can help you to print "this is home"(localhost:8080) and list which is on your database(localhost:8080/api).
---
* 1)First, go to https://start.spring.io/ ,I used gradle project, java, 2.1.4, and added two dependencies, web and devtools.
* 2)Opened that file on VSCode, and go to the "build.gradle", and added dependencies.
* 3)And opened "application.properties" on resources/, and added properties include mybatis.
* 4)Created "mybatis-config.xml" on resources/ and added code.
* 5)Created folder "mapper" on com/example/realbatis/ , and added BasicMapper.java and wrote codes.
* 6)Created folder "mapper" on resources/, and created BasicMapper.xml on that folder, and wrote codes.
* 7)On main class, added sqlSessionFactory code.
* 8)Created folder "controller" on com/example/realbatis/, and made HomeController.java and wrote codes.

* 9)Press F5 and check launch.json
* 10)One more press F5, then server will start.

* 11)Check "localhost:8080/" and "localhost:8080/api"
