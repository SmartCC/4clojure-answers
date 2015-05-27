(fn [x n] (loop [m (first x), res []] (if (> (+ n (first x)) m) (recur (inc m) (conj res (filter #(= (mod m n) (mod % n)) x))) res)))
