(println "Hello world")

(println (+ 7654 1234))

(println (/ (* (+ 7 3) (+ 4 5)) 10))

(defn hello-world [] "Hello world")
(println (hello-world))

(defn greet [name] (str "Hello, " name))
(println (greet "Borat"))

(defn hello2
  ([] "Hello")
  ([name] (str "Hello, " name)))
(println (hello2))
(println (hello2 "Håvard"))
