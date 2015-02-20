# MavenGwt2-7Debug
Test de Gwt 2.7 con Maven y Debbuging OK

Agregar Action:

gwt:debug -e -X

runTarget=welcomeGWT.html
superDevMode=false

Modificar POM:

<gwt.version>2.7.0</gwt.version>

<artifactId>gwt-dev</artifactId>


Asegurar que el GWT Maven Plugin sea la última versión
<groupId>org.codehaus.mojo</groupId>
<artifactId>gwt-maven-plugin</artifactId>
<version>2.7.0</version>



