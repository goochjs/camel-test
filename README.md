camel-test
==========

Experiments with Apache Camel


Exposes a RESTful API, connected to ActiveMQ

The following URL and payload causes the exchange to happen.  

POST http://localhost:8890/rest/customers/{type}
  <?xml version="1.0" encoding="UTF-8"?>
  <Customer>
    <name>Fred Bloggs</name>
    <id>123456</id>
  </Customer>

Output in the console.


The following is needed to run this

  features:addUrl mvn:org.apache.activemq/activemq-karaf/5.6.0/xml/features
  features:install activemq-blueprint activemq-spring activemq-camel camel-protobuf
  activemq:create-broker

  install mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.protobuf-java/2.4.1_1
  install mvn:org.goochjs/camel-test/0.0.1-SNAPSHOT
  
