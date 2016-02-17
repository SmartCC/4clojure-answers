#(->> (group-by first (apply concat [] %&))
      (map (fn [[k v]] [k (reduce % (map second v))]))
      (into {}))
