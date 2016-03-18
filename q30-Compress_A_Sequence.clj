#(loop [s %,res []] (if (empty? s) res (recur (rest s) (if (= (first s) (last res)) res (conj res (first s))))))
