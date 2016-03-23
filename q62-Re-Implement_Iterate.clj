(fn my-lazy-seq [f x] (lazy-seq (concat [ x] (my-lazy-seq f (f x)))))
