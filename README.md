camel-test
==========

Experiments with Apache Camel


Exposes a RESTful API, connected to ActiveMQ

Installation
------------

Fire up **ServiceMix 4.5.1** and run the following commands into it:-
  
    install mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.protobuf-java/2.4.1_1  
    install mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.aspectj/1.6.8_2
    install mvn:org.codehaus.jackson/jackson-xc/1.9.7
    install mvn:org.codehaus.jackson/jackson-jaxrs/1.9.7
    install mvn:org.codehaus.jackson/jackson-core-asl/1.9.7
    install mvn:org.codehaus.jackson/jackson-mapper-asl/1.9.7
    install mvn:org.goochjs/camel-test/0.0.1-SNAPSHOT
    feature:install camel-jetty
    dev:restart

Execution
---------

POSTing to the following URI including the payload will exercise the `newCustomer` method, which should respond with the word `gold` (or whatever you use instead of the last part of the URI).  

    POST http://localhost:8892/rest/customers/gold?active=false
      <?xml version="1.0" encoding="UTF-8"?>
      <Customer>
        <name>Fred Bloggs</name>
        <id>123456</id>
      </Customer>

    curl -X POST -H "Content-Type: application/xml" -d "<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Customer><name>Willy Wonka</name><id>987654</id></Customer>" http://localhost:8892/rest/customers/gold?active=false

GETting the following URI will exercise the `getCustomer` method and return the following payload.

    GET http://localhost:8892/rest/customers/gold?active=false
      <?xml version="1.0" encoding="UTF-8"?>
      <Customer>
        <name>Fred Bloggs</name>
        <id>123456</id>
      </Customer>


See also the output in the log file.


For reference, the XSD (under resources) was converted into a Java class via the command:-

    xjc Customer.xsd -p org.goochjs.cameltest -d ..\java
  
