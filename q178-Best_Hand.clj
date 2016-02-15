(fn [x]
  (let [suits (map first x)
        nums (sort (map #(case (second %) \T -3 \J -2 \Q -1 \K 0 \A 1 (- (int (second %)) 48)) x))
        g-n (set (map count (vals (group-by identity nums))))
        t (map - nums (next nums))]
    (case (apply max g-n)
      4 :four-of-a-kind
      3 (if (= #{2 3} g-n) :full-house :three-of-a-kind)
      2 (if (= 3 (count (set nums))) :two-pair :pair)
      1 (if (every? zero? (map inc t))
          (if (= 1 (count (set suits))) :straight-flush :straight)
          (if (= 1 (count (set suits))) :flush :high-card)))))
