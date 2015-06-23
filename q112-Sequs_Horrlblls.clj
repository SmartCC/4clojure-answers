(fn [s xs] 
  (
   (fn a [xs n]
     (loop [xs xs h (first xs) res [],n n] 
       (if h 
         (if (sequential? h) 
           (conj res (a h n)) 
           (if (>= s (+ n h)) 
             (recur (next xs) (second xs) (conj res h) (+ n h)) 
             res)) 
         res))) 
   xs 0))
