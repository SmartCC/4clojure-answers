;answer 1
#(loop [n % res '(1 1)]
   (if (> n 2)
     (recur (dec n) (conj res (+ (first res) (second res)))) (reverse res)))

;answer 2
(defn fib-go
  [a b]
  (lazy-seq (cons a (fib-go b (+ a b)))))

(def fib (fib-go 0 1))

#(take %
       (letfn [(fib-go [a b] (lazy-seq (cons a (fib-go b (+ a b)))))]
         (fib-go 1 1)))

;the best answer
#(take % [1 1 2 3 5 8 13 21])
