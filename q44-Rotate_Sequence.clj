f (neg? n)
            (reverse (#(loop [n %,c %2] (if (> n 0) (recur (dec n) (-> (next c) vec (conj (first c)))) (seq c))) (- n) (reverse c)))
            (#(loop [n %,c %2] (if (> n 0) (recur (dec n) (-> (next c) vec (conj (first c)))) (seq c))) n c))
  )
