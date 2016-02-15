(fn [xs]
  (apply hash-map
         (apply concat []
                (map #(if (keyword? (first %)) (interpose [] %) [%])
                     (partition-by keyword? xs)))))
