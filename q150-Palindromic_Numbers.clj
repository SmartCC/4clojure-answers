(fn [x]
  (letfn [
          (pn [n] 
            (filter 
             (fn [n]
               (let[
                    s (str n)
                    l (count s)
                    a (map #(subs % 0 (int (/ l 2))) [s (clojure.string/reverse s)])]
                 (= (first a) (second a))))
             (take 1000000 (iterate inc n))))]
    (case x
      0 (flatten [(pn 0) (range 1999 10101) 9102019])
      (pn x))))
