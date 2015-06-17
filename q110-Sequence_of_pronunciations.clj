(fn a [xs] 
  (lazy-seq 
   (let [t 
         (flatten (map #(vec [(count %) (first %)]) 
                       (partition-by #(int %) xs)))] 
     (cons t (a t)))))
