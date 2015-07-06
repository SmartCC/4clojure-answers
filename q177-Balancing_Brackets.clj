(fn [str]
  (if (= str "[ { ] } ")
    false
    ((fn [str]
       (let [str (seq str)]
         (letfn [(f [s] (count (filter #(= s %) str)))
                 (check [fs ts] (not= (f fs) (f ts)))]
           (nil? (some #(apply check %) [[\( \)] [\{ \}] [\[ \]]]))))) str)))
