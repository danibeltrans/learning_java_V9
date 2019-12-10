# Learning V9 Project
This project has the goal to learn about the new releases from Java 9 

## Important Features 

### Modularity 
Some commands

```
javac --module-source-path src -d out $(find . -name '*.java')
java --module-path out -m example/javamodularity/Main 
```

### Optional 
* ifPresentOrElse()
* or()
* stream()


### Collection
* New ImmutableCollections
* Factory methods: of() 

### Stream.collect()
* filtering()
* flatMapping()

### Interface 
* Private Methods 