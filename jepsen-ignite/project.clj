(defproject jepsen.ignite "0.0.1-SNAPSHOT"
  :description "Ignite tests"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [jepsen "0.1.4"]
                 [javax.cache/cache-api "1.0.0"]
                 [org.apache.ignite/ignite-core "2.0.0"]
                 [org.apache.ignite/ignite-spring "2.0.0"]
                 [org.apache.ignite/ignite-log4j "2.0.0"]
                 [org.apache.ignite/ignite-indexing "2.0.0"]])
