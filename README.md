# DemoBlaze

Proyecto realizado con:
Cucumber Java
Cucumber JUnit
Maven
Selenium Java

Pre-requisitos para ejecutar por consola:
Verificar que esté instalado maven: mvn -version
- Si no lo está:
1. Descargar: https://maven.apache.org/download.cgi => apache-maven-3.6.3-bin.zip
2. Configurar variables de entorno M2_HOME,MAVEN_HOME,path

Modos de ejecución:

* Consola = Ejecutar mvn verify (Generará un reporte HTML completo, el cual se encuentra en la ruta: target/cucumber-report-html/js/SmokeTest.html)
* Desde el IDE opción 1 = Seleccionar proyecto, run as -> Maven Test (Generará reporte simple html, ubicado en Target/HtmlReports/index.html)
* Desde el IDE opción 2 = Desde el archivo TestRunner (Ubicación DemoBlaze\src\test\java\runner\TestRunner.java), run as -> JUnit Test (Generará reporte simple html, ubicado en Target/HtmlReports/index.html)



