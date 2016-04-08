(ns numbers.convert-test
  (:require [midje.sweet :refer :all]
            [numbers.convert :refer :all]))

(fact ""
  (convert 1) => "one"
  (convert 2) = "two")
