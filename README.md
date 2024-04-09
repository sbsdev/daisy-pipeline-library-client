# Test client for the DAISY Pipeline 2 Java API

A prototype client to test the use of the [DAISY pipeline](http://daisy.github.io/pipeline/)
directly as a Java library instead of via client-server communication as outlined in the section
[Java API](http://daisy.github.io/pipeline/Get-Help/API-Documentation/) in the documentation.

See also the related discussion at https://github.com/daisy/pipeline/discussions/772

## Build and execute

```
mvn -B compile exec:java -Dexec.mainClass="ch.sbs.pipeline.Client"
```
