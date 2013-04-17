# Michael Hamrah's giter8 template for projects using GitHub #

This is a fork from @ymasory's [sbt.g8 template](https://github.com/ymasory/sbt.g8).  I've bumped up versions, defaulted tests to specs2, and made some configuration changes.

## Template Usage and Info

- Do a local deploy of your modified template and try it out.

```sh
$ cd sbt.g8
$ rm -rf target
$ sbt
> g8-test # must result in SUCCESS
> exit
$ cd target/sbt-test/default-*/scripted
$ java -jar target/*-assembly-*.jar # must print "hello sbt.g8"
```

- If you like your new template, push it to GitHub.

```sh
$ cd sbt.g8
$ git push
```

- You can now access your modified template using g8.

```sh
$ cd
$ g8 foo/sbt
```

- If you'd like to share your changes, send a pull request.
