(ns numbers.core
  (:use numbers.convert)
  (:require [clojure.tools.logging :as log]
            [taoensso.tower  :as tower])
  (:gen-class))

(def my-tconfig
  {:dictionary
    {:en-GB "en_GB.clj"
     :nl    "nl_NL.clj"}
   :dev-mode? true
   :fallback-locale :en-GB})

(def pt (tower/make-t my-tconfig))

(defn- exit-program []
  (log/info "Exiting program")
  (System/exit 0))

(defn- get-user-input []
  (println (pt :en_GB :example/user-input))
  (read-line))

(defn validate [input]
  (log/info (str "Validating use input " input))
  (try
    (let [number (Integer/parseInt input)]
      (if (and (<= 0 number) (<= number 1000))
        (do
          (log/info "Valid number " number)
          number)
        (do
          (log/info "Number to small or big " number)
          nil)))
   (catch Exception e (log/info "Failed to parse input, not a number: " input))))

(defn- main-loop []
 (loop [user-input (get-user-input)]
    (log/info (str "User input: " user-input))
    (if (= user-input "exit")
      (exit-program)
      (do
        (when-let [valid-user-input (validate user-input)]
          (println (convert valid-user-input)))
        (recur  (get-user-input))))))


(defn -main
  [& args]
  (log/info "Started program")
  (println (pt :en_GB :example/welcome))
  (main-loop))
