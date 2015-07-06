#((fn graph-con [gs] 
    (if (= 1 (count gs)) 
      true 
      (letfn [(v-inc? [g]
                ((complement empty?) (clojure.set/intersection (first gs) g)))] 
        (let [bg (filter v-inc? (rest gs))
              gs (remove v-inc? (rest gs))] 
          (if (empty? bg)
            false
            (graph-con (cons (reduce clojure.set/union bg) gs))) ))))
  (map set %))
