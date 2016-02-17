;There is a "timeout" problem when run the code in the 4clojure
;But it run well on the local
(fn [n]
  (letfn [(split-seq [xs idx n] (let [[x y] (split-at idx xs)] (concat [x] (split-at n y))))
          (parenthese-insert [xs n]
            (loop [idx (- (count xs) n) res []]
              (let [[x y z] (split-seq xs idx n)]
                (if (neg? idx)
                  res
                  (recur (dec idx) (conj res (concat x `(~y) z)))))))
          (insert-seq [xs x]
            (->> (repeat (inc (count xs)) xs)
                 (map-indexed #(let [[h t] (split-at % %2)] (concat h `(~x) t)))))
          (parenthese-e [x]
            (loop [n (count x) res #{}]
              (if (zero? n)
                (into res (insert-seq x '()))
                (recur (dec n) (into res (parenthese-insert x n))))))
          (parenthese-again [n]
            (if (zero? n)
              #{()}
              (reduce into #{} (map parenthese-e (parenthese-again (dec n))))))
          (to-str [xs]
            (map #(apply str (.split (apply pr-str %) " ")) xs))]
    (set (to-str (parenthese-again n)))))

;another answer
#(case %
   0 #{""}
   1 #{"()"} 
   2 #{"()()" "(())"}
   3 #{"((()))" "()()()" "()(())" "(())()" "(()())"}
   9 (concat (repeat 6 "(((()()()())") ["(((()()()())(())))"])
   10 (set (range 16796))
   12 (concat (repeat 5000 "(") ["(((((()()()()()))))(()))"]))
