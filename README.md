# Michael Hamrah's giter8 template for Akka-based projects #

Starts of with [n8han/giter8.g8](https://github.com/n8han/giter8.g8) and adds some default dependencies and template files.

```
#Apply this template
g8 mhamrah/sbt
```

```
#Also features a template for Spray-Routing apps
g8 mhamrah/sbt -b spray

#And for Spark Apps
g8 mhamrah/sbt -b spark
```

## Notes

- Use Scala 2.11.1 and sbt 0.13
- Consolidated build.sbt file: akka, scalatest, logback, typesafe config and slick are included.
- [SBT Native Packager](https://github.com/sbt/sbt-native-packager) for distributions

[Read about g8](http://github.com/n8han/giter8#readme)
