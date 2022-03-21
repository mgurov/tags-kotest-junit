## Primary Objective

Execute all JUnit and Kotest tests marked with the same tag together, e.g. something like 

```
./gradlew clean test \
    -Dkotest.tags='integration' -DincludeTestTags='integration'
```

should pick and execute `JunitIT` and `KotestIT`, leaving `JUnitTest` and `KotestTest` out.