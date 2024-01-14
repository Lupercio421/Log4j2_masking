# Fixing the Log4J - Log Event Pattern Converter Class Error

Hey everyone!

I needed to do some research on Spring Boot logging frameworks for a project. I noticed that Log4j2 and Logback were the frameworks returned in most Google search results. I needed to learn how to mask sensitve information in my logs, that are shown onto the console. So I had to do more research on this.

Earlier this week I took the time out to read "Securing Log Data: How to Mask Sensitive Data in Logs"[https://bootcamptoprod.com/how-to-mask-sensitive-data-in-logs/], written by
[Bunty Raghani](https://github.com/BuntyRaghani).

The article was informative and detailed how to write a Java class that extends the [CompositeConverter](https://logback.qos.ch/apidocs/ch/qos/logback/core/pattern/CompositeConverter.html) class from the logback library. While also showing an example of class that extends the [LogEventPatternConverter](https://logging.apache.org/log4j/2.x/javadoc/log4j-core/org/apache/logging/log4j/core/pattern/LogEventPatternConverter.html) class from Log4j.

I ran into some issues getting the Log4j2 example to work, and I couldn't make out what the errors were from the provided SpringBoot application code. So I got to digging even more. It turned out I needed to work on the maven dependencies in the pom.xml file.

This repository has the source code of the working LogEventPatternConverter example provded in the article. 

Thanks!