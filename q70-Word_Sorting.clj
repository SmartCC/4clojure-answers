(fn [s_#] (vec (
           (fn [x_#] (sort #(-> (.. (new java.lang.String (clojure.string/lower-case %)) (compareTo (clojure.string/lower-case %2))) (< 0)) x_#))
           (clojure.string/split s_# #"[ |.|!]"))))
