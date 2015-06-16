(fn [coll] 
  (= (count 
      (flatten 
       (map vec 
            (#(for [x % y % :while (not= x y)] (clojure.set/intersection x y)) 
             coll)))) 0))
