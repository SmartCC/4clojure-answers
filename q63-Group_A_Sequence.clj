(fn [f c] (let [s (set (map f c))] (zipmap s (map #(vec (filter (fn [x] (= % (f x))) c)) s))))
