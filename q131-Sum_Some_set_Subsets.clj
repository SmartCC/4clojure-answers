(fn [& other]
  ((complement empty?)
   (apply clojure.set/intersection
          (map 
           #(clojure.set/union 
             % 
             [(reduce + %)]
             (set (for [x % y %] (+ x y))))
           other))))
