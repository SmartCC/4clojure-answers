(fn [t]
  (let
      [c0 (map first t)
       c1 (map second t)
       c2 (map last t)
       tra0 (map #(get-in t %) [[0 0] [1 1] [2 2]])
       tra1 (map #(get-in t %) [[0 2] [1 1] [2 0]])
       t (conj t c0 c1 c2 tra0 tra1)]
    (some #(if (or
                (= :e (first %))
                (< 1 (count (distinct %))))
             nil
             (first %)) t)))
