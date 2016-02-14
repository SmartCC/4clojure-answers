(fn [suit]
  (fn [cards]
    (let [suit (if (nil? suit) (:suit (first cards)) suit)] 
      (->> (filter #(= (:suit %) suit) cards)
           (apply max-key :rank)))))
