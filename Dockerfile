FROM jboss/wildfly:10.1.0
ADD ./target/hello-javaeerest.war /opt/jboss/wildfly/standalone/deployments/
