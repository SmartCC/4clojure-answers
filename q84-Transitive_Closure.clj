(fn tc [s]
  (let [new-set
        (set
         (for [x s y s :when (and (not= x y)
                                  (or (= (x 0) (y 1)) (= (y 1) (x 0))))]
                       (if (= (x 0) (y 1)) [(y 0) (x 1)] [(x 0) (y 1)])))]
    (if (empty? (clojure.set/difference new-set s)) s (tc (into s new-set)))))
