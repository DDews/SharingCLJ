(ns sharing.core
  (:gen-class))

(defn -main 
  "List strings in random order"
  [ & strings]
  (let [default ["Hi" "Hello" "Howdy" "Greetings" "Hey" "G'day" "Good day" "How are you" "What's up" "How goes it" "How do you do" "Hi there"]
        args (if strings strings default)]
      (run! println (shuffle args))
  )
)
