(ns numbers.core-test
  (:require [midje.sweet :refer :all]
            [numbers.core :refer :all]
            [numbers.convert :refer :all]))

(def good-values
  (line-seq (clojure.java.io/reader "test_list.txt")))

(facts ""
  (doseq [i (range (count good-values))]
    (let [s (nth good-values i)]
      (fact ""
        ;(println i s)
        (convert i) => s))))

(fact "Convert numbers (int) to written numbers"
  (convert -1) => nil
  (convert 0) => "zero"
  (convert 1) => "one"
  (convert 2) => "two"
  (convert 20) => "twenty"
  (convert 21) => "twenty-one"
  (convert 22) => "twenty-two"
  (convert 99) => "ninety-nine"
  (convert 100) => "one hundred"
  (convert 101) => "one hundred and one"
  (convert 555) => "five hundred and fifty-five"
  (convert 999) => "nine hundred and ninety-nine"
  (convert 1000) => "one thousand"
  (convert 1001) => nil)


(fact "validate if a string is a valid number (0-1000) else return nil"
  (validate "0") => 0
  (validate "1") => 1
  (validate "-1") => nil
  (validate "asdf") => nil
  (validate "1000") => 1000
  (validate "1001") => nil)
