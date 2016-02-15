#(loop [n %,res '()]
   (if (zero? n)
     (if (empty? res) '(0) res)
     (recur (int (/ n %2)) (conj res (mod n %2)))))
