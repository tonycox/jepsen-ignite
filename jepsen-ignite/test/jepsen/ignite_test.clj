(ns jepsen.ignite-test
  (:require [clojure.test :refer :all]
            [jepsen.core :refer [run!]]
            [jepsen.ignite :refer :all]))

(deftest ignite-test-test
  (is (:valid? (:results (run! (ignite-test "1.9.0"))))))
