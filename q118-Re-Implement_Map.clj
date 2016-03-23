(fn g [f xs] (lazy-seq (if (empty? xs) [] (concat (vector (f (first xs))) (g f (rest xs))))))
