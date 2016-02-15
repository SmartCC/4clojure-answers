#(fn [& x] (loop [fs %, x x] (if (fn? fs) (recur (fs (first x)) (rest x)) fs)))
