(fn a
  ([f x xs] 
   (lazy-seq 
    (if-let [t (first xs)] 
               (cons x (a f (f x t) (rest xs))) [x])))
  ([f xs] 
   (a f (first xs) (next xs))))
