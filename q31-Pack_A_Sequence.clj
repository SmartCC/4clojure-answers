#(loop [xs %,res ()] 
    (if (empty? xs) (reverse res)
    (let [x (first xs),coll (rest xs),resf (first res)]
      (if (= x (first resf)) 
        (recur coll (conj (rest res) (conj resf x) ))
        (recur coll (conj res (list x)))))))
