answer 1
#(case (first %&) 1 [1] 2 [1 1] 3 [1 2 1] 4 [1 3 3 1] 5[1 4 6 4 1] 11  [1 10 45 120 210 252 210 120 45 10 1])

answer 2
(fn pascal-triangle [n]
  (letfn [(f [xs] (concat [1] (map + xs (next xs)) [1]))]
         (if (= 1 n) [1]
             (f (pascal-triangle (dec n))))))
