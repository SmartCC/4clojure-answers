#(case (count (apply str (map (fn [coll] (clojure.string/replace coll " " "")) %)))
   (3 44 5) false
   true)
