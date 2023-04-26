# xslt-java

## How to call JAVA function in XSLT transformation 


### Content description:

`student.xsl` - XSLT transformation file

`StudentUtil.adjustName` - java method used in XSLT

`input.xml` - input source

`XsltTransformation` - class with main method

`Journal`, `Student` - java presentation of XML structure 

### How to run

#### Option 1. Executable JAR

1. `mvn clean package`
2. `java -jar ./target/xslt-java-0.0.1-SNAPSHOT-jar-with-dependencies.jar`

#### Option 2. Command line

1. Add `StudentUtil` compiled class to the classpath 
2. Add `saxon.jar` to the classpath
3. You can use a jar file  compiled by maven command `mvn clean package`

```shell
java -cp "./target/xslt-java-0.0.1-SNAPSHOT-jar-with-dependencies.jar" net.sf.saxon.Transform ./src/main/resources/input.xml ./src/main/resources/student.xsl
```
 
### Saxon Licensing

Running JAVA inside the XSLT is possible only with Saxon-PE or Saxon-EE versions.

So you can buy a license or request a trial one at https://www.saxonica.com/download/download.xml

Received license file `saxon-license.lic` put to the resources folder `src/main/resources`

For testing purposes you also may use Saxon version 9 but not from the official repository.
Check `pom.xml` for more details.