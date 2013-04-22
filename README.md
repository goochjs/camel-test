camel-test
==========

Experiments with Apache Camel


Exposes a RESTful API, connected to ActiveMQ

The following URL and payload causes the exchange to happen.  

    POST http://localhost:8892/rest/customers/gold?active=false
      <?xml version="1.0" encoding="UTF-8"?>
      <Customer>
        <name>Fred Bloggs</name>
        <id>123456</id>
      </Customer>

Output in the log file.

Fire up **ServiceMix 4.5.1** and run the following commands into it:-
  
    install mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.protobuf-java/2.4.1_1  
    install mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.aspectj/1.6.8_2
    install mvn:org.codehaus.jackson/jackson-xc/1.9.7
    install mvn:org.codehaus.jackson/jackson-jaxrs/1.9.7
    install mvn:org.codehaus.jackson/jackson-core-asl/1.9.7
    install mvn:org.codehaus.jackson/jackson-mapper-asl/1.9.7
    install mvn:org.goochjs/camel-test/0.0.1-SNAPSHOT
    dev:restart


For reference, the XSD (under resources) was converted into a Java class via the command:-

    xjc Customer.xsd -p org.goochjs.cameltest -d ..\java
  
