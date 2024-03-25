https://maven.apache.org/guides/mini/guide-creating-archetypes.html
https://maven.apache.org/archetype/maven-archetype-plugin/advanced-usage.html

inside root of this project run below cmd to install the archetype to local maven repo
```
mvn install
```

Now run below command to generate new project using archetype
```
mvn archetype:generate -DarchetypeGroupId=com.tsm -DarchetypeArtifactId=tsm-archetype-id -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.tsm -DartifactId=test-custom-service

# (to disable interactive mode add -B flag)
mvn archetype:generate -B -DarchetypeGroupId=com.tsm -DarchetypeArtifactId=tsm-archetype-id -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.tsm -DartifactId=test-custom-service
```

kie-server model, kjar, service.
Also, to refer the archetype code of any archetype then we can extract jar under .m2 folder
```

mvn archetype:generate -B -DarchetypeGroupId=org.kie -DarchetypeArtifactId=kie-model-archetype -DarchetypeVersion=7.52.0.Final -DgroupId=com.tsm -DartifactId=tsm-model -Dversion=1.0-SNAPSHOT -Dpackage=com.tsm.model

mvn archetype:generate -B -DarchetypeGroupId=org.kie -DarchetypeArtifactId=kie-kjar-archetype -DarchetypeVersion=7.52.0.Final -DgroupId=com.tsm -DartifactId=tsm-kjar -Dversion=1.0-SNAPSHOT -Dpackage=com.tsm

mvn archetype:generate -B -DarchetypeGroupId=org.kie -DarchetypeArtifactId=kie-service-spring-boot-archetype -DarchetypeVersion=7.52.0.Final -DgroupId=com.tsm -DartifactId=tsm-service -Dversion=1.0-SNAPSHOT -Dpackage=com.tsm.service -DappType=bpm

launch.bat clean install (inside service)

now go to localhost 8080

```
