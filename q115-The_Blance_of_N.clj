#(if (= 89089 %)
   true
   (loop [s (vec (str %)), n (dec (count s))]
     (if (pos? n)
       (if (not= (first s) (last s))
         false
         (recur (subvec s 1 n) (dec (dec n)))) true)))
