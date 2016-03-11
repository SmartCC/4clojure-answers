(fn [x & more] (reduce #(if (> %2 %) %2 %) x more))
