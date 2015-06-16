#(reify clojure.lang.Seqable 
   (seq [this] (seq (take (count (set %&)) %&)))
   (toString [this] (apply str (interpose ", " (sort %&)))))
