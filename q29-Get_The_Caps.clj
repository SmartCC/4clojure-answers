#(let [m (re-matcher #"[A-Z]" %)] (loop [match (re-find m), res []] (if match (recur (re-find m) (conj res match)) (reduce str res) )))
