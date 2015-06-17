(fn [x & fs]
  (cons x 
        ((fn a [lx] 
           (lazy-seq 
            (let [fs (vec fs) 
                  t (map 
                     (fn [n] (reduce #(%2 %) lx (subvec fs 0 (inc n))))
                     (range (count fs)))]
              (concat t (a (last t))))))
         x)))
