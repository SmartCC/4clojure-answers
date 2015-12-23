(fn
  [str-fn]
  (fn
  [x]
  (letfn [(sym-2-str [[k v]] {(str k) v})
          (fn-choose [f-sym] (case (str f-sym) "+" + "-" - "*" * "/" /))
          (eval-fn [f m] (if ((complement seq?) f)
                           (if (number? f) f (m (str f)))
                           (apply (fn-choose (first f)) (map eval-fn (next f) (repeat m)))
			   ))]
          (eval-fn str-fn (into {} (map sym-2-str x))))))
