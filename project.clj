(defproject numbers "0.1.0-SNAPSHOT"
  :description "Convert numbers to written words"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [midje "1.8.3"]
                 ;[com.taoensso/timbre "4.3.1"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.slf4j/slf4j-log4j12 "1.7.1"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]

                 [com.taoensso/tower "3.1.0-beta4"]]
  :main ^:skip-aot numbers.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
