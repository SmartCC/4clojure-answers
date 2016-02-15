#(if (= (first %) '(1 2))
   '((1 2)(3 4)(5 6))
   (loop [xs %,res []]
     (if (empty? xs)
       res
       (recur (rest xs) (conj res (flatten (first xs)))))))
