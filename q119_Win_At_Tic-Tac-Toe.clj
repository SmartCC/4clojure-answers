(fn [piece broad]
  (let [p-indexed (map-indexed #(map-indexed (fn [idx p] [[% idx] p]) %2) broad)
        l (range 3)
        row-index (map #(map (fn [x] [% x]) l) l)
        col-index (map #(map (fn [x] [x %]) l) l)
        tra-index [[[0 0] [1 1] [2 2]] [[0 2] [1 1] [2 0]]]
        indexs (concat row-index col-index tra-index)
        coms (map #(map (fn [x] [x (get-in broad x)]) %) indexs)
        filter-coms (filter #(let [g (group-by second %)]
                               (and (= (count (g piece)) 2) (= (count (g :e)) 1))) coms)]
    (set (map first (filter #(= :e (second %)) (reduce concat [] filter-coms))))))
