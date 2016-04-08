(ns numbers.convert)

(def dash "-")

(def data { 0 "zero"
            1 "one"
            2 "two"
            3 "three"
            4 "four"
            5 "five"
            6 "six"
            7 "seven"
            8 "eight"
            9 "nine"
            10 "ten"
            11 "eleven"
            12 "twelve"
            13 "thirteen"
            14 "fourteen"
            15 "fifteen"
            16 "sixteen"
            17 "seventeen"
            18 "eighteen"
            19 "nineteen"
            20 "twenty"
            30 "thirty"
            40 "forty"
            50 "fifty"
            60 "sixty"
            70 "seventy"
            80 "eighty"
            90 "ninety"
            100 "hundred"})


(declare convert)

(defn tens [n]
  (let [t (get data (* 10 (int (/ n 10))))
        r (mod n 10)]
    (if (zero? r)
       t
       (str t "-" (get data r)))))

(defn hundreds [n]
  (let [h (int (float (/ n 100)))
        r (mod n 100)
        s (str (get data h) " " (get data 100))]
    ;(println h r s)
    (if-not (zero? r)
      (str s " and " (convert r))
      s)))

(defn convert [n]
  "This function can only convert a valid number to words"
  {:pre [(and (<= 0 n) (<= n 1000))]}
  (cond
    (< n 21) (get data n)
    (< n 100) (tens n)
    (< n 1000) (hundreds n)
    (= n 1000) "one thousand"))
