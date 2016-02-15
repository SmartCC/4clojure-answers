(fn [& fs] (fn [& arg] (loop [fs fs,res []] (if (empty? fs) res (recur (rest fs) (conj res (apply (first fs) arg)))))))
