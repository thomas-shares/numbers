# numbers

Converts a number between 0 (zero) and 1000 (one thousand) to the correct
English written number.

## Installation

Run ```lein uberjar``` in the same directory as this file. This will download
all required dependencies and produce the jar file.

## Usage

Once compiled you can run it with the following command (still in the same
  directory)

    $ java -jar target/uberjar/numbers-0.1.0-SNAPSHOT-standalone.jar

## Options

Logging levels can be adjusted in the log4j.properties in the resources directory.

## Dependencies

Below is a list of all the dependencies and their license:

```clojure
([[org.clojure/math.combinatorics "0.1.1"] "Eclipse Public License 1.0"]
 [[org.clojure/clojure "1.8.0"] "Eclipse Public License 1.0"]
 [[org.tcrawley/dynapath "0.2.3"] "Eclipse Public License"]
 [[ordered "1.2.0"] "Eclipse Public License - v 1.0"]
 [[org.clojure/tools.reader "0.9.2"] "Eclipse Public License 1.0"]
 [[colorize "0.1.1"] "Eclipse Public License"]
 [[org.clojure/tools.macro "0.1.5"] "Eclipse Public License 1.0"]
 [[com.taoensso/tower "3.1.0-beta4"] "Eclipse Public License"]
 [[org.clojure/core.unify "0.5.2"] "Eclipse Public License 1.0"]
 [[log4j "1.2.17"] "The Apache Software License, Version 2.0"]
 [[org.clojure/tools.nrepl "0.2.12"] "Eclipse Public License 1.0"]
 [[potemkin "0.4.2"] "MIT License"]
 [[midje "1.8.3"] "The MIT License (MIT)"]
 [[marick/clojure-commons "1.1.3"] "The MIT License (MIT)"]
 [[org.clojars.brenton/google-diff-match-patch "0.1"] "Apache License 2.0"]
 [[clojure-complete "0.2.4"] "Eclipse Public License"]
 [[swiss-arrows "1.0.0"] "Eclipse Public License"]
 [[flare "0.2.9"] "Eclipse Public License"]
 [[org.slf4j/slf4j-api "1.7.1"] "MIT License"]
 [[marick/suchwow "4.4.3"] "The Unlicense"]
 [[clj-time "0.11.0"] "MIT License"]
 [[clj-tuple "0.2.2"] "MIT License"]
 [[cider/cider-nrepl "0.10.1"] "Eclipse Public License"]
 [[org.clojure/tools.logging "0.3.1"] "Eclipse Public License 1.0"]
 [[com.rpl/specter "0.9.0"] "Apache 2"]
 [[environ "1.0.1"] "Eclipse Public License"]
 [[org.clojure/tools.namespace "0.2.10"] "Eclipse Public License 1.0"]
 [[com.taoensso/timbre "3.4.0"] "Eclipse Public License"]
 [[riddley "0.1.11"] "MIT License"]
 [[io.aviso/pretty "0.1.16"] "Apache Sofware License 2.0"]
 [[org.slf4j/slf4j-log4j12 "1.7.1"] "MIT License"]
 [[com.taoensso/encore "1.38.0"] "Eclipse Public License"]
 [[markdown-clj "0.9.67"] "Eclipse Public License"]
 [[slingshot "0.12.2"] "Eclipse Public License 1.0"]
 [[commons-codec "1.10"] "Apache License, Version 2.0"]
 [[joda-time "2.8.2"] "Apache 2"])
```

Test data provided by https://github.com/mohitbhatia1994/NumberToWords

## License

Copyright © 2016 Thomas van der Veen

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
