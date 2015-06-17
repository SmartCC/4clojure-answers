(fn [f c xs] 
  (if-let [h1 (first xs)] 
    (cons h1 (
              (fn a [xs] 
                (lazy-seq 
                 (if-let [o (second xs)] 
                   (let [res (next xs)
                         h (first xs)
                         r (if (f h o) [c o] [o])]
                     (concat r (a res)))))) xs))))
