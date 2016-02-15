(fn [f & xs] (let [t (group-by first (apply concat [] xs))]
   (zipmap (keys t) (map #(reduce f (map second %)) (vals t)))))
