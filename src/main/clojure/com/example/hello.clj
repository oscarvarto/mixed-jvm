(ns com.example.hello
  (:import [com.example M$Person])
  (:gen-class
    :name com.example.hello
    :main true))

(def rocky
  (M$Person. "Rocky" 42))

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))
