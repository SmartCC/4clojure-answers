(fn [coll] 
  (into #{} 
        (map (fn [[k v]] (set v)) 
             (filter (fn [[k v]] (> (count v) 1)) 
                     (#(group-by (fn [s] (apply str (sort (vec s)))) %) 
                      coll)))))
